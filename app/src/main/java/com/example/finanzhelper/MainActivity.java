package com.example.finanzhelper;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] mNavigationDrawerItemTitles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    Toolbar toolbar;
    private CharSequence mDrawerTitle;
    private CharSequence mTitle;
    ActionBarDrawerToggle mDrawerToggle;
    RecyclerView mRecyclerView;
    AssetAdapter mAssetAdapter;

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        View decorView=getWindow().getDecorView();
        int uiPotions= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
        decorView.setSystemUiVisibility(uiPotions);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set statusbar & nav bar transparent
        requestWindowFeature(1);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setBackground(null);
        bottomNavigationView.getMenu().getItem(0).setTitle(null);
        bottomNavigationView.getMenu().getItem(1).setTitle(null);
        bottomNavigationView.getMenu().getItem(2).setTitle(null);
        bottomNavigationView.getMenu().getItem(3).setTitle(null);

        //mRecyclerView=findViewById(R.id.assets_recyclerview);
        //mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        AssetAdapter assetAdapter = new AssetAdapter(this, getMyList());
        //mRecyclerView.setAdapter(assetAdapter);
    }

    private ArrayList<AssetModel> getMyList() {

        ArrayList<AssetModel> assetModels = new ArrayList<>();

        AssetModel assetModel = new AssetModel();
        assetModel.setTitle("News Feed");
        assetModel.setDescription("Test");
        assetModel.setImg(R.drawable.custom_login_button);
        assetModels.add(assetModel);

        assetModel = new AssetModel();
        assetModel.setTitle("Business");
        assetModel.setDescription("Test");
        assetModel.setImg(R.drawable.custom_login_button);
        assetModels.add(assetModel);

        assetModel = new AssetModel();
        assetModel.setTitle("People");
        assetModel.setDescription("Test");
        assetModel.setImg(R.drawable.custom_login_button);
        assetModels.add(assetModel);

        assetModel = new AssetModel();
        assetModel.setTitle("Notes");
        assetModel.setDescription("Test");
        assetModel.setImg(R.drawable.custom_login_button);
        assetModels.add(assetModel);

        return assetModels;
    }
}