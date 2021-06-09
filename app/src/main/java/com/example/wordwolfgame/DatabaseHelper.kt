package com.example.wordwolfgame

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log

class DatabaseHelper(context: Context): SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    // To declare private variable
    companion object {
        // Name of database file
        private const val DATABASE_NAME = "words.db"
        // Version of database
        private const val DATABASE_VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase) {
        Log.i("DatabaseHelper", "Called onCreate()")
        // SQL statement to create table
        val sb = StringBuilder()
        sb.append("CREATE TABLE words (")
        sb.append("_id INTEGER PRIMARY KEY,")
        sb.append("name TEXT,")
        sb.append("description TEXT")
        sb.append(");")

        // Execute the SQL
        db.execSQL(sb.toString())
        Log.i("DatabaseHelper", "Created table.")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        Log.i("DatabaseHelper", "Called onUpgrade()")
    }
}