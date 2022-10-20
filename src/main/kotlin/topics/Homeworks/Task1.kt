package topics.Homeworks

/**
 * Даны два массива, надо вернуть цифры, повторяющиеся и в первом массиве и во втором
 */

fun main() {
    val intArrayOf1 = intArrayOf(1, 2, 3, 2, 0)
    val intArrayOf2 = intArrayOf(5, 1, 2, 7, 3, 2)
    val result = array(intArrayOf1, intArrayOf2)
    println(result)

    println(array2(mutableListOf(1, 2, 3, 2, 0), mutableListOf(5, 1, 2, 7, 3, 2)))
}

fun array(arr1: IntArray, arr2: IntArray): List<Int> {
    val s1 = arr1.toHashSet()
    val s2 = arr2.toHashSet()

    val result = mutableListOf<Int>()

    for (el in s1) {
        if (s2.contains(el)) {
            val numOfRepeats = minOf(arr1.count { it == el }, arr2.count { it == el })
            repeat(numOfRepeats) { result.add(el) }
        }
    }
    return result
}

// Решение 2
fun array2(list1: MutableList<Int>, list2: MutableList<Int>): List<Int> {
    list2.retainAll(list1)
    return list2
}

    /** Решение 2
        val list = mutableListOf<Int>()
        for (i in arr1) {
            for (it in arr2) {
                if (i == it)
                    list.add(i)
            }
        }
        return list
    */


//    Решение 3
//    val result = mutableListOf<Int>()
//    val result2 = mutableListOf<Int>()
//    arr1.forEach {
//    i -> i.toInt()
//    arr2.forEach {
//    if (it == i)
//        result.add(it)
//        result2.add(it)
//    }
//    }
//    return result