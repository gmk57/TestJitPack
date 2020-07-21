package gmk57.testjitpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import gmk57.library.Foo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foo = Foo()
        println("bar = ${foo.getBar()}")
    }
}
