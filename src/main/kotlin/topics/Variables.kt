package topics

fun main() {
    val test1 = 3 // константа

    var test2 = 4 // обычная переменная

    println("Value of test2 ${test1 + test2}")
    println("Sum is ${2 + 2}")

    test2 = 10
    println("Ok, A got it: $test2")

    val list = ArrayList<String>(3)
    list.add("10")
    list.add("11")
    println(list.size)
}


