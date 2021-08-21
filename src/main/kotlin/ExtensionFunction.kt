fun main() {
    val name:String = "Dadang"
    println(name.hello())
    name.printHello()
}

fun String.printHello():Unit = println("Hallo Nama Saya Adalah $this")

fun String.hello():String{
    return "Hello $this"
}