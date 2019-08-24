package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.zip.Inflater;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdaperDemo extends RecyclerView.Adapter<AdaperDemo.Holder>{
    Context context ;
    ArrayList<String> image;
    ArrayList<String> imageName;
    public AdaperDemo(Context context, ArrayList<String> image, ArrayList<String> imageName){
        this.context=context;
        this.image=image;
        this.imageName=imageName;

    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(parent.getContext());
        View view= inflater.inflate(R.layout.card_view_layout,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        Glide.with(context)
                .asBitmap()
                .load(image.get(position))
                .into(holder.circleImageView);
        holder.textView.setText(imageName.get(position));
    }

    @Override
    public int getItemCount() {
        return imageName.size();
    }

    class Holder extends RecyclerView.ViewHolder{

        CircleImageView circleImageView;
        TextView textView;
        RelativeLayout parent;
        public Holder(@NonNull View itemView) {
            super(itemView);
            circleImageView=itemView.findViewById(R.id.circleimage);
            textView=itemView.findViewById(R.id.text);
            parent=itemView.findViewById(R.id.parentview);

        }
    }
}



