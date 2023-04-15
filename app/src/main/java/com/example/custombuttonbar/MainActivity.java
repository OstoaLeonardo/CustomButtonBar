package com.example.custombuttonbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int selectedTab = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout homeLayout = findViewById(R.id.homeLayout);
        final LinearLayout likesLayout = findViewById(R.id.likesLayout);
        final LinearLayout notificationsLayout = findViewById(R.id.notificationsLayout);
        final LinearLayout profileLayout = findViewById(R.id.profileLayout);

        final ImageView homeImage = findViewById(R.id.homeImage);
        final ImageView likesImage = findViewById(R.id.likesImage);
        final ImageView notificationsImage = findViewById(R.id.notificationsImage);
        final ImageView profileImage = findViewById(R.id.profileImage);

        final TextView homeText = findViewById(R.id.homeText);
        final TextView likesText = findViewById(R.id.likesText);
        final TextView notificationsText = findViewById(R.id.notificationsText);
        final TextView profileText = findViewById(R.id.profileText);

        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.fragmentContainer, HomeFragment.class, null).commit();

        homeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTab != 1) {
                    getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.fragmentContainer, HomeFragment.class, null).commit();

                    getWindow().setStatusBarColor(getResources().getColor(R.color.home_20));

                    likesText.setVisibility(View.GONE);
                    notificationsText.setVisibility(View.GONE);
                    profileText.setVisibility(View.GONE);

                    likesImage.setImageResource(R.drawable.favorite_outline);
                    notificationsImage.setImageResource(R.drawable.notifications_outline);
                    profileImage.setImageResource(R.drawable.person_outline);

                    likesLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    notificationsLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    profileLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    homeText.setVisibility(View.VISIBLE);
                    homeImage.setImageResource(R.drawable.home_selected_outline);
                    homeLayout.setBackgroundResource(R.drawable.round_back_home_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0f, Animation.RELATIVE_TO_SELF, 0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    homeLayout.startAnimation(scaleAnimation);

                    selectedTab = 1;
                }
            }
        });

        likesLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTab != 2) {
                    getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.fragmentContainer, LikesFragment.class, null).commit();
                    getWindow().setStatusBarColor(getResources().getColor(R.color.likes_20));

                    homeText.setVisibility(View.GONE);
                    notificationsText.setVisibility(View.GONE);
                    profileText.setVisibility(View.GONE);

                    homeImage.setImageResource(R.drawable.home_outline);
                    notificationsImage.setImageResource(R.drawable.notifications_outline);
                    profileImage.setImageResource(R.drawable.person_outline);

                    homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    notificationsLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    profileLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    likesText.setVisibility(View.VISIBLE);
                    likesImage.setImageResource(R.drawable.favorite_selected_outline);
                    likesLayout.setBackgroundResource(R.drawable.round_back_likes_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1f, 1f, 1f, Animation.RELATIVE_TO_SELF, 1f, Animation.RELATIVE_TO_SELF, 0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    likesLayout.startAnimation(scaleAnimation);

                    selectedTab = 2;
                }
            }
        });

        notificationsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTab != 3) {
                    getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.fragmentContainer, NotificationsFragment.class, null).commit();
                    getWindow().setStatusBarColor(getResources().getColor(R.color.notifications_20));

                    homeText.setVisibility(View.GONE);
                    likesText.setVisibility(View.GONE);
                    profileText.setVisibility(View.GONE);

                    homeImage.setImageResource(R.drawable.home_outline);
                    likesImage.setImageResource(R.drawable.favorite_outline);
                    profileImage.setImageResource(R.drawable.person_outline);

                    homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    likesLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    profileLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    notificationsText.setVisibility(View.VISIBLE);
                    notificationsImage.setImageResource(R.drawable.notifications_selected_outline);
                    notificationsLayout.setBackgroundResource(R.drawable.round_back_notifications_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1f, 1f, 1f, Animation.RELATIVE_TO_SELF, 1f, Animation.RELATIVE_TO_SELF, 0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    notificationsLayout.startAnimation(scaleAnimation);

                    selectedTab = 3;
                }
            }
        });

        profileLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTab != 4) {
                    getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.fragmentContainer, ProfileFragment.class, null).commit();
                    getWindow().setStatusBarColor(getResources().getColor(R.color.profile_20));

                    homeText.setVisibility(View.GONE);
                    likesText.setVisibility(View.GONE);
                    notificationsText.setVisibility(View.GONE);

                    homeImage.setImageResource(R.drawable.home_outline);
                    likesImage.setImageResource(R.drawable.favorite_outline);
                    notificationsImage.setImageResource(R.drawable.notifications_outline);

                    homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    likesLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    notificationsLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    profileText.setVisibility(View.VISIBLE);
                    profileImage.setImageResource(R.drawable.person_selected_outline);
                    profileLayout.setBackgroundResource(R.drawable.round_back_profile_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1f, 1f, 1f, Animation.RELATIVE_TO_SELF, 1f, Animation.RELATIVE_TO_SELF, 0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    profileLayout.startAnimation(scaleAnimation);

                    selectedTab = 4;
                }
            }
        });
    }
}