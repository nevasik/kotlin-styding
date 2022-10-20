package topics.Homeworks

fun main() {
    // "eat", "tea", "tan", "ate", "nat", " bat" -> [[eat, tea, ate], [tan, nat], [ bat]]
    println(groupWords(arrayOf("eat", "tea", "tan", "ate", "nat", " bat")))
}

fun groupWords(words: Array<String>): List<List<String>> {
    val result: MutableList<List<String>> = mutableListOf()
    val map = mutableMapOf<String, MutableList<String>>()

    for (word in words) {
        val sortedWord = word.toCharArray().sorted().joinToString("")

        if (map.containsKey(sortedWord)) {
            map[sortedWord]?.add(word)
        } else {
           map[sortedWord] = mutableListOf(word)
        }
    }

    for ((key, value) in map) {
        result.add(value)
    }

    return result
}