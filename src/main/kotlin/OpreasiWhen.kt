fun main() {

    var nilai = "D"

    when(nilai){
        "A" -> println("Amazing")
        "B" -> println("GOod")
        "C" -> println("Not Bad")
        "D" -> println("Bad")
        else -> println("Try Again")
    }

    when(nilai){
        "A","B","C" -> println("Pass")
        else -> println("Not Pass")
    }

    val nilaiLulus: Array<String> = arrayOf("A","B","C")

    when(nilai){
        in nilaiLulus -> println("SELAMAT ANDA LULUS")
        !in nilaiLulus -> println("ANDA TIDAK LULUS")
    }

    val name  = "Asep Rizki"

    when(name){
        is String -> println("Name is String")
        !is String -> println("Name Bukan String")
    }

}