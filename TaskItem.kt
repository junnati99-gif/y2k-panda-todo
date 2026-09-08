package com.example.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class TaskItem(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val boardId: String = "main",
    val title: String,
    val note: String = "",
    val isCompleted: Boolean = false,
    val priority: String = "High Key 🔥",
    val tag: String = "Quest 🌟",
    val assignedTo: String = "You",
    val dueTimeText: String = "Today 6:00 PM",
    val reactions: String = "🔥,💅",
    val createdAt: Long = System.currentTimeMillis()
)

@Entity(tableName = "boards")
data class BoardItem(
    @PrimaryKey val id: String,
    val name: String,
    val emoji: String,
    val isCollaborative: Boolean = false,
    val members: String = "You",
    val shareCode: String = "#SLAY-777"
)