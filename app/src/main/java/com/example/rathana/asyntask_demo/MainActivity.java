package com.example.rathana.asyntask_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnDownload;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDownload=findViewById(R.id.btnDownload);
        btnDownload.setOnClickListener(v->{
            new DownloadAsyncTask(this).execute();
            new CopyAsyncTask().execute();
        });
    }
}
