package pl.aberidus.tobuylist.domain.usecases

import pl.aberidus.tobuylist.domain.base.UseCase
import pl.aberidus.tobuylist.domain.models.ShopItem
import pl.aberidus.tobuylist.domain.repositories.ShopItemsRepository

class AddNewItemUseCase(private val shopItemsRepository: ShopItemsRepository) :
    UseCase<ShopItem, Unit>() {
    override suspend fun execute(param: ShopItem): Unit = shopItemsRepository.addNewItem(param)

}