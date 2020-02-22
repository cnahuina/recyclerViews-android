package dev.cnahuina.caserito;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    String data1[],data2[];
    int images[];

    Context context;

    public MyAdapter(Context ct, String s1[],String s2[],int img[]){

        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.mytextSkills.setText(data1[position]);
        holder.mytextDesc.setText(data2[position]);
        holder.myImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mytextDesc, mytextSkills;
        ImageView myImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mytextSkills = itemView.findViewById(R.id.skills_text);
            mytextDesc = itemView.findViewById(R.id.description_text);
            myImage = itemView.findViewById(R.id.myImageView);
        }
    }
}
