fun main() {
    sayHello("Joko", "Widodo")
    sayHello("Hagia")
}

fun sayHello(firstName: String, lastName: String? = null){
    if (lastName == null){
        println("Hallo $firstName")
    }else{
        println("Hello ${firstName} ${lastName}")
    }
}