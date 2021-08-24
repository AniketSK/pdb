package com.aniketkadam.pdb.data

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.junit.Test
import com.squareup.moshi.Types

class PokemonTest {

    @Test
    fun what() {
        val moshi = Moshi.Builder()
            .addLast(KotlinJsonAdapterFactory())
            .build()

        val type = Types.newParameterizedType(List::class.java, Pokemon::class.java)
        val adapter = moshi.adapter<List<Pokemon>>(type)

        val pokemon: List<Pokemon>? = adapter.fromJson(getTextInFile("all.json"))

        assert(pokemon?.size ?: 0 > 0)
    }
}

fun getTextInFile(fileName: String): String? =
    ClassLoader.getSystemResourceAsStream(fileName)?.bufferedReader().use { it?.readText() }