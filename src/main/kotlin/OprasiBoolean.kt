fun main() {
    val nilaiUjian = 80
    val nilaiAbsen = 80
    val nilaiExtra = 80


    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusAbsen = nilaiAbsen > 75
    val apakahLUlusExtra = nilaiExtra > 80

    val apakahLulus = apakahLulusAbsen && apakahLulusUjian && apakahLUlusExtra
//    val apakahLulus = (apakahLulusAbsen && apakahLulusUjian) || apakahLUlusExtra

    println(apakahLulus)

}