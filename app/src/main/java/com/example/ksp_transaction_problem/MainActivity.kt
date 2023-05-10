package com.example.ksp_transaction_problem

import android.app.Activity
import android.os.Bundle
import com.example.ksp_transaction_problem.database.DatabaseWithDaos
import com.example.ksp_transaction_problem.database.MyDatabase
import com.example.ksp_transaction_problem.database.MyDatabase_Impl

class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val db = MyDatabase_Impl() as DatabaseWithDaos
        db.runInTransaction(Runnable {
            // do stuff with multiple DAO's in ONE transaction
//            kek.myFirstDao.updateSmth()
//            kek.mySecondDao.deleteSmth()
        })
    }
}