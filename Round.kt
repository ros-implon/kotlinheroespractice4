import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val t: Int = sc.nextInt()
    for (i in 1..t){
        var count: Int = 0
        var i: Int = 0
        var n: Int = sc.nextInt()
        val list: MutableList<Int> = mutableListOf<Int>()
        while (n > 0){
            val b: Int = n%10
            n /= 10
            if(b != 0) {
                list.add(b * (10.0.pow(i)).toInt())
                count++
            }
            i++
        }
        println(count)
        for (element in list){
            print("$element ")
        }
    }
}