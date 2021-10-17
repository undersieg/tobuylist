package pl.aberidus.tobuylist.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import pl.aberidus.tobuylist.domain.models.ShopItem
import pl.aberidus.tobuylist.domain.usecases.AddNewItemUseCase
import pl.aberidus.tobuylist.domain.usecases.GetShowListUseCase
import pl.aberidus.tobuylist.models.ErrorResult
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val addNewItemUseCase: AddNewItemUseCase,
    private val getShowListUseCase: GetShowListUseCase
) : ViewModel() {

    private val _shopList = MutableStateFlow<List<ShopItem>>(listOf())
    val shopList: StateFlow<List<ShopItem>> get() = _shopList

    private val _loading = MutableStateFlow<Boolean>(false)
    val loading: StateFlow<Boolean> get() = _loading

    private val _error = MutableStateFlow<ErrorResult>(ErrorResult())
    val errorResult: StateFlow<ErrorResult> get() = _error

    init {
        viewModelScope.launch { loadInitList() }
    }


    suspend fun loadInitList() {
        try {
            _loading.emit(true)
            delay(5000)
            val list = getShowListUseCase.execute(Unit)
            _shopList.emit(list)
        } catch (t: Throwable) {
            _error.emit(ErrorResult(t.message.toString(), true))
        } finally {
            _loading.emit(false)
        }

    }

    fun onAddClicked() {

    }
}