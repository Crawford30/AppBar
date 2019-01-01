package com.example.appbarfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    //Firsts method: overrid some method to call the menu

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        //we bind or menu.xml file with the menu. menu inflater binds menu.xml  with the menu of the app bar
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    //second method: Handling click events

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //we create the id
        val id = item.itemId
        if (id == R.id.search) {
            Toast.makeText(this, "search", Toast.LENGTH_LONG).show()
        }


        if (id == R.id.aboutus) {
            Toast.makeText(this, "About Us", Toast.LENGTH_LONG).show()
        }

        if (id == R.id.contactus) {
            Toast.makeText(this, "Contact Us", Toast.LENGTH_LONG).show()
        }

        return super.onOptionsItemSelected(item)
    }

}
