package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements PersonAdapter.ItemClicked {

    RecyclerView recyclerview;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;
    Button btnAdd;

    ArrayList<Person> people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerview= findViewById(R.id.list);
        recyclerview.setHasFixedSize(true);

        btnAdd = findViewById(R.id.btnAdd);

        layoutManager = new LinearLayoutManager(this);
       //  layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false); //this will set the cardview from vertical to horizontal and u need to swipe sideways to see the list
        layoutManager = new GridLayoutManager(this,3,GridLayoutManager.HORIZONTAL,false); //2 cardview list will be there together and you need to swipe horizontally to see the other lists in groups of 2
        recyclerview.setLayoutManager(layoutManager);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                people.add(new Person("Susan","Peters","plane"));
                myAdapter.notifyDataSetChanged();
            }
        });
        people = new ArrayList<Person>();
        people.add(new Person("John","Rambo","bus"));
        people.add(new Person("Chuck","Norris","bus"));
        people.add(new Person("Peter","Jennings","plane"));
        people.add(new Person("Tom","Cruise","plane"));
        people.add(new Person("John","Rambo","bus"));
        people.add(new Person("Chuck","Norris","bus"));
        people.add(new Person("Peter","Jennings","plane"));
        people.add(new Person("Tom","Cruise","plane"));
        people.add(new Person("John","Rambo","bus"));
        people.add(new Person("Chuck","Norris","bus"));
        people.add(new Person("Peter","Jennings","plane"));
        people.add(new Person("Tom","Cruise","plane"));

        myAdapter = new PersonAdapter(this,people);

        recyclerview.setAdapter(myAdapter);
    }

    @Override
    public void onItemClicked(int index) {
        Toast.makeText(this, "Surname:"+ people.get(index).getSurname(), Toast.LENGTH_SHORT).show();
    }
}