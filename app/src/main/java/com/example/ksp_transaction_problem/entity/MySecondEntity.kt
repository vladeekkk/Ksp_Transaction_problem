package com.example.ksp_transaction_problem.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MySecondEntity(
    @PrimaryKey
    val kek: String = ""
)
