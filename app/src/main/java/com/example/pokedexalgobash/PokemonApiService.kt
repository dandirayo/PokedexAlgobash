package com.example.pokedexalgobash

import android.telecom.Call


interface PokemonApiService {
    @GET("pokemon/")
    fun getPokemonList(): Call<PokemonListResponse>

    @GET("pokemon/{idOrName}/")
    fun getPokemonDetail(@Path("idOrName") idOrName: String): Call<PokemonDetail>
}
