package poncho.boncho.lemonade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lemonImage: ImageView = findViewById(R.id.imageView)
        val lemonade = Lemonade()
        lemonImage.setImageResource(R.drawable.lemonthree_0001)
        var condition = 1
        lemonImage.setOnClickListener{ clickLemonImage(lemonImage, lemonade) }
    }

    private fun clickLemonImage(lemonImage: ImageView, lemonade: Lemonade){
        lemonade.nextCondition()
        val drawableResours = when (lemonade.condition){
            1 -> R.drawable.lemonthree_0001
            2 -> R.drawable.lemonstep2
            else -> R.drawable.lemonstep2
        }
        lemonImage.setImageResource(drawableResours)

    }
}