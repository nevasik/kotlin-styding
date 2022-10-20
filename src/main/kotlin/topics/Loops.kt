package topics

fun main() {
    // for each
    val items = listOf("apple", "banana", "orange") // неизменяемый список строк(List.of()) Java 9
    // mutableListOf("apple", "banana", "orange") // изменяемый список (ArrayList)

    for (item in items)
        println(item)

    // while
    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
                index++
    }

    // Диапазоны (как в Python)
    println(5 in 3..10) // true

    for (i in 1..10)
        println(i)

    for (i in 1 until 10)
        // until - диапазон(от 1 до 10 не включительно)
        println(i)

    for (i in 10 downTo 1)
        // downTo - диапазон с 10 до 1 включительно
        println(i)

    for (i in 0..100 step 10)
        // step - пропуски, т.e. мы пропускаем каждый раз по 10 значений
        println(i)


}