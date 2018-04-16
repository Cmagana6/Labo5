package com.barahona.labo5;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by uca on 04-16-18.
 */

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder> {

    //ViewHolder define los objetos visibles del adaptador

    Context mycontext;
    List<Planetas> Planetlist;

    public PlanetAdapter(Context c, List<Planetas> p){
        this.mycontext= c;
        this.Planetlist = p;

    }

    @Override
    public PlanetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mycontext);
        View v = inflater.inflate(R.layout.list_titem, null);

        return new PlanetViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PlanetViewHolder holder, int position) {
        holder.titleTv.setText(Planetlist.get(position).GetName());
        holder.descTv.setText(Planetlist.get(position).GetDesc());
    }

    @Override
    public int getItemCount() {
        return Planetlist.size();
    }

    protected class PlanetViewHolder extends RecyclerView.ViewHolder {
        TextView titleTv, descTv;

        public PlanetViewHolder(View itemView) {
            super(itemView);

            titleTv = itemView.findViewById(R.id.title_id);
            descTv = itemView.findViewById(R.id.desc_id);
        }
    }
}
