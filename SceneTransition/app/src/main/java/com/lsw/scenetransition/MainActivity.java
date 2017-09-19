package com.lsw.scenetransition;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView iv_first;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 设置允许转场
//        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        setContentView(R.layout.activity_main);
        iv_first = (ImageView) findViewById(R.id.iv_first);

    }

    public void firstclick(View view) {
        /**
         * 单个元素转场
         */
//        Intent intent = new Intent(this, SecondActivity.class);
//        ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this, iv_first, "image");
//        startActivity(intent, activityOptionsCompat.toBundle());
        /**
         * 多个元素转场
         */
        Intent intent = new Intent(this, SecondActivity.class);
        ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this, Pair.create((View) iv_first, "image"));
        startActivity(intent, activityOptionsCompat.toBundle());
//        Intent intent = new Intent(this, SecondActivity.class);
//        startActivity(intent);
//        /**
//         * parm1 新的activity进入动画
//         * parm2 旧的activity出去的动画
//         */
//        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
    }
}
