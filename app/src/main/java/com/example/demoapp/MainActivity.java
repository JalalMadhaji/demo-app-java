package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.shape.CornerFamily;
import com.google.android.material.shape.MaterialShapeDrawable;

public class MainActivity extends AppCompatActivity {
    NavController navController;
    AppBarConfiguration appBarConfiguration;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawableLayout);
        navigationView = findViewById(R.id.sideMenu);
        navController = Navigation.findNavController(this, R.id.fragment);
        appBarConfiguration = new AppBarConfiguration.Builder(R.id.mainFragment).setOpenableLayout(drawerLayout).build();

        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        MaterialShapeDrawable navViewBackground = (MaterialShapeDrawable) navigationView.getBackground();
        navViewBackground.setShapeAppearanceModel(
                navViewBackground.getShapeAppearanceModel()
                        .toBuilder()
                        .setTopRightCorner(CornerFamily.ROUNDED,30)
                        .setBottomRightCorner(CornerFamily.ROUNDED,30)
                        .build());
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.fragment);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

}