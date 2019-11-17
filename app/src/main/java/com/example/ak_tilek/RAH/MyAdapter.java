package com.example.ak_tilek.RAH;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ak_tilek.R;
import com.example.ak_tilek.model.DailySchedule;
import com.example.ak_tilek.model.Schedule;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Schedule> list;

    public MyAdapter() {
        this.list = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.itemik, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(getItem(position));
    }

    public Schedule getItem(int i) {
        return list.get(i);
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public void update(DailySchedule scheduleFor) {
        this.list = scheduleFor.getData();
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView subgect;
        private TextView techname;
        private TextView time;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            subgect = itemView.findViewById(R.id.subget);
            techname = itemView.findViewById(R.id.techername);
            time = itemView.findViewById(R.id.timme);


        }

        public void bind(Schedule schedule) {
            subgect.setText(schedule.getSubgect());
            techname.setText(schedule.getTeacher());
            SimpleDateFormat format = new SimpleDateFormat("kk:mm", Locale.getDefault());
            String startTime = schedule.getStart();//format.format(schedule.getStart());
            String endTime = schedule.getEnd();//format.format(schedule.getEnd());
            time.setText(itemView.getContext().getString(R.string.time, startTime, endTime));

        }
    }
}
