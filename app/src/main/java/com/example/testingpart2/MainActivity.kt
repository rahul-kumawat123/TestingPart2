package com.example.testingpart2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Create an application Espresso tests :-
        Use a Button to mark a Content Favorite on clicking on it. When the content is marked
        favorite a checkbox is checked and when it is removed from favorite it is unchecked.
 */


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        favouriteBtn.setOnClickListener {
            if (!checkBox.isChecked){
                addItem()
            }else{
                removeItem()
            }
        }
    }

    private fun addItem(){
        checkBox.isChecked = true
        checkBox.isEnabled = false
        showToast("Item Added to favourite")
    }

    private fun removeItem(){
        checkBox.isChecked = false
        checkBox.isEnabled = true
        showToast("Item Removed from Favourite")
    }
}