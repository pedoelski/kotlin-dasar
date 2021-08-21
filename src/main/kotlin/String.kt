fun main() {
    var first_name:String = "Asep"
    var middle_name:String = "Rizki"
    var last_name:String = "Maulana"

    var address:String = """
       |Jalan Belum Jadi, RT 01 RW 02
       |Kawalu
       |Tasikmalaya
    """.trimMargin("|")

    var fullname:String = first_name + " "+ middle_name +" "+last_name

    //String Tempalte
    var fullname2: String = "$first_name $last_name"

    println(first_name)
    println(middle_name)
    println(last_name)
    println(address)
    println(fullname)
    println(fullname2)

    //call function string
    println("${address.length}")
}