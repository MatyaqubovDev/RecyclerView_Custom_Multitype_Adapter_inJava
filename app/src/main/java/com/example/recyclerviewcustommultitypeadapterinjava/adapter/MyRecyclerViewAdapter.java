package com.example.recyclerviewcustommultitypeadapterinjava.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewcustommultitypeadapterinjava.R;
import com.example.recyclerviewcustommultitypeadapterinjava.model.Header;
import com.example.recyclerviewcustommultitypeadapterinjava.model.Post;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter {
    int POST = 1;
    int HEADER = 0;

    public Header header;
    public ArrayList<Post> posts;

    public MyRecyclerViewAdapter(Header header, ArrayList<Post> posts) {
        this.header = header;
        this.posts = posts;
    }

    @Override
    public int getItemViewType(int position) {
        if (position > 0) {
            return POST;
        } else {
            return HEADER;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if(viewType==POST){
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post,parent,false);
            return new PostViewHolder(view);
        }else {
            view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_header,parent,false);
            return new HeaderViewHolder(view);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Post post = posts.get(position);
        if (holder instanceof HeaderViewHolder) {
            ((HeaderViewHolder) holder).userImage.setImageResource(header.getUserImage());
            ((HeaderViewHolder) holder).et_postText.setText(header.getPostText());
            ((HeaderViewHolder) holder).postImage.setImageResource(header.getPostImage());
        }
        if (holder instanceof PostViewHolder) {
            ((PostViewHolder) holder).userFullName.setText(post.getUserFullName());
            ((PostViewHolder) holder).lastActive.setText(post.getLastactive());
            ((PostViewHolder) holder).postText.setText(post.getPostText());
            ((PostViewHolder) holder).postImage.setImageResource(post.getPostImage());
        }

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    class HeaderViewHolder extends RecyclerView.ViewHolder {
        View view;
        ImageView userImage;
        EditText et_postText;
        ImageView postImage;

        public HeaderViewHolder(View view) {
            super(view);
            this.userImage = view.findViewById(R.id.img_user);
            this.et_postText = view.findViewById(R.id.et_post_text);
            this.postImage = view.findViewById(R.id.img_add_photo);
            this.view = view;
        }
    }

    class PostViewHolder extends RecyclerView.ViewHolder {
        View view;
        TextView userFullName;
        TextView lastActive;
        TextView postText;
        ImageView postImage;


        public PostViewHolder(View view) {
            super(view);
            this.userFullName = view.findViewById(R.id.tv_fullName);
            this.lastActive = view.findViewById(R.id.tv_last_active);
            this.postText = view.findViewById(R.id.tv_post);
            this.postImage = view.findViewById(R.id.img_post);
            this.view = view;
        }
    }
}
