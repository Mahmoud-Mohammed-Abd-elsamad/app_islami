package com.example.app_islami

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class Fragment_sebha : Fragment() {

    lateinit var zekr_number: TextView
    lateinit var zekr_name: Button
    var counter:Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sebha, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        zekr_number = view.findViewById(R.id.zekr_nuber_textview)
        zekr_name = view.findViewById(R.id.zekr_name_button)

        zekr_number.setText("0")
        zekr_name.setText("سبحان الله")

        zekr_name.setOnClickListener { it ->
          counter++

            if (counter <= 33){
                zekr_number.setText(counter.toString())
                zekr_name.setText("سبحان الله")

            }else if(counter <= 66){
                zekr_number.setText((counter - 33).toString())
                zekr_name.setText("الحمدلله ")

            }else if (counter <= 99){
                zekr_number.setText((counter - 66).toString())
                zekr_name.setText("الله اكبر")
            }else
                counter = 0


        }

    }
}