fun main() {
    hello("Prabowo")
    hello("Hagia","Alisya")
}

fun hello(firstName:String, lastName:String = ""){
    println("Hello $firstName $lastName")
}