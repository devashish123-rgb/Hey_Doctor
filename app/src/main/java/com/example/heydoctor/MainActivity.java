package com.example.heydoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void logout(View view){
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),Login.class));
        finish();
    }

    public void emergency(View view)
    {
        Intent intent=new Intent(this, Emergency.class);
        startActivity(intent);
    }
    public void medical(View view)
    {
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/medical+stores+near+me"));
        startActivity(intent);
    }
    public void specialist(View view)
    {
        Intent intent=new Intent(this, Specialist.class);
        startActivity(intent);
    }


}