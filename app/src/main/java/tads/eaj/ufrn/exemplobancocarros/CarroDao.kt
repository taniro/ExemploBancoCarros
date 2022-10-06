package tads.eaj.ufrn.exemplobancocarros

import androidx.room.*

@Dao
interface CarroDao {
    @Insert
    fun insert(vararg c:Carro)

    @Delete
    fun delete(c:Carro)

    @Update
    fun update(c:Carro)

    @Query("SELECT * FROM carros_tbl")
    fun listAll():List<Carro>

    @Query("SELECT * FROM carros_tbl WHERE id = :idBusca")
    fun findById(idBusca:Long):Carro?
}