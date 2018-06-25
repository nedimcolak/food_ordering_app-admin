package admin.com.garden.gardenorderadmin.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.TextView;

import admin.com.garden.gardenorderadmin.Interface.ItemClickListener;
import admin.com.garden.gardenorderadmin.R;

/**
 * Created by Nedim on 10/31/2017.
 */

public class OrderViewHolder extends RecyclerView.ViewHolder   implements View.OnClickListener,
        View.OnCreateContextMenuListener {

    public TextView txtOrderId, txtOrderStatus, txtOrderPhone;

    private ItemClickListener itemClickListener;

    public OrderViewHolder(View itemView) {
        super(itemView);
        txtOrderId = (TextView)itemView.findViewById(R.id.order_id);
        txtOrderPhone = (TextView)itemView.findViewById(R.id.order_phone);
        txtOrderStatus = (TextView)itemView.findViewById(R.id.order_status);

        itemView.setOnClickListener(this);
        itemView.setOnCreateContextMenuListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View view) {

        itemClickListener.onClick(view, getAdapterPosition(), true);

    }

    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.setHeaderTitle("Odaberite opciju");

        contextMenu.add(0, 0, getAdapterPosition(),"Izmjena statusa/stavke");
        contextMenu.add(0, 1, getAdapterPosition(),"Izbriši");

    }


}