package com.example.takesnote.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.takesnote.ui.theme.BabyBlue
import com.example.takesnote.ui.theme.LightGreen
import com.example.takesnote.ui.theme.RedOrange
import com.example.takesnote.ui.theme.RedPink
import com.example.takesnote.ui.theme.Violet

@Entity
data class Note(
    val title:String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object{
        val noteColor = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
