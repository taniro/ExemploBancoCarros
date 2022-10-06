package tads.eaj.ufrn.exemplobancocarros

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "carros_tbl")
data class Carro(
    @ColumnInfo (name = "ano_fabricacao") var anoFabricacao:Int,
    var modelo:String,
    var cor:String,
    @ColumnInfo (name = "km_rodados")var kmRodados:Int
)
{
    @PrimaryKey (autoGenerate = true) var id:Long = 0

    //métodos da minha lógica de negócio
    fun rodarKilometros(){
        this.kmRodados += 1000
    }
}