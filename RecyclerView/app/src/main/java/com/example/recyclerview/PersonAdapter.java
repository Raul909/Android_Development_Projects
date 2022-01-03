package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder>   //we created our own viewholder here
{

    private ArrayList<Person> people;
    ItemClicked activity;

    public  interface ItemClicked
    {
        void onItemClicked(int index);
    }

    public PersonAdapter(Context context,ArrayList<Person> list) {

        people = list;
        activity = (ItemClicked) context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder        //this viewholder class here will represent every item that we are going to place in the list_item layout view
    {                                                              // this viewholder just represents what we did in the person class and in the list_item.xml
  //we need to define all the items that we have on the list

        ImageView ivPic;
        TextView tvName,tvSurname;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivPic = itemView.findViewById(R.id.ivPic);
            tvName = itemView.findViewById(R.id.tvName);
            tvSurname = itemView.findViewById(R.id.tvSurname);

            //here inside this viewholder is where we set the onclicklistener so that if an item in the list gets clicked it will get activated by this method

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                      activity.onItemClicked(people.indexOf((Person)v.getTag()));
                }
            });
        }
    }
    @NonNull
    @Override
    public PersonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);   //the v is now referring to the list items that we have created
        return new ViewHolder(v);   //item view is now referring to list items
    }

    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.ViewHolder holder, int position)   // this method runs for every item that's currently in your arraylist
    {
      holder.itemView.setTag(people.get(position));
      holder.tvName.setText(people.get(position).getName());
      holder.tvSurname.setText(people.get(position).getSurname());

      if (people.get(position).getPreference().equals("bus"))
      {
         holder.ivPic.setImageResource(R.drawable.bus);
      }
      else
      {
          holder.ivPic.setImageResource(R.drawable.plane);
      }
    }

    @Override
    public int getItemCount() {
        return people.size();
    }
}
