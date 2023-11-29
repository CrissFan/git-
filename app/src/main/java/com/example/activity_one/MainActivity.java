package com.example.activity_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Log.d("fan","onCreate");
        Button button1 = (Button) findViewById(R.id.button_start);
        Button button2 = (Button) findViewById(R.id.button_end);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this,"ELON MUSK",Toast.LENGTH_LONG).show();
//              action 触发事件，intent隐式和显示触发规则
//                Intent intent = new Intent("com.example.activitytest.ACTION_START");
//                intent.addCategory("com.example.activitytest.MY_CATEGORY");
//                startActivities(new Intent[]{intent});
//              intent内置uri方法访问浏览器网页
/*                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https:\\www.baidu.com"));
                startActivities(new Intent[]{intent}); */
                /*intent在启动活动的时候传递数据，intent中提供了一系列putextra()方法，可以在启动时将数据暂存到intent中*/
                String data = "Hello the second activity";
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    intent.putExtra("extra_data",data);
                    startActivity(intent);


            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        /*此处添加注释，进行git控制
        * 通过status即可查看此处的修改变化内容*/
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        int itemId = item.getItemId();
        if (itemId == R.id.add_item) {
            Toast.makeText(this, "you push the add button", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.remove_item) {
            Toast.makeText(this, "you push the remove button", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}