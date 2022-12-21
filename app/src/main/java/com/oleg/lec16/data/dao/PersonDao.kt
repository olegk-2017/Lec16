package com.oleg.lec16.data.dao


import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.oleg.lec16.data.entities.Person

@Dao
interface PersonDao {
    //CRUD = CREATE READ UPDATE DELETE
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun add(person: Person)

    @Insert
    fun insertAll(vararg people: Person)

    @Insert
    fun insertAll(people: List<Person>)

    @Query("SELECT * FROM Person")
    fun getPeople(): List<Person>

    @Query("SELECT * FROM Person WHERE id = :id")
    fun getPersonById(id: Int): Person

    //getPersonByName('moe%')

    @Query("SELECT * FROM Person WHERE first_name LIKE :name OR last_name LIKE :name")
    fun getPersonByName(name: String): Person

    @Update
    fun update(person: Person)

    @Delete
    fun delete(person: Person)
}
