package admin.com.garden.gardenorderadmin.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import admin.com.garden.gardenorderadmin.Model.Order;
import admin.com.garden.gardenorderadmin.R;

/**
 * Created by Faggot on 11/18/2017.
 */

class MyViewHolder extends RecyclerView.ViewHolder {

    public TextView name,quantity,price, toppings;
    public MyViewHolder(View itemView) {
        super(itemView);
        name = (TextView)itemView.findViewById(R.id.product_name);
        quantity = (TextView)itemView.findViewById(R.id.product_quantity);
        price = (TextView)itemView.findViewById(R.id.product_price);
        toppings = (TextView)itemView.findViewById(R.id.product_toppings);
    }
}


public class OrderDetailAdapter  extends RecyclerView.Adapter<MyViewHolder> {

    List<Order> myOrders;

    public OrderDetailAdapter(List<Order> myOrders) {
        this.myOrders = myOrders;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.order_detail_layout,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Order order = myOrders.get(position);
        holder.name.setText(String.format("Narudžba : %s",order.getProductName()));
        holder.quantity.setText(String.format("Količina : %s",order.getQuantity()));
        holder.price.setText(String.format("Cijena : %s",order.getPrice()));
        holder.toppings.setText(String.format("Toppings: %s", order.getToppings()));


    }

    @Override
    public int getItemCount() {
        return myOrders.size();
    }
}
