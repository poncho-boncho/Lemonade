package poncho.boncho.lemonade

import com.google.android.material.snackbar.Snackbar

class Lemonade {

    var state = "SELECT"
    private var lemonSize: Int = 10
    var squeezeCount: Int = 0

     fun stateIsRestart() {
        state = "SELECT"

    }

     fun stateIsDrink() {
        state = "RESTART"
        lemonSize = -1
    }

     fun stateIsSqueeze(defaultSnackbar: Snackbar) {
        squeezeCount+=1
        println(squeezeCount)
        defaultSnackbar.setText("Вы выжали лемон $squeezeCount раз")
        defaultSnackbar.show()
        if (lemonSize !=0)
            lemonSize--
        else {
            state = "DRINK"
            squeezeCount=0
        }
    }

    fun stateIsSelect() {
        state = "SQUEEZE"
        lemonSize = 10
        squeezeCount = 0
    }
}
