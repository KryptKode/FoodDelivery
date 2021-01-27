package com.kryptkode.shopping.ui.list

import com.airbnb.mvrx.MavericksState
import com.kryptkode.shopping.model.Showcase

data class ShoppingState(
    val showCase: List<Showcase> = emptyList(),
    val showCaseBackground: String = "",
    val tabs: List<String> = emptyList(),
) : MavericksState
