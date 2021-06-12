package com.example.recyclerview_191074.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_191074.Animals;
import com.example.recyclerview_191074.R;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    Context context;
List<Animals> saleAnimals;
    public RecyclerViewAdapter() {
    }

    public RecyclerViewAdapter(Context context, List<Animals> saleAnimals) {
        this.context = context;
        this.saleAnimals = saleAnimals;
    }

    @NonNull
    @Override

    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        Animals anim=saleAnimals.get(position);
        holder.img.setImageResource(saleAnimals.get(position).getImgid());
       holder.txtname.setText("Name: "+anim.getName());
       holder.txtprice.setText("Price: "+anim.getPrice());

    }

    @Override
    public int getItemCount() {
        return saleAnimals.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnLongClickListener  {
        ImageView img;
        TextView txtname, txtprice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.animalImage);
            txtname=itemView.findViewById(R.id.name);
            txtprice=itemView.findViewById(R.id.price);
            itemView.setOnLongClickListener(this);

        }

        @Override
        public boolean onLongClick(View view) {
            int position=getAdapterPosition();
            Toast.makeText(itemView.getContext(),"Deleted " +saleAnimals.get(position).getName(),Toast.LENGTH_LONG).show();
            saleAnimals.remove(position);
            notifyItemRemoved(position);
            return true;
        }
    }

}
