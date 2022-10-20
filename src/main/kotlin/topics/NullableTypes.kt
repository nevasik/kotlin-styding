package topics

fun main() {
    var a = "Hello"
    // a = null // NPE исключения

    println(a.length)

    var b: String? = "Test" // String? - значит может быть String и null, у таких переменных мы не можем вызывать методы String
    b = null
    //println(b.length)

    b?.length // (называется save col) - если String, то вернёт length, если null -> null (Никаких NPE)

    // bob?.department?.head?.name - если у кого-то null, то вернём вообщем null (Никаких NPE)

    // Elvis оператор
    val l = b?.length ?: -1 // если b.length == true, то в переменную l будет положено значение, иначе -1

    b = if ((0..10).random() > 5) "asdf" else null
    // !! оператор - выбрасывает NPE в случае если в переменной null, иначе вызывается обычный метод length
    val t = b!!.length
    println(t)
}