package com.example.innofiedtestbhagya.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.innofiedtestbhagya.R;
import com.example.innofiedtestbhagya.databinding.LayoutEventlistItemBinding;
import com.example.innofiedtestbhagya.model.EventModel;
import com.example.innofiedtestbhagya.view.MapActivity;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class EventListAdapter extends RecyclerView.Adapter<EventListAdapter.ListItemViewHolder> {
    private Context context;
    private List<EventModel> list;

    public EventListAdapter(Context context, List<EventModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ListItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutEventlistItemBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.layout_eventlist_item, parent, false);

        return new ListItemViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull EventListAdapter.ListItemViewHolder holder, int position) {
        final EventModel item = list.get(position);
        holder.bind(item);

        holder.itemView.findViewById(R.id.parentLayout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, MapActivity.class);
                intent.putExtra("lat", item.getLat());
                intent.putExtra("long", item.getLong1());
                intent.putExtra("venu", item.getEventVenue());
                intent.putExtra("title", item.getEventName());
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ListItemViewHolder extends RecyclerView.ViewHolder {
        public LayoutEventlistItemBinding bindingList;

        public ListItemViewHolder(@NonNull LayoutEventlistItemBinding itemView) {
            super(itemView.getRoot());
            this.bindingList = itemView;
        }

        public void bind(EventModel item) {
            bindingList.setEventModel(item);
            bindingList.executePendingBindings();
        }
    }
}
