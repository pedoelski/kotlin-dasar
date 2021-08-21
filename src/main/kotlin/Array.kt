fun main() {
    // Type Data Array
    // Default Array tidak boleh null
    val member: Array<String> = arrayOf("Hagia", "Rizki", "Maulana")
    val values: Array<Byte> = arrayOf(12, 32, 122)

    // Type Data Array Boleh Null
    var mahasiswa:Array<String?> = arrayOfNulls(3)
    mahasiswa[0] = "Ainaih Rona"
    mahasiswa[1] = "Dadang Rudiansyah"
    mahasiswa[2] = "Wisnu Wardana"

    //Function
    println(member.size)
    println(member.set(0,"Asep"))
    println(member.get(0))
    println(values)

    // Access array yang boleh null
    println(mahasiswa[0])
}