import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val t: Int = sc.nextInt()
    for (i in 1..t){
        val n: Int = sc.nextInt()
        val arr: Array<Int> = Array<Int>(n){0}
        for (index in 0 until n){
            arr[index] = sc.nextInt()
        }
        var a: Int = 0
        var b: Int = 0
        var pCSize: Int = 0
        var countTurn: Int = 0
        var aTurn: Boolean = true
        var front: Int = 0
        var rear: Int = n-1

        while (front <= rear){
            if (aTurn){
                var sum: Int = arr[front++]
                while (sum <= pCSize && front <= rear)
                    sum += arr[front++]
                a += sum
                pCSize = sum
                countTurn++
                aTurn = false
            }
            else{
                var sum: Int = arr[rear--]
                while (sum <= pCSize && front <= rear)
                    sum += arr[rear--]
                b += sum
                pCSize = sum
                countTurn++
                aTurn = true
            }
        }
        println("$countTurn $a $b")
    }
}