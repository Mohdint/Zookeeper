const val TEEN = 10
fun main() {
    val numbers = MutableList(TEEN * TEEN) { 0 }
    numbers[0] = 1
    numbers[TEEN - 1] = TEEN
    numbers[TEEN * TEEN - 1] = TEEN * TEEN
    println(numbers.joinToString())
}