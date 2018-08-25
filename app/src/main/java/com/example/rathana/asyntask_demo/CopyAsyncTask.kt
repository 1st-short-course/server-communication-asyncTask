package com.example.rathana.asyntask_demo

import android.os.AsyncTask

class CopyAsyncTask : AsyncTask<Void,Int,Boolean>(){

    override fun onPreExecute() {
        super.onPreExecute()
    }
    override fun onPostExecute(result: Boolean?) {
        super.onPostExecute(result)
    }
    override fun doInBackground(vararg params: Void?): Boolean {
        return true
    }

    override fun onProgressUpdate(vararg values: Int?) {
        super.onProgressUpdate(*values)
    }
}