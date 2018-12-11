package com.maho.upi.ggapp

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.widget.EditText
import android.widget.ListView
import com.maho.upi.ggapp.R.id.input
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var listView: ListView? = null
    //var input: EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listGenapganjil)
        var adapter = ListAdapter(this, generateData())
        listView?.adapter = adapter

        btn_Generate.setOnClickListener{
            generateData()
        }

    }

    private fun generateData(): ArrayList<Model> {
        var result = ArrayList<Model>()
        var data = input.text.toString().toInt()
        for (a in 0..data){
            if(a % 2 == 0){
                var listGG = Model(a,"Bilangan","Genap")
                result.add(listGG)
            }else{
                var listGG = Model(a,"Bilangan","Ganjil")
                result.add(listGG)
            }

        }

        return result
    }



}





