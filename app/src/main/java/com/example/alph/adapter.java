package com.example.alph;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class adapter
        extends RecyclerView.Adapter<adapter.ViewHolder>{

    private String[] Alphabit;
    private String[] example;

    public adapter(String[] Alphabit, String[] example){
        this.Alphabit = Alphabit;
        this.example = example;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card,
                parent,
                false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardView cardView = holder.cardView;
        TextView Alpha = (TextView) cardView.findViewById(R.id.txtalpha);
       // Drawable dr = ContextCompat.getDrawable(cardView.getContext(), Integer.parseInt(example[position]));
        Alpha.setText(Alphabit[position]);
        TextView txt = (TextView)cardView.findViewById(R.id.txtName);
        txt.setText(example[position]);
        cardView.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                for(int i = 0; i<Alphabit.length;i++){

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return Alphabit.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        public ViewHolder(CardView cardView){
            super(cardView);
            this.cardView = cardView;
        }

    }
}
