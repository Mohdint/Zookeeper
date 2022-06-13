fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    swapTwoNumbersOfList(numbers, 0, numbers.lastIndex)
    println(numbers.joinToString(separator = " "))
}
fun <T> swapTwoNumbersOfList(list: MutableList<T>, a: Int, b: Int) { list[a] = list[b].also { list[b] = list[a] } }
