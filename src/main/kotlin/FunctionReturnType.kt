fun main() {
    println(tambihkeun(40,30))
    var result = tambihkeun(39,1982)
    println(result)

    println(bagi(100,0))
}

fun tambihkeun(a:Int,b:Int):Int{
    val total = a+b
    return total
}

fun bagi(a:Int, b:Int):Int{
    if(b==0){
        return 0
    }else{
        val result = a/b
        return result
    }
}