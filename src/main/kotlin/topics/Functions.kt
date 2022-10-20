package topics

fun main() {
    val testSimple = testSimple(5, 5)
    println(testSimple) // 10

    println()

    val testSimple1 = testString(10)
    println(testSimple1)

    println()

    val testNameArguments = testNameArguments(y = 4, z = 2, x = 5)
    println(testNameArguments)

    println()

    testDefaultArguments()
    testDefaultArguments(y = 1)
    testDefaultArguments(3, 5)

    //println(foo("Dima", 42, false))
    println()

    printEven(1, 2, 3, 4, 5, 6, 7, 8)
    println("PrintEven")
    printEven(*intArrayOf(1, 2, 3, 4, 5), 6, 7, 8, 9, 10)
}

//    название(аргументы)     : тип возвр.знач.
fun testSimple(x: Int, y: Int): Int {
    return x + y
}

// можно сократить предыдущую функцию(подходит для функций с одной операцией)
fun testSimple2(x: Int, y: Int) = x + y

fun testString(x:Int): String {
    return "String is $x"
}

fun testNameArguments(x: Int, y: Int, z:Int): List<Int> {
    return listOf(x, y, z)
}

// void method
fun testDefaultArguments(x: Int = 1, y: Int = 2) {
    println(x + y)
}

//fun foo(name: String, number: Int, toUpperCase: Boolean) {
//    if (toUpperCase) name.toUpperCase() else name + number
//}

// vararg
fun printEven(vararg number: Int) {
    number.forEach {e -> if (e % 2 == 0) println(e) }
}