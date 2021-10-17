package pl.aberidus.tobuylist.list

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import pl.aberidus.tobuylist.R
import pl.aberidus.tobuylist.databinding.FragmentMainBinding
import pl.aberidus.tobuylist.domain.models.ShopItem
import pl.aberidus.tobuylist.extensions.launchAndRepeatWithViewLifecycle
import pl.aberidus.tobuylist.extensions.log
import pl.aberidus.tobuylist.models.ErrorResult

@AndroidEntryPoint
class MainFragment : Fragment(R.layout.fragment_main) {

    private lateinit var binding: FragmentMainBinding
    private val viewModel by viewModels<MainViewModel>()
    private lateinit var mainAdapter: MainListAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        mainAdapter = MainListAdapter()

        with(binding.toBuyList) {
            adapter = mainAdapter
            layoutManager = StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL)
        }
        binding.addItemButton.setOnClickListener {
            viewModel.onAddClicked()
        }

        subscribe()
    }

    private fun subscribe() {
        launchAndRepeatWithViewLifecycle {
            viewModel.shopList.collect { list: List<ShopItem> ->
                onSuccess(list)
            }
        }

        launchAndRepeatWithViewLifecycle {
            viewModel.loading.collect { display ->
                onLoading(display)
            }
        }

        launchAndRepeatWithViewLifecycle {
            viewModel.errorResult.collect { errorResult: ErrorResult ->
                onError(errorResult)
            }
        }
    }

    private fun onLoading(display: Boolean) {
        if (display) binding.loadingIndicator.show() else binding.loadingIndicator.hide()
    }

    private fun onSuccess(shopItems: List<ShopItem>) {
        mainAdapter.load(shopItems)
    }


    private fun onError(errorResult: ErrorResult) {
        if (!errorResult.display) return

        log("onError New error occurred ${errorResult.message}")
    }
}

