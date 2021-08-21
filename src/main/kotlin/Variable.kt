//Constant Harus Global
const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {
    //variable mutable
    var name:String? = null
    name="Hagia"
    name="Rizki"

    //variable immutable
    val lastname:String = "Maulana"
    //Error
    //lastname = "Hagia"

    println(name)
    println(lastname)
    println(VERSION)
    println(APPLICATION)
}