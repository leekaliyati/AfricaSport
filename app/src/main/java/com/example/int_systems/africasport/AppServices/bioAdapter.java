package com.example.int_systems.africasport.AppServices;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.int_systems.africasport.R;

import java.util.List;

    /**
     * Created by Int-Systems on 3/22/2018.
     */
    public class bioAdapter extends RecyclerView.Adapter <bioAdapter.ProductViewHolder>  {
        int myId;

        //this context we will use to inflate the layout
        private Context mCtx;

        //we are storing all the products in a list
        private List<BioResponce> productList;

        //getting the context and product list with constructor
        public bioAdapter(Context mCtx, List<BioResponce> productList) {
            this.mCtx = mCtx;
            this.productList = productList;
        }

        @Override
        public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            //inflating and returning our view holder
            LayoutInflater inflater = LayoutInflater.from(mCtx);
            View view = inflater.inflate(R.layout.biolist, null);
            return new ProductViewHolder(view);
        }

        @Override
        public void onBindViewHolder(bioAdapter.ProductViewHolder holder, int position) {
            //getting the product of the specified position
            BioResponce product = productList.get(position);

            //binding the data with the viewholder views
            holder.textfirstname.setText(product.getFirstname());
            holder.textlastname.setText(product.getLastname());
            holder.textsport.setText(product.getSport());
            holder.textcountry.setText(product.getCountry());
            holder.textage.setText(product.getAge());
          //  holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));


        }

        @Override
        public int getItemCount() {
            return productList.size();

        }




        public  class ProductViewHolder extends RecyclerView.ViewHolder  {
            TextView textfirstname,textlastname,textsport,textcountry,textage;
            ImageView imageView;

            public ProductViewHolder(View itemView) {
                super(itemView);
                // taxiVehicle product = productList.get(position);

                textfirstname = (TextView) itemView.findViewById(R.id.txtfirstname);
                textlastname = (TextView)itemView.findViewById(R.id.txtlastname);
                textsport =(TextView) itemView.findViewById(R.id.txtsport);
                textcountry =(TextView) itemView.findViewById(R.id.txtcountry);
                textage =(TextView) itemView.findViewById(R.id.txtage) ;
                imageView = (ImageView) itemView.findViewById(R.id.imageView);




            }
        }

    }
