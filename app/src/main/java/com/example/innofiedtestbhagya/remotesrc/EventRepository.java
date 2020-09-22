package com.example.innofiedtestbhagya.remotesrc;

import android.util.Log;

import com.example.innofiedtestbhagya.model.ApiResponseModel;

import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EventRepository {
    public static EventRepository eventRepository;

    public static EventRepository getInstance() {
        if (eventRepository == null) {
            eventRepository = new EventRepository();
        }
        return eventRepository;
    }

    private APIClient allApi;

    public EventRepository() {
        allApi = RetrofitService.createService(APIClient.class);
    }

    public MutableLiveData<ApiResponseModel> requestAllEvent() {
        final MutableLiveData<ApiResponseModel> responseMutableLiveData = new MutableLiveData<>();
        allApi.getAllEvents().enqueue(new Callback<ApiResponseModel>() {
            @Override
            public void onResponse(Call<ApiResponseModel> call, Response<ApiResponseModel> response) {
                ApiResponseModel res = response.body();
                if (res != null) {
                    responseMutableLiveData.setValue(res);
                } else {
                    responseMutableLiveData.setValue(null);
                }
            }

            @Override
            public void onFailure(Call<ApiResponseModel> call, Throwable t) {
                responseMutableLiveData.setValue(null);
                Log.d("Event123", "EventRepository >> requestAllEvent >> onFailure");
            }
        });

        return responseMutableLiveData;
    }
}
