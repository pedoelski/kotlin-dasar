fun main() {
    val range = 1..100

    var range2 = 1000 downTo  0

    var range3 = 1000 downTo 0 step 34

    //function oprrasi range
    println(range)
    println(range.count())
    println(range.contains(20))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)

    println(range2)
    println(range2.count())
    println(range2.contains(20))
    println(range2.contains(200))
    println(range2.first)
    println(range2.last)
    println(range2.step)

    println(range3)
    println(range3.count())
    println(range3.contains(20))
    println(range3.contains(200))
    println(range3.first)
    println(range3.last)
    println(range3.step)

}