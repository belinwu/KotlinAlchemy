package com.istudio.app.modules.module_demos.flows.modules.flow_basics.state

import com.istudio.app.data.mock.Stock

sealed class UiState {
    data object Loading : UiState()
    data class Success(val stockList: List<Stock>) : UiState()
    data class Error(val message: String) : UiState()
}