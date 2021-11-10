package at.modoo.mysecretwalkinggems.db

import android.graphics.Bitmap
import androidx.room.Entity

@Entity(tableName = "running_table")
data class Run(
    var img: Bitmap? = null,
    var timestamp: Long = 0L
)
