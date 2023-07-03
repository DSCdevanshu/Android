package com.example.buttongame

import android.content.ContentValues.TAG
import android.graphics.Color
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.buttongame.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setListner()
    }
    private fun setListner(){
        val clickable: List<View> = listOf(binding.textView1,binding.textView2,binding.textView3,binding.textView4,binding.textView5,binding.redButton,binding.blueButton,binding.greenButton )
        val colour: List<Int> = listOf(Color.BLACK,Color.BLUE,Color.CYAN,Color.YELLOW,Color.GRAY,Color.RED,Color.BLUE,Color.GREEN)
        for(i in 0..(clickable.size-1)){
                clickable[i].setOnClickListener{

                    if(i<5)
                        it.setBackgroundColor(colour[i])
                    else
                        clickable[i-3].setBackgroundColor(colour[i])
            }
            clickable[i].setBackgroundColor(getColor(R.color._light_green))

        }

    }

}