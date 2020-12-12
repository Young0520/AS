package com.yll.as;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class UserMainActivity extends AppCompatActivity {
    private static String userid = null;
    public static String getUserid() {
        return userid;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_activity_main);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNavigationView);
        NavController controller= Navigation.findNavController(this,R.id.fragment);
        AppBarConfiguration appBarConfiguration=new AppBarConfiguration.Builder(bottomNavigationView.getMenu()).build();
        NavigationUI.setupActionBarWithNavController(this,controller,appBarConfiguration);
        NavigationUI.setupWithNavController(bottomNavigationView,controller);

        userid=getIntent().getStringExtra("id");
    }
}


