package id.sch.smktelkom_mlg.learn.recyclerview3.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.learn.recyclerview3.R;
import id.sch.smktelkom_mlg.learn.recyclerview3.model.Hotel;

/**
 * Created by Dafa Zakhulhaq on 02/11/2016.
 */

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.ViewHolder> {

    ArrayList<Hotel> hotellist;

    public HotelAdapter(ArrayList<Hotel> hotellist) {

        this.hotellist = hotellist;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Hotel hotel = hotellist.get(position);
        holder.tvjudul.setText(hotel.judul);
        holder.tvdeskripsi.setText(hotel.deskripsi);
        holder.ivfoto.setImageDrawable(hotel.foto);

    }

    @Override
    public int getItemCount() {

        if (hotellist != null) {
            return hotellist.size();
        }
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivfoto;
        TextView tvjudul;
        TextView tvdeskripsi;


        public ViewHolder(View itemView) {
            super(itemView);

            ivfoto = (ImageView) itemView.findViewById(R.id.imageview);
            tvjudul = (TextView) itemView.findViewById(R.id.textviewjudul);
            tvdeskripsi = (TextView) itemView.findViewById(R.id.textviewdeskripsi);

        }
    }
}
