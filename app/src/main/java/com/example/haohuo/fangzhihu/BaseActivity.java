package com.example.haohuo.fangzhihu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by HaoHuo on 2018/1/2.
 */

public class BaseActivity extends AppCompatActivity {
    public Toolbar toolbar;
    /**
     *
     * @param title 标题栏标题
     * @param type  标题类型，1为带菜单栏的标题栏，2为带back键的标题栏
     */
    public void setTitle(String title,int type){

        toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(Color.WHITE);//标题字体颜色
        toolbar.setTitle(title);
        setSupportActionBar(toolbar);//设置为actionbar
        switch (type){
            case 1:
                toolbar.setNavigationIcon(R.drawable.bga_banner_point_disabled);
                break;
            case 2:
                toolbar.setNavigationIcon(R.drawable.bga_banner_point_enabled);
                toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });
        }


    }


}