package com.example.shoppieadmin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.shoppieadmin.databinding.LayoutProductItemBinding
import com.example.shoppieadmin.model.ProductModel

class ProductAdapter(val context: Context,val list: ArrayList<ProductModel>)
    : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>(){
        inner class ProductViewHolder(val binding: LayoutProductItemBinding)
            :RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding =LayoutProductItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val data = list[position]

        Glide.with(context).load(data.productCoverImg).into(holder.binding.imageView2)
        holder.binding.textView2.text=data.productName
        holder.binding.textView3.text=data.productCategory

        holder.binding.button.text="₹ "+data.productSp

        holder.binding.textView4.text="₹ "+data.productMrp

    }

    override fun getItemCount(): Int {
        return list.size
    }

}