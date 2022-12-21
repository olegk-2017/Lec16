package com.oleg.lec16.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity //(tableName = "people")
data class Person(
    @PrimaryKey (autoGenerate = true) val id:Int = 0,
    @ColumnInfo(name = "first_name") val firstName:String,
    @ColumnInfo(name = "last_name")val lastName:String
    )
{
    constructor(firstName:String,lastName:String): this(0,firstName,lastName)
}
