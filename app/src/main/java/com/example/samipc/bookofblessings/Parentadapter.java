package com.example.samipc.bookofblessings;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rabia.nestedrecyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class Parentadapter extends RecyclerView.Adapter<Parentadapter.ViewHolder> {
    private List<String> data;
    private Context context1;
    private LayoutInflater layoutInflater;
    private String message1;
    private String message2;
    private String message3;
    private String message4;
    private int pos;


    public Parentadapter(List<String> data, Context context1) {
        this.data = data;
        this.context1 = context1;
        this.layoutInflater =LayoutInflater.from(context1);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=layoutInflater.inflate(R.layout.parent_recyclerview,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int position) {

        pos = position;
        String title=data.get(position);
        viewHolder.textView.setText(title);
        final ArrayList<ChildModel> list=new ArrayList<>();
        ChildModel childModel=null;

        int pag = 0;
        int pag1 = 1;
        int pag2 = 2;
        int pag3 = 3;
        int pag4 = 4;
        int pag9 = 9;


        if(position==0){
            list.add(new ChildModel(context1.getString(R.string.children),"Familly",context1.getString(R.string.blessingChild),pag," ", context1.getString(R.string.blessing_of),
                    context1.getString(R.string.children), " ", " "));
            list.add(new ChildModel(context1.getString(R.string.home),"Family",context1.getString(R.string.blessingMesusah),pag1," ",context1.getString(R.string.affixing),
                    context1.getString(R.string.mezuzah), " ", " "));
            list.add(new ChildModel(context1.getString(R.string.travel),"Family",context1.getString(R.string.blessingTravel),pag2," ",context1.getString(R.string.blessing),
                    context1.getString(R.string.forthe), context1.getString(R.string.travelers), " "));
        }

        if(position==1){
            list.add(new ChildModel(context1.getString(R.string.beforeeating),"Food",context1.getString(R.string.blessinghands),pag,context1.getString(R.string.blessing),
                    context1.getString(R.string.when),context1.getString(R.string.washing),context1.getString(R.string.hands)," "));
            list.add(new ChildModel(context1.getString(R.string.wine),"Food",context1.getString(R.string.BelssingWine),pag," ", " ",
                    context1.getString(R.string.wine), " ", " "));
            list.add(new ChildModel(context1.getString(R.string.bread),"Food",context1.getString(R.string.blessingBread),pag," ",context1.getString(R.string.blessingwhen),
                    context1.getString(R.string.eatingbread), " ", " "));
            list.add(new ChildModel(context1.getString(R.string.grains),"Food",context1.getString(R.string.blessingGrains),pag," ",context1.getString(R.string.blessingover),
                    context1.getString(R.string.grains), " ", " "));
            list.add(new ChildModel(context1.getString(R.string.vegetables),"Food",context1.getString(R.string.blessingVegetable),pag, " ",context1.getString(R.string.blessingover),
                    context1.getString(R.string.vegetables), " ", " "));
            list.add(new ChildModel(context1.getString(R.string.fruits),"Food",context1.getString(R.string.BlessingFruits),pag, " ",context1.getString(R.string.blessingwhen),
                    context1.getString(R.string.eatingfruits), " ", " "));
            list.add(new ChildModel(context1.getString(R.string.allotherfood),"Food",context1.getString(R.string.blessingOtherFood),pag,context1.getString(R.string.blessingwhen),
                    context1.getString(R.string.eatingmeat),context1.getString(R.string.beverages), context1.getString(R.string.somevegetable), context1.getString(R.string.cakescandies)));
            list.add(new ChildModel("Birkat Hamazon","Food",context1.getString(R.string.birkatHamazon),pag9," ",context1.getString(R.string.belssingafter),
                    context1.getString(R.string.meal), " ", " "));
            list.add(new ChildModel(context1.getString(R.string.challah), "Food",context1.getString(R.string.makingchallah),pag4," "," ",context1.getString(R.string.makingthechallah)," "," "));
        }

        if(position==2){
            list.add(new ChildModel(context1.getString(R.string.thecandles),"Shabbat",context1.getString(R.string.blessingShabbatCandels),pag," ",context1.getString(R.string.blessing_of),
                    context1.getString(R.string.thecandles), context1.getString(R.string.forshabbat), " "));
            list.add(new ChildModel("Kidush","Shabbat",context1.getString(R.string.kidushShabbat),pag2, " ",context1.getString(R.string.kidushshabbat),
                    " ", " ", " "));
            list.add(new ChildModel(context1.getString(R.string.thehavdala),"Shabbat",context1.getString(R.string.havdalah),pag3, " ",context1.getString(R.string.thehavdala),
                    " ", " ", " "));
        }

        if(position==3){
            list.add(new ChildModel(context1.getString(R.string.hanukka),"Festivities",context1.getString(R.string.blessingHanukkaCandels),pag2, " ",context1.getString(R.string.blessingover),
                    context1.getString(R.string.thecandles), context1.getString(R.string.forhanukkah), " "));
            list.add(new ChildModel(context1.getString(R.string.yomtov),"Festivities",context1.getString(R.string.blessingYomTovCandels),pag," ", context1.getString(R.string.blessingover),
                    context1.getString(R.string.thecandles), context1.getString(R.string.forfestivities), " "));
            list.add(new ChildModel(context1.getString(R.string.sukkot),"Festivities",context1.getString(R.string.blessingSukkot),pag2," ",context1.getString(R.string.blessingfor),
                    context1.getString(R.string.sukkot), " ", " "));
            list.add(new ChildModel(context1.getString(R.string.yomtov),"Festivities",context1.getString(R.string.kidushShaloshregalim),pag2,context1.getString(R.string.kidushfor), context1.getString(R.string.festivities),
                    context1.getString(R.string.passover), context1.getString(R.string.shavuotsukkot), "Shemini Hazeret"));
            list.add(new ChildModel(context1.getString(R.string.roshhashanah), "Festivities", context1.getString(R.string.kidushroshhashana), pag2, " ", context1.getString(R.string.kidushfor),
                    context1.getString(R.string.roshhashanah),  " ", " "));
            list.add(new ChildModel(context1.getString(R.string.yomkipur), "Festivities", context1.getString(R.string.blessingoveryomkipurcandles), pag1, " ",context1.getString(R.string.blessingover),
                    context1.getString(R.string.thecandles), context1.getString(R.string.foryomkipur), " "));
        }
        if(position==4){
            list.add(new ChildModel(context1.getString(R.string.nature),"Various",context1.getString(R.string.blessingThunder),pag,context1.getString(R.string.blessingwhen), context1.getString(R.string.hearthunder),
                    context1.getString(R.string.seehurricane), context1.getString(R.string.earthquake), " "));
            list.add(new ChildModel(context1.getString(R.string.nature),"Various",context1.getString(R.string.blessingLightning),pag,context1.getString(R.string.blessingwhen), context1.getString(R.string.seea),
                    context1.getString(R.string.lightningbolt), context1.getString(R.string.or), context1.getString(R.string.shootingstar)));
            list.add(new ChildModel(context1.getString(R.string.nature),"Various",context1.getString(R.string.blessingrainbow), pag, " ",context1.getString(R.string.blessingwhen) ,
                    context1.getString(R.string.seearainbow), " ", " "));
            list.add(new ChildModel(context1.getString(R.string.personnel),"Various",context1.getString(R.string.blessingGoodNews),pag,context1.getString(R.string.blessingfor), context1.getString(R.string.goodnewsabout),
                    context1.getString(R.string.ourselves) , context1.getString(R.string.andothers), " "));
            list.add(new ChildModel(context1.getString(R.string.personnel),"Various",context1.getString(R.string.blessingBadNews),pag2,context1.getString(R.string.blessingfor),context1.getString(R.string.badnews),context1.getString(R.string.ourselves),
                    context1.getString(R.string.andothers), " "));
        }




//        list.add(childModel);
        viewHolder.recyclerView.setLayoutManager(new GridLayoutManager(context1,3));
        ChildAdapter childAdapter=new ChildAdapter(list, context1);
        viewHolder.recyclerView.setAdapter(childAdapter);

        viewHolder.fingerpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (position) {

                    case 0:
                        message1 = context1.getString(R.string.familymesage1);
                        message2 = context1.getString(R.string.familymesage2);
                        message3 = context1.getString(R.string.familymesage3);
                        message4 = context1.getString(R.string.familymesage4);
                        break;

                    case 1:
                        message1 = context1.getString(R.string.foodmesage1);
                        message2 = context1.getString(R.string.foodmesage2);
                        message3 = context1.getString(R.string.foodmesage3);
                        message4 = context1.getString(R.string.foodmesage4);
                        break;

                    case 2:
                        message1 = context1.getString(R.string.shabbatmesage1);
                        message2 = context1.getString(R.string.shabbatmesage2);
                        message3 = context1.getString(R.string.shabbatmesage3);
                        message4 = context1.getString(R.string.shabbatmesage4);
                        break;

                    case 3:
                        message1 = "This section contains the blessings related to ";
                        message2 = " Festivities ";
                        message3 = " Please select the one of your interest";
                        message4 = "          Festivities Blessings";
                        break;

                    case 4:
                        message1 = "This section contains the blessings related to ";
                        message2 = " the Miscellaneous Moments and Situations ";
                        message3 = " Please select the one of your interest";
                        message4 = "          Miscellaneous Blessings";
                        break;
                }

                BlessingDescrp();

            }
        });

    }

    public void BlessingDescrp(){

        AlertDialog.Builder builder = new AlertDialog.Builder(layoutInflater.getContext(), R.style.Theme_AppCompat_Light_Dialog_Alert);
        builder.setTitle(message4);
        builder.setMessage(message1 + "\n" + "\n" + message2 + "\n" + "\n" + "\n" + message3);
        builder.create().show();

    }



    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        RecyclerView recyclerView;
        ImageView fingerpress;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView= itemView.findViewById(R.id.title);
            recyclerView= itemView.findViewById(R.id.childRecyclerView);
            fingerpress = itemView.findViewById(R.id.btninfo);





            }
    }
}
