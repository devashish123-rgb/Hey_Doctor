package com.example.heydoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Specialist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specialist);
    }
    public void gen(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/general+practitioner+near+me"));
        startActivity(intent);
    }
    public void ped(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/pediatrician+near+me"));
        startActivity(intent);
    }
    public void car(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/cardiologist+near+me"));
        startActivity(intent);
    }
    public void neu(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/neurologist+near+me"));
        startActivity(intent);
    }
    public void oto(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/otolaryngologist+near+me"));
        startActivity(intent);
    }
    public void gyn(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/gynaecologist+near+me"));
        startActivity(intent);
    }
    public void opt(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/opthalmologist+near+me"));
        startActivity(intent);
    }
    public void den(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/dentist+near+me"));
        startActivity(intent);
    }
    public void onc(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/oncologist+near+me"));
        startActivity(intent);
    }
    public void ort(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/orthopedic+near+me"));
        startActivity(intent);
    }
}