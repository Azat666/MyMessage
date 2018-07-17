package com.example.student.mymessige.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.student.mymessige.R;
import com.example.student.mymessige.activity.LastActivity;
import com.example.student.mymessige.models.ModelMessigeFragment;
import com.example.student.mymessige.providers.UserDataProvider;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.List;

public class AdapterMessigefragment extends RecyclerView.Adapter<AdapterMessigefragment.ViewHolder> {
    List<ModelMessigeFragment> list;
    Context context;

    public AdapterMessigefragment(List<ModelMessigeFragment> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final  View view = LayoutInflater.from(context).inflate(R.layout.messige_item,parent,false);
        AdapterMessigefragment.ViewHolder viewHolder =new AdapterMessigefragment.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
      holder.textName.setText(list.get(position).getTextName());
      holder.textStatus.setText(list.get(position).getTextStatus());
      holder.circularImageView.setImageResource(list.get(position).getImageId());
      holder.itemView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent intent = new Intent(context, LastActivity.class);
              UserDataProvider.hello = 1;
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
        TextView textStatus;

        public ViewHolder(View itemView) {
            super(itemView);
            circularImageView= itemView.findViewById(R.id.circularmessige_item);
            textName= itemView.findViewById(R.id.username);
            textStatus= itemView.findViewById(R.id.userstatus);
        }
    }
}
