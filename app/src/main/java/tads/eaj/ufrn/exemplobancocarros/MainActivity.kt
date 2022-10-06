package tads.eaj.ufrn.exemplobancocarros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val banco = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "banco_da_aula.sqlite"
            )
            .allowMainThreadQueries()
            .build()

        banco.carroDao().insert(Carro(2000, "Corsa", "Vermelho", 20000))
        val listaCarros = banco.carroDao().listAll()

        for (c in listaCarros){
            Log.i("AULA", c.toString())
        }
    }
}