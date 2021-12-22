package com.example.challengeintents;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ImageView ivMood,ivPhone,ivWeb,ivMap;
    Button btnNewContact;
    TextView tvName;
    final int CONTACT_CREATED=1;
    String name="",number="",web="",location="",mood="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivMood = findViewById(R.id.ivMood);
        ivPhone = findViewById(R.id.ivPhone);
        ivWeb = findViewById(R.id.ivWeb);
        ivMap = findViewById(R.id.ivMap);
        btnNewContact = findViewById(R.id.btnNewContact);
        tvName = findViewById(R.id.tvName);

        ivMood.setVisibility(View.GONE);
        ivPhone.setVisibility(View.GONE);
        ivWeb.setVisibility(View.GONE);
        ivMap.setVisibility(View.GONE);
        tvName.setVisibility(View.GONE);



        ivMood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        ivPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(Intent.ACTION_DIAL , Uri.parse("tel:" + number));
               startActivity(intent);
            }
        });
        ivWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + web));
                   startActivity(intent);
            }
        });
        ivMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + location));
                startActivity(intent);

            }
        });

        btnNewContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,com.example.challengeintents.CreateContact.class);
                startActivityForResult(intent,CONTACT_CREATED);


            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CONTACT_CREATED)
        {
            if (resultCode == RESULT_OK)
            {
                ivMood.setVisibility(View.VISIBLE);
                ivPhone.setVisibility(View.VISIBLE);
                ivWeb.setVisibility(View.VISIBLE);
                ivMap.setVisibility(View.VISIBLE);
                tvName.setVisibility(View.VISIBLE);

                name = data.getStringExtra("name");
                number = data.getStringExtra("number");
                web= data.getStringExtra("web");
                location=data.getStringExtra("location");
                mood=data.getStringExtra("mood");

                tvName.setText(name);

                if (mood.equals("happy"))
                {
                    ivMood.setImageResource(R.drawable.happy);
                }
               else if (mood.equals("ok"))
                {
                    ivMood.setImageResource(R.drawable.ok);
                }
               else
                {
                    ivMood.setImageResource(R.drawable.sad);
                }
            }
            else {
                Toast.makeText(this, "Please Enter all fields!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}