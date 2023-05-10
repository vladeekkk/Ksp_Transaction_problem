package com.example.ksp_transaction_problem.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MyFirstEntity(
    @PrimaryKey
    val kek: String = ""
)
