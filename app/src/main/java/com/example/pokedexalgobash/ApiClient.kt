package com.example.pokedexalgobash

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    private const val BASE_URL = "https://pokeapi.co/api/v2/"

    val pokemonApiService: PokemonApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PokemonApiService::class.java)
    }
}
