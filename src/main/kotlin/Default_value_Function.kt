

fun main(args:Array<String>){
    println(test("Bell manor"))
    val day=randomday()
    println(shouldwaterchange(day =day,20,20))

}

fun test(name:String="Fenil"):String{
    return name
}

// This is an example of function with an default value for the parameter as we can see that if we do not
// pass any value for the parameter then still it takes the default value and prints its value


// let us add an feature inside the function which would tell whether to change the water of fish tank or not

fun shouldwaterchange(day:String,temperature:Int,dirtlevel:Int):String{
    return when{
        day =="Sunday" -> "Yes"
        temperature > 30 ->"Yes"
        dirtlevel >30 -> "Yes"
        else -> "No"
    }
}



