fun main() {
    for (i in (0..121))
        outLikes(i)
}

fun outLikes(likes: Int) {
    val people = if (likes % 100 != 11 && likes % 10 == 1) "человеку" else "людям"
    println("Понравилось $likes $people")
}