fun main(){
    var a = 5

    println(retornaNulo(a))

    var nulo:Int?
    nulo= retornaNulo(a)

    println(nulo)
}

fun retornaNulo(x:Int): Int?{
    if (x<5) return  10 else return null
}