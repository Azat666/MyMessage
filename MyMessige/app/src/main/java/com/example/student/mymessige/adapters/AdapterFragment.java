package com.example.student.mymessige.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.student.mymessige.R;
import com.example.student.mymessige.activity.LastActivity;
import com.example.student.mymessige.models.ModelFragment;
import com.example.student.mymessige.providers.UserDataProvider;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.List;

public class AdapterFragment extends RecyclerView.Adapter<AdapterFragment.ViewHolder> {

    List<ModelFragment> list;
    Context context;

    public AdapterFragment(List<ModelFragment> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(context).inflate(R.layout.call_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
            holder.circularImageView.setImageResource(list.get(position).getImageId());
            holder.textName.setText(list.get(position).getTextName());
            holder.textSurName.setText(list.get(position).getTextSurName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, LastActivity.class);
                UserDataProvider.hello = 0;
                intent.putExtra("MY_KEY", position);
                context.startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        CircularImageView circularImageView;
        TextView textName;
        TextView textSurName;
        public ViewHolder(View itemView) {
            super(itemView);
            circularImageView = itemView.findViewById(R.id.circular_item);
            textName = itemView.findViewById(R.id.text_name);
            textSurName = itemView.findViewById(R.id.textsurname);
        }

    }
}
