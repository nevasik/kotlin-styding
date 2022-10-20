package CourseKotlin

fun main() {
    // var - от слова variables и обозначает изменяемую переменную
    // val == final - от слова value, и обозначает переменную только для чтения или присвоенную один раз

    var answer = 0;
    answer = 42
    println(answer)

    val readOnlyList = listOf("Java")
    // этот список мы не можем изменять, т.к. он только для чтения

    val  mutableList = mutableListOf("Java")
    mutableList.add("Kotlin")
    // а этот список мы можем изменить, т.к. он mutable, что значит изменяемый
}