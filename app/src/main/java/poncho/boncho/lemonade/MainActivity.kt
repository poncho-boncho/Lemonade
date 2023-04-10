package poncho.boncho.lemonade

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lemonade = Lemonade()
        val ccmain: ConstraintLayout = findViewById(R.id.layoutM)
        val defaultSnackbar = Snackbar.make(ccmain, "Вы выжали лемон ${lemonade.squeezeCount} раз",Snackbar.LENGTH_LONG)
        val lemonImage: ImageView = findViewById(R.id.imageView)
        lemonImage.setImageResource(R.drawable.lemon_tree)
        lemonImage.setOnClickListener{clickLemonImage(lemonade,defaultSnackbar)}
    }

    private fun clickLemonImage(lemonade: Lemonade,defaltSnackbar: Snackbar){
        when (lemonade.state){
            "SELECT"  -> lemonade.stateIsSelect()
            "SQUEEZE" -> lemonade.stateIsSqueeze(defaltSnackbar)
            "DRINK"   -> lemonade.stateIsDrink()
           else -> lemonade.stateIsRestart()
       }
        setViewElements(lemonade.state)
    }

    private fun setViewElements(lemonadeState: String) {

        val lemonImage: ImageView = findViewById(R.id.imageView)
        val instruction: TextView = findViewById(R.id.textView)

        val drawableResourse = when (lemonadeState){
            "SELECT"  -> R.drawable.lemon_tree
            "SQUEEZE" -> R.drawable.lemon_squeeze
            "DRINK"   -> R.drawable.lemon_drink
            else -> R.drawable.lemon_restart
        }
        val textResourse = when (lemonadeState){
            "SELECT"  -> getString(R.string.stageOne)
            "SQUEEZE" -> getString(R.string.stageTwo)
            "DRINK"   -> getString(R.string.stageThree)
            else -> getString(R.string.StageEnd)
        }

        lemonImage.setImageResource(drawableResourse)
        instruction.text = textResourse

    }

}