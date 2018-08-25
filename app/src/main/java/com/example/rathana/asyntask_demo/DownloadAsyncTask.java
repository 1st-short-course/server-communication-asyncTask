package com.example.rathana.asyntask_demo;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;

public class DownloadAsyncTask extends AsyncTask<Void,Integer,Boolean>{
    private AppCompatActivity activity;
    private ProgressAlertDialog dialog;
    private int value;
    public DownloadAsyncTask(AppCompatActivity appCompatActivity) {
        this.activity = appCompatActivity;
    }

    @Override
    protected void onPreExecute() {
        dialog=new ProgressAlertDialog();
        dialog.show(activity.getFragmentManager(),"progressbar");
    }

    @Override
    protected Boolean doInBackground(Void... voids) {
        while(value<=100){
            value ++;
            try {
                publishProgress(value);
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        dialog.updateProgressBar(values[0]);
        dialog.updateResult(values[0]+"%");
    }

    @Override
    protected void onPostExecute(Boolean aBoolean) {
        super.onPostExecute(aBoolean);
        dialog.updateResult("completed");

    }
}
