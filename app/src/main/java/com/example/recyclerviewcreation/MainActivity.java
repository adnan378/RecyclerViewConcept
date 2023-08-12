package com.example.recyclerviewcreation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ContactModel>arrContact=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        arrContact.add(new ContactModel(R.drawable.d,"A","9198005737"));
        arrContact.add(new ContactModel(R.drawable.d,"B","9198005737"));
        arrContact.add(new ContactModel(R.drawable.d,"C","9198005737"));
        arrContact.add(new ContactModel(R.drawable.d,"D","9198005737"));
        arrContact.add(new ContactModel(R.drawable.d,"E","9198005737"));
        arrContact.add(new ContactModel(R.drawable.d,"F","9198005737"));
        arrContact.add(new ContactModel(R.drawable.d,"G","9198005737"));
        arrContact.add(new ContactModel(R.drawable.d,"H","9198005737"));
        arrContact.add(new ContactModel(R.drawable.d,"I","9198005737"));
        arrContact.add(new ContactModel(R.drawable.d,"J","9198005737"));
        arrContact.add(new ContactModel(R.drawable.d,"K","9198005737"));
        //CUSTOMER ADAPTER instace
        RecyclerContactAdapter adapter=new RecyclerContactAdapter(this,arrContact);
        recyclerView.setAdapter(adapter);




    }
}