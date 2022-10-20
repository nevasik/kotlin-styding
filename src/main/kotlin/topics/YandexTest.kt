package topics

fun main(args: Array<String>) {
    val j = readLine()!!
    val s = readLine()!!

    var result = 0
    for (i in s) {
        if (j.contains(i)) {
            result += 1
        }
    }

    println(result)
}