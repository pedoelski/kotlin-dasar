fun main() {
    val lamdaName:(String) ->String = {
        value:String -> value.toUpperCase()
    }
    val tambahDua:(Int) -> Int = {
            value:Int -> value + 2
    }

    val contohLambda:(String, String)->String = {firstname, lastname ->
        val result = "Hallo $firstname $lastname"
        result
    }

    var lambdaName:(String) ->String = {
        var result = "Hello $it"
        result
    }

    var aini = lambdaName("Iniah Rona")
    println(aini)

    val hagia = contohLambda("Hagia", "Alisya")
    println(hagia)

    val nilai = tambahDua(4)
    println(nilai)

    val name = lamdaName("Asep")
    println(name)

    val toUpperCase:(String) -> String = ::toUpper

    val dadang = toUpperCase("Dadang")
    println(dadang)

}


fun toUpper(value: String):String{
       return value.toUpperCase()
}
