package com.example.innofiedtestbhagya.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.innofiedtestbhagya.R;
import com.example.innofiedtestbhagya.adapter.EventListAdapter;
import com.example.innofiedtestbhagya.databinding.ActivityEventListBinding;
import com.example.innofiedtestbhagya.model.EventModel;
import com.example.innofiedtestbhagya.viewmodel.EventListActivityViewModel;

import java.util.List;

public class EventListActivity extends AppCompatActivity {
private ActivityEventListBinding eventListBinding;
private EventListActivityViewModel eventListActivityViewModel;
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        eventListBinding = DataBindingUtil.setContentView(this,R.layout.activity_event_list);
        eventListBinding.setAdapterData(this);
        eventListActivityViewModel = ViewModelProviders.of(this).get(EventListActivityViewModel.class);
        eventListActivityViewModel.init();

        eventListBinding.setProgressVisible(true);
        eventListActivityViewModel.getEventData();

        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(EventListActivity.this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        eventListActivityViewModel.listEvent.observe(this, new Observer<List<EventModel>>() {
            @Override
            public void onChanged(List<EventModel> eventModelList) {
                eventListBinding.setProgressVisible(false);
                if(eventModelList!=null){
                    EventListAdapter eventListAdapter = new EventListAdapter(EventListActivity.this, eventModelList);
                    recyclerView.setAdapter(eventListAdapter);
                }
            }
        });

    }

    public void onFinishClick(){
        finish();
    }

}