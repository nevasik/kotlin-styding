package topics

fun main() {
    testWhen(1)
    testWhen("Hello")
    testWhen(15)
}

// testWhen(Object object)
fun testWhen(input : Any) { // Any - обозначает любой тип данных

    when(input) {
        1 -> println("Единица")
        2 -> println("Двойка")
        in 10..20 -> println("От 10 до 20") // условие если число будет в промежутке от до 20
        is String -> println("Была введена строка ${input.length}") // условие если введена строка
        else -> println("Что-то ещё")
    }
}

/**
 * public void test(Object object) {
 *    if(input instanceof String) {
 *       String strInput = (String) input;
 *    }
 *
 *    if(input instanceof Integer) {
 *        ...
 *    }
 * }
 */

