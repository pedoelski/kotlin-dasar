fun main() {
    println(sayHello("Wisnu"))
    println(sayHello())
    println(nilaiStudy("B"))
}


fun nilaiStudy(nilai:String = ""):String{
    return when(nilai){
        "A" -> "Amazing"
        "B" -> "GoodJob"
        "C" -> "Not Bad"
        else -> "Try Again"
    }
}

fun sayHello(name:String = ""):String{
    return if (name == ""){
        "Hello bro !!!"
    }else{
        "Helloo $name"
    }
}