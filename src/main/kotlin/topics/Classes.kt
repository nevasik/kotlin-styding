package topics

fun main() {
    val child = Person("Child", "Child", 1)
    val p1 = Person("Tom", "Jones", 35, child)
    println(p1.firstName)

    val restangle1 = Restangle(5.0, 2.0)
    println("The perimeter is ${restangle1.perimeter}")

    val restangle2 = Restangle(5.0, 2.0)
    println(restangle1 == restangle2) // true

}

// Primary Constructor - первчиный конструктор
class Person(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf() // ArrayList

    init {
        println("Person is created $firstName")
    }

    constructor(firstName: String, lastName: String, age: Int, child: Person) :
            this(firstName, lastName, age) {
        children.add(child)
    }

    // конструктор без аргументов
    constructor(): this("", "", -1)
}

// data - если поставить это ключевое слово, то автоматически будут созданы equals, hashCode, toString
data class Restangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2


    var test = 1
        get() = field + 1 // field == this(т.е. test + 1)
        set(value) {
            if (value < 0) println("Negative value")
            field = value
        }

    fun area() = height * length
}