package poncho.boncho.lemonade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val processImage: ImageView = findViewById(R.id.imageView)

        processImage.setImageResource(R.drawable.lemonthree_0001)
    }
}