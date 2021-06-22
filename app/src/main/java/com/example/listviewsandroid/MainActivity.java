package com.example.listviewsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myFriendListView=findViewById(R.id.myFriendList);
        ArrayList<String> myFriends=new ArrayList<String>();
        myFriends.add("Ahmed");
        myFriends.add("Talha");
        myFriends.add("Hamza");
        myFriends.add("Ali Hassa");
        myFriends.add("Muhmmad Luqnman");
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,myFriends);
        myFriendListView.setAdapter(arrayAdapter);
        myFriendListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Your Friends name is:"+ myFriends.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}