package poncho.boncho.lemonade

import android.widget.ImageView

class Lemonade {

    var condition = 1

    fun nextCondition(){
        if (condition>=3){
            condition=1
        }
        else condition++
    }
}