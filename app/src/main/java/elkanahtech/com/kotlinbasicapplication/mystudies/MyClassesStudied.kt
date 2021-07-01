package elkanahtech.com.kotlinbasicapplication.controls

class  Person(val name: String, var weightLbs: Double){
    fun eatDessert(addedIceCream: Boolean = true){
        weightLbs += if(addedIceCream) 4.0 else 2.0
    }
    fun  calcGoalWeightLbs(lbsToLose: Double = 10.0): Double {
        return weightLbs - lbsToLose
    }
}