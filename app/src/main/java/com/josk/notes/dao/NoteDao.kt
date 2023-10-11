package com.josk.notes.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.josk.notes.entity.Note

@Dao
interface NoteDao {

    @get:Query("SELECT * FROM notes ORDER BY  id DESC")
    val notesList: List<Note>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addNote(note: Note)

    @Delete
    fun deleteNode(note: Note)
}