package com.example.app_islami

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home_screen : AppCompatActivity() {
   lateinit var bottomNavigation :BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)
        bottomNavigation = findViewById(R.id.bottom_navigation_activity)
        bottomNavigation.setOnItemSelectedListener { item->

            if(item.itemId == R.id.icon_quran){
                supportFragmentManager.beginTransaction().replace(R.id.fragment_cntainer,Fragment_quran()).commit()
            }else if(item.itemId == R.id.icon_hadeth){
                supportFragmentManager.beginTransaction().replace(R.id.fragment_cntainer,Fragment_hadeth())
                    .commit()

            }else if(item.itemId == R.id.icon_radio) {
                supportFragmentManager.beginTransaction().replace(R.id.fragment_cntainer,BlankFragment_radioo())
                    .commit()
            }else if(item.itemId == R.id.icon_sebha){
            supportFragmentManager.beginTransaction().replace(R.id.fragment_cntainer, Fragment_sebha())
                .commit()
        }
            return@setOnItemSelectedListener true
        } }

    }
