package topics.Homeworks

fun main() {
    // AAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBBCCCCCCCCCCCCLLLLLLLLLLBBBBBBBBBBBBBB -> A16B18C12L10B14
    println(countLetters("AAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBBCCCCCCCCCCCCLLLLLLLLLLBBBBBBBBBBBBBB"))
}

fun countLetters(str:String): String {
    var count = 1
    var currentLetter = str[0]
    var result = ""

    for (letter in str.substring(1)) {
        if (currentLetter == letter) {
            count++
        } else {
            if (count == 1) {
                result += currentLetter
            } else {
                result += "$currentLetter$count"
            }
            count = 1
            currentLetter = letter
        }
    }
    // последние буквы в строке
    if (count == 1) {
        result += currentLetter
    } else {
        result += "$currentLetter$count"
    }
    return result
}
