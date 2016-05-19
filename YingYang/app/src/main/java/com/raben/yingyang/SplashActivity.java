package com.raben.yingyang;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by raben on 16-May-16.
 */
public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final ImageView IV = (ImageView) findViewById(R.id.imageview_splash_id);
        final Animation Anmi = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate);
        final Animation AnmiFade = AnimationUtils.loadAnimation(getBaseContext(), R.anim.abc_fade_out);

        IV.startAnimation(Anmi);

        Anmi.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                IV.startAnimation(AnmiFade);
                finish();
                Intent i = new Intent(SplashActivity.this,RegisterActivity.class);
                startActivity(i);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
