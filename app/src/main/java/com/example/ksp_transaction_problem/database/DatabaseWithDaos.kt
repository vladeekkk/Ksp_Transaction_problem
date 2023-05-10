package com.example.ksp_transaction_problem.database

import com.example.ksp_transaction_problem.dao.MyFirstDao
import com.example.ksp_transaction_problem.dao.MySecondDao

interface DatabaseWithDaos : TransactionDatabase {

    val myFirstDao: MyFirstDao
    val mySecondDao: MySecondDao
}