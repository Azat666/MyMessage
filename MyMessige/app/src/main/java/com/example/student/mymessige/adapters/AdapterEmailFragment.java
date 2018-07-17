package com.example.student.mymessige.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.student.mymessige.R;
import com.example.student.mymessige.models.ModelEmailFragment;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.List;

public class AdapterEmailFragment extends RecyclerView.Adapter<AdapterEmailFragment.ViewHolder> {

    List<ModelEmailFragment> list;
    Context context;

    public AdapterEmailFragment(List<ModelEmailFragment> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(context).inflate(R.layout.email_item, parent, false);
        AdapterEmailFragment.ViewHolder viewHolder = new AdapterEmailFragment.ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
     holder.textEmail.setText(list.get(position).getTextEmail());
     holder.circularImageView.setImageResource(list.get(position).getImageId());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircularImageView circularImageView;
        TextView textEmail;
        public ViewHolder(View itemView) {
            super(itemView);
            circularImageView= itemView.findViewById(R.id.circularemail_item);
            textEmail = itemView.findViewById(R.id.text_email);
        }
    }
}
