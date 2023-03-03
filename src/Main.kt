import kotlinx.coroutines.*

suspend fun main() {
    var c = One()

    println("колько повторений?")
    var count = readln()!!.toInt()
    count = count - 1
    for (i in 0 .. count) {
        GlobalScope.launch {
            delay(7000L)
            println(c.chet())
        }
        println(c.sum())
        runBlocking {
            delay(7000L)
        }
    }
}