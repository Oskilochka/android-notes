package com.josk.notes.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.josk.notes.dao.NoteDao
import com.josk.notes.entity.Note

@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class NoteDB : RoomDatabase() {

    companion object {
        var notesDB: NoteDB? = null

        @Synchronized
        fun getDB(context: Context): NoteDB {
            if (notesDB != null) {
                notesDB = Room.databaseBuilder(
                    context,
                    NoteDB::class.java,
                    "notes.db"
                ).build()
            }
            return notesDB!!
        }
    }

    abstract fun noteDao(): NoteDao
}