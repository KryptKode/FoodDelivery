package com.kryptkode.shopping.ui.list

import com.airbnb.mvrx.MavericksViewModel
import com.airbnb.mvrx.MavericksViewModelFactory
import com.airbnb.mvrx.ViewModelContext
import com.kryptkode.shopping.mock.MockDataProvider
import com.kryptkode.shopping.model.Showcase
import org.koin.android.ext.android.inject


class ShoppingListViewModel constructor(
    private val mockDataProvider: MockDataProvider,
    initialState: ShoppingState
) : MavericksViewModel<ShoppingState>(initialState) {

    init {
        setState {
            copy(
                showCase = listOf(
                    Showcase("Hibrida noceres,",
                    "Ferox habenas ducunt ad adiurator."),
                    Showcase("Dexter imbers ",
                        "Abactors velum, tanquam audax idoleum."),
                    Showcase("Ho-ho-ho!",
                        "Beauty, greed, and adventure."),

                ),
                showCaseBackground = "https://source.unsplash.com/1000x800/?cocacola",
                tabs = listOf("Pizza", "Sushi", "Drinks")
            )
        }
    }

    companion object : MavericksViewModelFactory<ShoppingListViewModel, ShoppingState> {
        override fun create(
            viewModelContext: ViewModelContext,
            state: ShoppingState
        ): ShoppingListViewModel {
            val repository: MockDataProvider by viewModelContext.activity.inject()
            return ShoppingListViewModel(repository, state)
        }
    }

}
