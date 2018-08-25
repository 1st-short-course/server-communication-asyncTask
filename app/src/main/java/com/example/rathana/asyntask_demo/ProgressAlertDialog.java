package com.example.rathana.asyntask_demo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ProgressAlertDialog extends DialogFragment {
    private ProgressBar progressBar;
    private TextView tvResult;
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        View view= LayoutInflater.from(getActivity()).inflate(R.layout.progressbar_dialog_layout,null);
        progressBar=view.findViewById(R.id.progressBar);
        tvResult=view.findViewById(R.id.result);
        builder.setView(view);
        return builder.create();
    }
    public  void updateProgressBar(int value){
        this.progressBar.setProgress(value);
    }
    public  void updateResult(String value){
        this.tvResult.setText(value);
    }

}
