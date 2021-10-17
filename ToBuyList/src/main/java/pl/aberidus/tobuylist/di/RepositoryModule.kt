package pl.aberidus.tobuylist.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import pl.aberidus.tobuylist.data.repositories.ShopItemsRepositoryImpl
import pl.aberidus.tobuylist.domain.repositories.ShopItemsRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideShopItemsRepository(): ShopItemsRepository = ShopItemsRepositoryImpl()
}