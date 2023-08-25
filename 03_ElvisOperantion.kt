fun main(){
    var a = "correto"
    println(retornaAlgo(a))
    var b = "errado"
    println(retornaAlgo(b))
    var c: String = retornaAlgo(b)?: "valor padrao"
    print(c)
}

fun retornaAlgo(x:String): String?{
    if (x.equals("correto")) return  "Deu certo" else return null
}