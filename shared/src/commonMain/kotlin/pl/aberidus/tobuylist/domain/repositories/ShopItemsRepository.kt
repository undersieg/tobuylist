package pl.aberidus.tobuylist.domain.repositories

import pl.aberidus.tobuylist.domain.models.ShopItem

interface ShopItemsRepository {
    suspend fun getItemsList(): List<ShopItem>
    suspend fun addNewItem(shopItem: ShopItem)
}