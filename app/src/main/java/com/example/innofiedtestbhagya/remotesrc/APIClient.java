package com.example.innofiedtestbhagya.remotesrc;

import com.example.innofiedtestbhagya.model.ApiResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIClient {
    @GET("api_get_all_events.php")
    Call<ApiResponseModel> getAllEvents();
}
