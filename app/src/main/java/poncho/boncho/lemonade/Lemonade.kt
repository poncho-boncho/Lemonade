package poncho.boncho.lemonade

import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import org.w3c.dom.Text

class Lemonade {

    var state = "SELECT"
    var lemonSize: Int = 10
    var squeezeCount: Int = 0

    public fun stateIsRestart() {
        state = "SELECT"

    }

    public fun stateIsDrink() {
        state = "RESTART"
        lemonSize = -1
    }

    public fun stateIsSqueeze(defaultSnackbar: Snackbar) {
        squeezeCount+=1
        println(squeezeCount)
        defaultSnackbar.setText("Вы выжали лемон ${squeezeCount} раз")
        defaultSnackbar.show()
        if (lemonSize !=0)
            lemonSize--
        else {
            state = "DRINK"
            squeezeCount=0
        }
    }

    public fun stateIsSelect() {
        state = "SQUEEZE"
        lemonSize = 10
        squeezeCount = 0
    }
}
