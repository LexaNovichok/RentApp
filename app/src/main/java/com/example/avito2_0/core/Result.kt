package com.example.avito2_0.core

sealed class Result {
    data object Success : Result()
    data class Error(val message: String) : Result()
}