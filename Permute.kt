
import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val t: Int = sc.nextInt()
    for (i in 1..t){
        val n: Int = sc.nextInt()

        val arr = Array<Int>(n){0}

        if (!permute(arr, n, 1)){
            print("-1")
        }
        else{
            for (elements in arr){
                print("$elements ")
            }
        }
        println()
    }
}

fun permute(array: Array<Int>, n:Int, count: Int): Boolean{
    if (count == n+1)
        return true

    for(i in 0 until n){
        if(isBad(i, array, n, count))
            continue
        array[i] = count
        if(permute(array, n, count+1))
            return true
        array[i] = 0
    }
    return false
}

fun isBad(i: Int, array: Array<Int>, n: Int, count: Int): Boolean {
    if(array[i] != 0)
        return true

    if(i > 0){
        val mod1: Int = abs(array[i-1] - count)
        if(array[i-1] != 0 && (mod1 < 2 || mod1 > 4))
            return true
    }

    if (i < n-1){
        val mod2: Int = abs(array[i+1] - count)
        if (array[i+1] != 0 && (mod2 < 2 || mod2 > 4))
            return true
    }

    return false
}
