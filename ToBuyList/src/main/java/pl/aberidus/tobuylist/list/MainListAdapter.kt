package pl.aberidus.tobuylist.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import pl.aberidus.tobuylist.R
import pl.aberidus.tobuylist.databinding.ItemToBuyRowBinding
import pl.aberidus.tobuylist.domain.models.ShopItem

class MainListAdapter(private var list: List<ShopItem> = listOf()) :
    ListAdapter<ShopItem, MainListAdapter.MainListViewHolder>(MainListDiffUtil) {

    fun load(newList:List<ShopItem>){
        list = newList
        submitList(newList)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return LoadedRow(view)
    }

    override fun onBindViewHolder(holder: MainListViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemViewType(position: Int): Int = R.layout.item_to_buy_row

    override fun getItemCount(): Int = list.size

    class LoadedRow(view: View) : MainListViewHolder(view) {
        private  val binding = ItemToBuyRowBinding.bind(view)

        override fun bind(shopItem: ShopItem) {
            binding.titleTxT.text = shopItem.name
        }

    }

    abstract class MainListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        abstract fun bind(shopItem: ShopItem)
    }

    object MainListDiffUtil : DiffUtil.ItemCallback<ShopItem>() {


        override fun areItemsTheSame(oldShopItem: ShopItem, newShopItem: ShopItem): Boolean =
            oldShopItem == newShopItem


        override fun areContentsTheSame(oldShopItem: ShopItem, newShopItem: ShopItem): Boolean =
            oldShopItem.name == newShopItem.name
    }
}