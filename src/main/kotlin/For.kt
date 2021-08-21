fun main() {
    val names:Array<String> = arrayOf("Asep Rizki", "Ainiah Rona Darni","Hagia Alisya")
    var total = 0
    for(name in names){
        println(name)
        total++
    }
    println("total perulangan ${total}")

    //For Range
    for (i in 10 downTo 1 step 2){
        println(i)
    }

    val ukuranArray = names.size - 1

    for(i in 0..ukuranArray){
        println("Index ${i} = ${names.get(i)}")
    }

}