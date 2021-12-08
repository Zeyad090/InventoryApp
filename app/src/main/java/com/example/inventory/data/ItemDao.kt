package com.example.inventory.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
abstract class ItemDao {
@Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: Item) {
}

        @Update
        suspend fun update(item: Item){}

        @Delete
        suspend fun delete(item: Item){}



    @Query  ("SELECT * from item WHERE id = :id")
    abstract fun getItem(id: Int): Flow<Item>


    @Query("SELECT * from item ORDER BY name ASC")
    abstract fun getItems(): Flow<List<Item>>

}