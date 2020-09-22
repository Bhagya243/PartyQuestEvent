package com.example.innofiedtestbhagya.viewmodel;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import com.example.innofiedtestbhagya.model.ApiResponseModel;
import com.example.innofiedtestbhagya.model.EventModel;
import com.example.innofiedtestbhagya.remotesrc.EventRepository;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

public class EventListActivityViewModel extends AndroidViewModel {
    private EventRepository eventRepository;
    private MutableLiveData<ApiResponseModel> requestEventData;
    public MutableLiveData<List<EventModel>> listEvent;
    private Context context;

    public EventListActivityViewModel(@NonNull Application application) {
        super(application);
        context=application;
    }

    public void init(){
        eventRepository=EventRepository.getInstance();
        requestEventData=new MutableLiveData<>();
        listEvent=new MutableLiveData<>();
    }

    public void getEventData(){
        requestEventData=eventRepository.requestAllEvent();
        requestEventData.observeForever(new Observer<ApiResponseModel>() {
            @Override
            public void onChanged(ApiResponseModel responseModel) {
                if(responseModel!=null){
                    if(responseModel.getMessageCode()==1){
                        listEvent.setValue(responseModel.getEventModel());
                    }
                }else {
                    Toast.makeText(context, "Error From Server", Toast.LENGTH_LONG).show();
                    listEvent.setValue(null);
                }

            }
        });
    }
}
