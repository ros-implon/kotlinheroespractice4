import java.util.*

fun main(args: Array<String>){
    val sc = Scanner(System.`in`)

    val t: Int = sc.nextInt()
    for (i in 1..t){
        val a1 = sc.nextInt()
        val b1 = sc.nextInt()
        val a2 = sc.nextInt()
        val b2 = sc.nextInt()

        if(checkEquality(a1,a2,b1,b2)){
            println("Yes")
            continue
        }
        if(checkEquality(a1,b2,b1,a2)){
            println("Yes")
            continue
        }
        if(checkEquality(b1,a2,a1,b2)){
            println("Yes")
            continue
        }
        if(checkEquality(b1,b2,a1,a2)){
            println("Yes")
            continue
        }
		println("No")
    }
}

fun checkEquality(a: Int, b: Int, c: Int, d: Int) : Boolean{
    if (a == b){
        if(a == c + d) {
            return true
        }
    }
    return false
}