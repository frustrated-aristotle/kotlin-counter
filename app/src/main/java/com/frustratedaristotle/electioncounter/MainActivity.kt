package com.frustratedaristotle.electioncounter

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var names = arrayListOf<String>()
    var texts = arrayListOf<TextView>()
    var counts = arrayListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        arrayInit()
        buttonInit()
    }

    fun arrayInit()
    {
        names.add("Ahmet")
        names.add("Mehmet")
        names.add("Şöhret")
        names.add("Töhmet")

        texts.add(textView1)
        texts.add(textView2)
        texts.add(textView3)
        texts.add(textView4)

        counts.add(0)
        counts.add(1)
        counts.add(2)
        counts.add(3)
    }
    fun buttonInit() {
        button1M.setOnClickListener()
        {
                view -> Count(-1,0)
        }

        button2M.setOnClickListener()
        {
                view -> Count(-1,1)
        }
        button3M.setOnClickListener()
        {
                view -> Count(-1,2)

        }
        button4M.setOnClickListener()
        {
                view -> Count(-1,3)
        }
        button1P.setOnClickListener()
        {
                view -> Count(1,0)
        }
        button2P.setOnClickListener()
        {
                view -> Count(1,1)
        }
        button3P.setOnClickListener()
        {
                view -> Count(+1,2)
        }
        button4P.setOnClickListener()
        {
                view ->  Count(+1,3)
        }
    }

    fun Count(value : Int,index : Int)
    {
        counts[index] += value
        texts[index].text = "${names[index]} : ${counts[index]}"
    }
}