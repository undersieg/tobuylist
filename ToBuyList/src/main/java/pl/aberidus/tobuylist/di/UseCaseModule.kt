package pl.aberidus.tobuylist.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pl.aberidus.tobuylist.domain.repositories.ShopItemsRepository
import pl.aberidus.tobuylist.domain.usecases.AddNewItemUseCase
import pl.aberidus.tobuylist.domain.usecases.GetShowListUseCase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Singleton
    @Provides
    fun providerAddNewItem(shopItemsRepository: ShopItemsRepository): AddNewItemUseCase =
        AddNewItemUseCase(shopItemsRepository)

    @Singleton
    @Provides
    fun provideGetShowList(shopItemsRepository: ShopItemsRepository): GetShowListUseCase =
        GetShowListUseCase(shopItemsRepository)
}