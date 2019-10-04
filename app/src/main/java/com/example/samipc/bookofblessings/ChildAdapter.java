package com.example.samipc.bookofblessings;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rabia.nestedrecyclerview.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ChildAdapter  extends RecyclerView.Adapter<ChildAdapter.ViewHolder> {
    private List<ChildModel> childModels;
    private LayoutInflater layoutInflater;

    public ChildAdapter(List<ChildModel> childModels, Context context) {
        this.childModels = childModels;
        this.layoutInflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=layoutInflater.inflate(R.layout.child_recyclerview,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, final int i) {
        ChildModel model=childModels.get(i);
        viewHolder.textView.setText(model.getTitle());
        viewHolder.blessing_name1.setText(model.getBlessing_Name1());
        viewHolder.blessing_name2.setText(model.getBlessing_Name2());
        viewHolder.blessing_name3.setText(model.getBlessing_Name3());
        viewHolder.blessing_name4.setText(model.getBlessing_Name4());
        viewHolder.blessing_name5.setText(model.getBlessing_Name5());
        String blessing_name1=model.getBlessing_Name1();
        String blessing_name2=model.getBlessing_Name2();
        String blessing_name3=model.getBlessing_Name3();
        String blessing_name4=model.getBlessing_Name4();
        String blessing_name5=model.getBlessing_Name5();

//        Integer image=model.getThumbnail();
        Picasso.with(layoutInflater.getContext()).load(R.drawable.fondo_bendiciones).placeholder(R.drawable.fondo_bendiciones).into(viewHolder.imageView);



        viewHolder.cardView.setOnClickListener(new View.OnClickListener() {



            String message1 = "This section contains the blessings related to.\n";
            String message2 = " the family and its environment.\\n\" +\n";
            String message3 = " Please select the one of your interest";
            String message4;

 //           Toast.makeText(this, message1 + mData.get(i).getCategory() + message3, Toast.LENGTH_SHORT).show();




            @Override
            public void onClick(View v) {

                Intent intent = new Intent(layoutInflater.getContext(), Blessing_Activity.class);
                intent.putExtra("Blessing_Book", childModels.get(i).getBlessing_Book());
                intent.putExtra("Pag", childModels.get(i).getPag());
                layoutInflater.getContext().startActivities(new Intent[]{intent});

            }


        });


    }


    @Override
    public int getItemCount() {
        return childModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;
        private ImageView imageView;
        private TextView blessing_name1;
        private TextView blessing_name2;
        private TextView blessing_name3;
        private TextView blessing_name4;
        private TextView blessing_name5;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.child_des);
            blessing_name1=itemView.findViewById(R.id.child_blessing1);
            blessing_name2=itemView.findViewById(R.id.child_blessing2);
            blessing_name3=itemView.findViewById(R.id.child_blessing3);
            blessing_name4=itemView.findViewById(R.id.child_blessing4);
            blessing_name5=itemView.findViewById(R.id.child_blessing5);
            imageView=itemView.findViewById(R.id.image_child);
            cardView = itemView.findViewById(R.id.cardview_id);
        }
    }
}
