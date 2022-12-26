package com.aniketkadam.pdb.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.JsonClass

@Entity
@JsonClass(generateAdapter = true)
public data class Pokemon(
    @PrimaryKey
    val id : Int,
    val name : String,
    val types : List<PokemonType> = emptyList(),
    val atk : Int,
    val sta : Int,
    val def : Int,
    val description : String?
)