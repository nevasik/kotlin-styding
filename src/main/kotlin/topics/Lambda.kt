package topics

fun main() {
    val a = listOf(1, 2, 3, 4, 5)

    a.forEach { e -> println(e)} // выводит каждый элемент(перебирая его через foreach)
    println()

    println(a.map {e -> e * 2} )// что-то делает со всеми элементами
    println()

    println(a.filter { e -> e % 2 == 0 }) // оставляет только чётные значения
    println()

    println(a.reduce { sum, e -> sum + e}) // проссумирует все элементы из этого списка
    println()

    println(a.sortedByDescending { it}) // по чему будем сортироваться(поле или ещё что-то)
    println()

    println(a.any { it > 10 }) // функция итерируется по списку или коллекции и возвращает true, если хотя-бы один элемент который удовлетворяет условию
    //!!! если мы итерируемся по коллекции, то в условии обозначаем переменную "it"
    println()

    println(a.all { it < 10 }) // функция возвращает true, если все элементы списка/коллекции удовлетворяют условию
    println()

    println(a.sum()) // суммирует все элементы списка/коллекции
    println()

    val numbers = listOf(1, 3, -4, 2, -11)
    val (positive, negative) = numbers.partition { it > 0 }
    // разделяет список на два списка, по какому- то условию, в нашем случаю у нас будут в одном списке положительные элементы, в другом отрицательные
    println(positive)
    println(negative)
    println()

    val result = listOf("a", "b", "ba", "ccc", "ad").groupBy { it.length } // сгруппировали все элементы по длине
    println(result) // HashMap или LinkedHashMap
}