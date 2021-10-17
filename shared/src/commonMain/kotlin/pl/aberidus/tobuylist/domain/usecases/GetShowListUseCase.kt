package pl.aberidus.tobuylist.domain.usecases

import pl.aberidus.tobuylist.domain.base.UseCase
import pl.aberidus.tobuylist.domain.models.ShopItem
import pl.aberidus.tobuylist.domain.repositories.ShopItemsRepository

class GetShowListUseCase(private val shopItemsRepository: ShopItemsRepository) :
    UseCase<Unit, List<ShopItem>>() {
    override suspend fun execute(param: Unit): List<ShopItem> =
        shopItemsRepository.getItemsList()
}