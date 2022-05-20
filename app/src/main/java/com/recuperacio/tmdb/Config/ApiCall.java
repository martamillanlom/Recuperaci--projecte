package com.recuperacio.tmdb.Config;

import com.recuperacio.tmdb.Model.Film.searchFilmModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiCall {

    @GET("search/movie?")
    Call<searchFilmModel> getData(@Query("api_key") String api_key, @Query("query") String query);

}
