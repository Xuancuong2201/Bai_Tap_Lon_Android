package com.example.baitaplon;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.baitaplon.databinding.ActivityMainBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    NavigationView navigationView;
    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_Guide, R.id.nav_User,R.id.nav_Menu)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
        AnhXa();
        ActionViewFlipper();
    }

    private void AnhXa() {
        viewFlipper=findViewById(R.id.viewflipper);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
    private void ActionViewFlipper()
    {
        ArrayList<String> mauquangcao = new ArrayList<>();
        //add ảnh vào mảng
        mauquangcao.add("https://img.pikbest.com/origin/06/19/45/34ApIkbEsTCp3.jpg!bwr800");
        mauquangcao.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTPQS2JQWEKzqMEHTlSsB_3ylpw5HwZ8_nmmQ&usqp=CAU");
        mauquangcao.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRyxIigQIUrmOhVAw8vqXMNFe1UEExnx2dEaNF8s_N19P1MsWVf76G0O1x-xDFITsdTSa8&usqp=CAU");
        mauquangcao.add("https://90scoffee.vn/wp-content/uploads/2020/12/ca-phe-nguyen-chat-tu-lam-12.jpg");

        //vòng lặp for gắn ảnh vào imageview , rồi từ imageview lên app
        for(int i =0;i< mauquangcao.size();i++)
        {
            ImageView imageView = new ImageView(getApplicationContext());
            Picasso.get().load(mauquangcao.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            viewFlipper.addView(imageView);
        }
        viewFlipper.setFlipInterval(2000);
        viewFlipper.setAutoStart(true);

        Animation  animation_slide_in = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_in_right);
        Animation animation_slide_out = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_out_right);

        viewFlipper.setInAnimation(animation_slide_in);
        viewFlipper.setInAnimation(animation_slide_out);

    }
}