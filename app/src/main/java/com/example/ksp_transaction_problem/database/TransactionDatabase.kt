package com.example.ksp_transaction_problem.database

interface TransactionDatabase {

    fun runInTransaction(runnable: Runnable)
}