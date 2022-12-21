package com.oleg.lec16.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.oleg.lec16.data.dao.PersonDao
import com.oleg.lec16.data.entities.Person


private const val DB_NAME = "Lec16DB"

@Database(entities = [Person::class], version = 1)
abstract class Lec16DB:RoomDatabase() {
    abstract fun peopleDao():PersonDao
    companion object {
        fun getDB(context: Context): Lec16DB {

            val db = Room.databaseBuilder(
                context,
                Lec16DB::class.java, DB_NAME
            ).allowMainThreadQueries().build()
            return db
        }
    }
}