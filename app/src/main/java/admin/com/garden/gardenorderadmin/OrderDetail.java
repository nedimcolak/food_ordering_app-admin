package admin.com.garden.gardenorderadmin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import admin.com.garden.gardenorderadmin.Common.Common;
import admin.com.garden.gardenorderadmin.ViewHolder.OrderDetailAdapter;

public class OrderDetail extends AppCompatActivity {

    TextView order_id, order_phone, order_total, order_comment, order_toppings;
    String order_id_value="";
    RecyclerView lstFood;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);

        order_id = (TextView)findViewById(R.id.order_id);
        order_phone = (TextView)findViewById(R.id.order_phone);
        order_total = (TextView)findViewById(R.id.order_total);
        order_comment = (TextView)findViewById(R.id.order_comment);
        order_toppings = (TextView)findViewById(R.id.order_toppings);


        lstFood = (RecyclerView)findViewById(R.id.lstFood);
        lstFood.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        lstFood.setLayoutManager(layoutManager);


        if(getIntent()!= null)
            order_id_value = getIntent().getStringExtra("OrderId");

        //nemam pojma za sta ovaj kod sluzi ali cu skontat kasnije
        /**
         * Nisi se nikad ni potrudio da skontas,
         * boga pitaj hoces li ikad i skontat
         * ali nema veze, tu sam ja da skontam umjesto tebe
         * odjava, dosta sam srao...
         */
        order_id.setText(order_id_value);
        order_phone.setText(Common.currentRequest.getPhone());
        order_total.setText(Common.currentRequest.getTotal());
        order_comment.setText(Common.currentRequest.getComment());
        //order_toppings.setText(Common.currentRequest.getToppings());

        OrderDetailAdapter adapter = new OrderDetailAdapter(Common.currentRequest.getFood());
        adapter.notifyDataSetChanged();
        lstFood.setAdapter(adapter);


    }
}
