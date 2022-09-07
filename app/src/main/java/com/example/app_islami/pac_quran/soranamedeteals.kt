package com.example.app_islami.pac_quran

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.app_islami.R
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

class soranamedeteals : AppCompatActivity() {

    var list = mutableListOf<String>()
    lateinit var  soranamedetails_recyclerview:RecyclerView
    lateinit var soranamedetealsAdapter:Sora_name_details_adapter
    lateinit var soranametextview:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soranamedeteals)
        soranamedetails_recyclerview = findViewById(R.id.sora_name_details_recyclerview)
        soranametextview = findViewById(R.id.sura_name_title)
        var soranams = intent.extras?.get("sora_name")
        var filename = intent.extras?.get("file_name")

        soranametextview.text = soranams.toString()

        readsoraline((filename ?: "") as String)
        soranamedetealsAdapter = Sora_name_details_adapter(list)
        soranamedetails_recyclerview.adapter = soranamedetealsAdapter


    }

    private fun readsoraline(filename:String) {
        val reader: BufferedReader

        try {
            val file = assets.open(filename)
            reader = BufferedReader(InputStreamReader(file))
            Log.e("readsoraline","fileName"+filename)
           list =  reader.readLines().toMutableList()
            Log.e("readsoraline","fileName"+ reader.lineSequence().toMutableList())


        } catch (ioe: IOException) {
            ioe.printStackTrace()
        }


    }
}