package com.example.hzcj.mytabviewdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.hzcj.mytabviewdemo.adapter.MainViewAdapter;
import com.example.hzcj.mytabviewdemo.listener.OnTabSelectedListener;
import com.example.hzcj.mytabviewdemo.widget.Tab;
import com.example.hzcj.mytabviewdemo.widget.TabContainerView;

//import com.chenxi.tabview.adapter.MainViewAdapter;
//import com.chenxi.tabview.listener.OnTabSelectedListener;
//import com.chenxi.tabview.widget.Tab;
//import com.chenxi.tabview.widget.TabContainerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_container);
        TabContainerView tabContainerView = (TabContainerView) findViewById(R.id.tab_container);
        MainViewAdapter mainViewAdapter=new MainViewAdapter(getSupportFragmentManager(),
                new Fragment[] {new TabFragment1(), new TabFragment2(),new TabFragment3(), new TabFragment4(),new TabFragment5()});
        mainViewAdapter.setHasMsgIndex(5);
        tabContainerView.setAdapter(mainViewAdapter);
        tabContainerView.setOnTabSelectedListener(new OnTabSelectedListener() {
            @Override
            public void onTabSelected(Tab tab) {
               Toast.makeText(MainActivity.this,tab.getText(),Toast.LENGTH_SHORT).show();
            }
        });


    }
}
