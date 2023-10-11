package com.josk.notes.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "Notes")
class Note : Serializable {

    @PrimaryKey(autoGenerate = true)
    var id: Int? = null

    @ColumnInfo("title")
    var title: String? = null

    @ColumnInfo("content")
    var content: String? = null

    @ColumnInfo("image_path")
    var imagePath: String? = null

    @ColumnInfo("color")
    var color: String? = null

    @ColumnInfo("date_time")
    var dateTime: String? = null

    override fun toString(): String {
        return "${title}: ${dateTime}"
    }
}