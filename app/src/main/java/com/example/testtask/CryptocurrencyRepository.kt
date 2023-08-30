package com.example.testtask

interface CryptocurrencyRepository {
    fun getCryptoCurrency(): List<Cryptocurrency>
}