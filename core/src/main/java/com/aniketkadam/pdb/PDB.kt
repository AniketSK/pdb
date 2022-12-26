package com.aniketkadam.pdb

import android.app.Application
import com.aniketkadam.pdb.data.Pokemon

public interface PDB {
    fun init(application : Application) : PDB

    suspend fun getPokemon() : List<Pokemon>
    suspend fun getPokemonByType() : List<Pokemon>
}