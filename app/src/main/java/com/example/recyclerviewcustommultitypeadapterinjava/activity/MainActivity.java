package com.example.recyclerviewcustommultitypeadapterinjava.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.recyclerviewcustommultitypeadapterinjava.R;
import com.example.recyclerviewcustommultitypeadapterinjava.adapter.MyRecyclerViewAdapter;
import com.example.recyclerviewcustommultitypeadapterinjava.model.Header;
import com.example.recyclerviewcustommultitypeadapterinjava.model.Post;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Post> posts;
    Header header;
    MyRecyclerViewAdapter myRecyclerViewAdapter;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;
        initViews();
    }

    private void initViews() {
        RecyclerView recyclerView=findViewById(R.id.rv_main);
        posts = new ArrayList();
        addPost();
        header=new Header(R.drawable.icon_person,"Whats is your mind?",R.drawable.addphoto);
        myRecyclerViewAdapter=new MyRecyclerViewAdapter(header,posts);
        recyclerView.setAdapter(myRecyclerViewAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));
    }

    private void addPost() {
        for (int i = 0; i < 20; i++) {
            posts.add(new Post("Matyaqubov","1h","Bu mening ikkkinchi recyclerView",R.drawable.one));
        }
    }
}