package dk.deepak.frag

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val f1 = findViewById<TextView>(R.id.f1)
        val f2 = findViewById<TextView>(R.id.f2)
        val f3 = findViewById<TextView>(R.id.f3)


        f1.setOnClickListener {
            replaceFrameWithFragment(h1_frag())
        }
        f2.setOnClickListener {
            replaceFrameWithFragment(h2_frag())
        }
        f3.setOnClickListener {
            replaceFrameWithFragment(h3_frag())
        }
    }

    private fun replaceFrameWithFragment(frag:Fragment) {
        val fragManager = supportFragmentManager
        val fragTrasaction = fragManager.beginTransaction()
        fragTrasaction.replace(R.id.frame,frag)
        fragTrasaction.commit()

    }

}