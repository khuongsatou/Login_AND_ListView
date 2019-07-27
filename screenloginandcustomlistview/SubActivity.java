package com.example.screenloginandcustomlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import com.example.screenloginandcustomlistview.Brands.Brands;
import com.example.screenloginandcustomlistview.Brands.BrandsAdapter;

import java.util.ArrayList;
import java.util.List;

import static com.example.screenloginandcustomlistview.MainActivity.KEY_USERNAME;

public class SubActivity extends AppCompatActivity {

    private ListView lvBrands;
    private TextView tvUserName;

    private BrandsAdapter brandsAdapter;
    private List<Brands> brandsList;


    private String[] brands = {"Acer","Asus","BenQ","DBTel","Dopod","Gigabyte","Technology","E-TEN","HTC","Apple","BLU","Firefly","Garmin","InfoSonics[1]","Motorola","Mobility","Palm","Sonim","Asanzo","BKAV","Bavapen","FPT","Mobile"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Log.d("brands",""+brands.length);
        Radiation();
        SetUserName();
        Handling();
    }

    private void SetUserName() {
        Intent intent = getIntent();
        String name = intent.getExtras().getString(KEY_USERNAME);
        tvUserName.setText(name);
    }

    private void Radiation() {

        tvUserName = (TextView) findViewById(R.id.tvDisplayUserName);
        lvBrands = (ListView) findViewById(R.id.lvBrands);
    }

    private void Handling() {
        brandsList = new ArrayList<Brands>();
        brandsList.add(new Brands(R.drawable.a1,brands[0]));
        brandsList.add(new Brands(R.drawable.a2,brands[1]));
        brandsList.add(new Brands(R.drawable.a3,brands[2]));
        brandsList.add(new Brands(R.drawable.a4,brands[3]));
        brandsList.add(new Brands(R.drawable.a6,brands[4]));
        brandsList.add(new Brands(R.drawable.a7,brands[5]));
        brandsList.add(new Brands(R.drawable.a8,brands[6]));
        brandsList.add(new Brands(R.drawable.a9,brands[7]));
        brandsList.add(new Brands(R.drawable.a10,brands[8]));
        brandsList.add(new Brands(R.drawable.a11,brands[9]));
        brandsList.add(new Brands(R.drawable.a12,brands[10]));
        brandsList.add(new Brands(R.drawable.a13,brands[11]));
        brandsList.add(new Brands(R.drawable.a15,brands[12]));
        brandsList.add(new Brands(R.drawable.a16,brands[13]));
        brandsList.add(new Brands(R.drawable.a17,brands[14]));
        brandsList.add(new Brands(R.drawable.a18,brands[15]));
        brandsList.add(new Brands(R.drawable.a19,brands[16]));
        brandsList.add(new Brands(R.drawable.a20,brands[17]));
        brandsList.add(new Brands(R.drawable.a21,brands[18]));
        brandsList.add(new Brands(R.drawable.a22,brands[19]));

        brandsList.add(new Brands(R.drawable.a5,brands[20]));
        brandsList.add(new Brands(R.drawable.a14,brands[21]));

        brandsAdapter = new BrandsAdapter(SubActivity.this,brandsList);
        lvBrands.setAdapter(brandsAdapter);
    }
}
