package pl.aberidus.tobuylist.data.repositories

import pl.aberidus.tobuylist.domain.models.ShopItem
import pl.aberidus.tobuylist.domain.repositories.ShopItemsRepository

class ShopItemsRepositoryImpl : ShopItemsRepository {
    override suspend fun getItemsList(): List<ShopItem> {
        return listOf(
            ShopItem("Test 1"),
            ShopItem("Test long name 2 "),
            ShopItem("Test another name 3"),
            ShopItem("Test another long name 4"),
            ShopItem("Test maybe last one 5"),
            ShopItem("Test last one 6")
        )
        TODO("Not yet implemented")
    }

    override suspend fun addNewItem(shopItem: ShopItem) {
        TODO("Not yet implemented")
    }
}