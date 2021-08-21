fun main() {
    var name = "Dadang" to "UP"
    println(name)
}

infix fun String.to(type:String):String{
    if(type == "UP"){
        return this.toUpperCase()
    }else{
        return this.lowercase()
    }
}