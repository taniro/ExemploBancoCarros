package tads.eaj.ufrn.exemplobancocarros

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = arrayOf(Carro::class), version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun carroDao():CarroDao
}