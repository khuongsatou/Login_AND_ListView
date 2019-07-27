package com.example.screenloginandcustomlistview.Brands;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.screenloginandcustomlistview.R;

import java.util.List;

public class BrandsAdapter extends BaseAdapter {{}

    private Context context;
    private List<Brands> listBrands;

    public BrandsAdapter(Context context, List<Brands> listBrands) {
        this.context = context;
        this.listBrands = listBrands;
    }

    @Override
    public int getCount() {
        return listBrands.size();
    }

    @Override
    public Object getItem(int i) {
        return listBrands.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder = null;
        if (view == null){
            Log.d("viewabc",""+i);
            view = LayoutInflater.from(context).inflate(R.layout.custom_item_listview_brands,viewGroup,false);

            viewHolder = new ViewHolder();

            viewHolder.tvTitle = (TextView) view.findViewById(R.id.tvTitle);
            viewHolder.imgBrand = (ImageView) view.findViewById(R.id.imgPicture);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }
        Brands brands = (Brands) getItem(i);
        viewHolder.tvTitle.setText(""+brands.getTitle());
        viewHolder.imgBrand.setImageResource(brands.getBrands());
        return view;
    }

    private class ViewHolder{
        private TextView tvTitle;
        private ImageView imgBrand;

    }
}
