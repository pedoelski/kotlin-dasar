fun main() {
    val lambdaUpper = {value:String -> value.toUpperCase()}

    println(hello("Asep Rizki", lambdaUpper))
    println(hello("Hagia", {value:String -> value.toUpperCase()}))

    //Trailing Lambda
    val result = hello("Dadang"){
        value -> value.toLowerCase()
    }
    println(result)
}

fun hello(name:String, trans:(String) -> String):String{
    val nameTrans = trans(name)
    return "Hello $nameTrans"
}
