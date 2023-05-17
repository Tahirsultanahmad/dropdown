package com.example.dropdownitem

import android.app.Activity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.PopupMenu


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      val image = findViewById<ImageButton>(R.id.dropdown_menuClick)
        image.setOnClickListener {
                //Creating the instance of PopupMenu
                val popup = PopupMenu(this@MainActivity, image)
                //Inflating the Popup using xml file
                popup.getMenuInflater()
                    .inflate(R.menu.nav_menu, popup.getMenu())

                //registering popup with OnMenuItemClickListener
//                popup.setOnMenuItemClickListener(object : OnMenuItemClickListener() {
//                    fun onMenuItemClick(item: MenuItem): Boolean {
//                        Toast.makeText(
//                            this@MainActivity,
//                            "You Clicked : " + item.getTitle(),
//                            Toast.LENGTH_SHORT
//                        ).show()
//                        return true
//                    }
//                })
                popup.show() //showing popup menu
            }
    }
}