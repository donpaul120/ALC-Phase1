package exam.android.alcphase1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openActivityA(view: View) = startActivity(Intent(this.applicationContext, ActivityB::class.java))

    fun openActivityB(view: View) = startActivity(Intent(this.applicationContext, ActivityC::class.java))
}
