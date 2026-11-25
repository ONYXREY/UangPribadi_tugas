package com.kevin.keuanganpribadi_tugas

enum class TransactionType {
    INCOME, EXPENSE
}

data class Category(
    val id: String,
    val name: String,
    val type: TransactionType
)

data class Transaction(
    val id: String,
    val title: String,
    val amount: Long,
    val type: TransactionType,
    val categoryId: String,
    val timestampMillis: Long = System.currentTimeMillis(),
    val note: String = ""
)