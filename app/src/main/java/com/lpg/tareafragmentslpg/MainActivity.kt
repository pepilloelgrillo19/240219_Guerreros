package com.lpg.tareafragmentslpg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var navBar:NavigationBarView = findViewById(R.id.bottom_NavigationView)
        navBar.setOnItemSelectedListener {  item ->
        //NavigationBarView.OnItemSelectedListener { item ->
            when(item.itemId) {
                R.id.backButton -> {
                    onBackPressed()
                    true
                }
                R.id.homeButton -> {

                    val blankFragment1 = BlankFragment1()

                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, blankFragment1)
                        .addToBackStack(null)
                        .commit()

                    true
                }
                else -> false
            }
        }


    }

}