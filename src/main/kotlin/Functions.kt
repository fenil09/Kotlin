import kotlin.random.Random
import java.util.*
fun main(args: Array<String>) {

println(add(7,7))
   println(IsHot(20))
    println(feedthefish())
    val day=randomday()
    println(Determine(day))
}

// normal funcion which would take two input and give us the addition of them

fun add(x:Int, y:Int):Int{
    return x+y
}

// creating a function which would take temperature as the input and tell use whether it is
// hot or not.

fun IsHot(temperature:Int):String{
  if(temperature>50) return "Hot" else return "Cool"
}

// Learning about the when statements and using them in functions
// creating a function called feedthefish that uses randomday function to get an random day
// and print the food to feed for fish on that day



fun feedthefish(){
    val day=randomday()
    val food=randomfood()
    println("Day is $day and the fish would eat $food")
}


fun randomday():String{
    val randomgenerator=java.util.Random()
    val days= arrayOf("Monday","Tuesday","Wednesday","Thursday")
    return days[randomgenerator.nextInt(days.size)]
}

fun randomfood():String{
    val randomfoodgenerator= java.util.Random()
    val food= arrayOf("meat","chicken","eggs","fish")
    return food[randomfoodgenerator.nextInt(food.size)]

}



// using when statements inside the code blocks which helps to simplify the if else expressions.

  fun Determine(day:String):String{
      var food=""
      when(day){
          "Monday" -> food= "Flakes"
          "Tuesday" -> food= "Burger"
      }
      return food
  }




