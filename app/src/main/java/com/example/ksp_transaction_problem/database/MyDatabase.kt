package com.example.ksp_transaction_problem.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.ksp_transaction_problem.entity.MyFirstEntity
import com.example.ksp_transaction_problem.entity.MySecondEntity

@Database(
    entities = [MyFirstEntity::class, MySecondEntity::class],
    version = 228,
    exportSchema = false
)
abstract class MyDatabase : RoomDatabase(), DatabaseWithDaos {

}