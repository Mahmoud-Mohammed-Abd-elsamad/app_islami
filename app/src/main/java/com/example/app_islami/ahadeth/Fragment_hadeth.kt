package com.example.app_islami.ahadeth

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.app_islami.R


class Fragment_hadeth : Fragment() {
    lateinit var hadeth_number_recyclerview: RecyclerView
    lateinit var hadethnumberadapter: Ahadeth_adapter
    var list = arrayOf<String>(
        "حديث رقم 1 ",
        "حديث رقم 2",
        "حديث رقم 3 ",
        "حديث رقم 4",
        "حديث رقم 5 ",
        "حديث رقم 6",
        "حديث رقم 7 ",
        "حديث رقم 8",
        "حديث رقم 9",
        "حديث رقم 10",
        "حديث رقم 11 ",
        "حديث رقم 12",
        "حديث رقم 13 ",
        "حديث رقم 14",
        " حديث رقم 15",
        "حديث رقم 16",
        "حديث رقم 17 ",
        "حديث رقم 18",
        "حديث رقم 19 ",
        "حديث رقم 20",
        "حديث رقم 21 ",
        "حديث رقم 22",
        "حديث رقم23 ",
        "حديث رقم 24",
        "حديث رقم 25 ",
        "حديث رقم 26",
        "حديث رقم 27 ",
        "حديث رقم 28",
        "حديث رقم 29 ",
        "حديث رقم 30",
        "حديث رقم 31 ",
        "حديث رقم 32",
        "حديث رقم 33 ",
        "حديث رقم 34",
        "حديث رقم 35 ",
        "حديث رقم 36",
        "حديث رقم 37",
        "حديث رقم 38",
        "حديث رقم 39 ",
        "حديث رقم 40"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hadeth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        hadeth_number_recyclerview = view.findViewById(R.id.fragment_hadeth_recyclerview)
        hadethnumberadapter = Ahadeth_adapter(list)
        hadeth_number_recyclerview.adapter = hadethnumberadapter

        hadethnumberadapter.hadethoncliclisner = object : Ahadeth_adapter.Oncliclisner {
            override fun onclic(hadethname: String, index: Int) {
                starthadethcontent(hadethname, index)
            }
        }

    }


    private fun starthadethcontent(hadethname: String, index: Int) {
        var intent = Intent(activity, hadeth_content::class.java)
        Log.e("starthadethcontent", "index " + index)
        intent.putExtra("fileName", "h${index + 1}.txt")
        Log.e("starthadethcontent", "fileName" + "h${index + 1}.txt")
        startActivity(intent)
    }
}

//
//
//    }
////
////    private fun fillist(): MutableList<String> {
////        for (i in 1..40) {
////           lateinit var list: MutableList<String>
////            var number: String = "حديث رقم$i"
////            Log.e("fun fillist", "number: " + number)
////            list.add(number)
////        }
////        return list
////    }
//}

