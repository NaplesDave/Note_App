package com.example.noteapp.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

// SQLite database table creation for notes table
@Entity(tableName = "note_table")
class Note(val title : String, val description : String) {

    @PrimaryKey(autoGenerate = true)
    var id = 0

}