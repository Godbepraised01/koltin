fun main(){
    println("soma: ${soma(a=2, b = 3)}")
    println("Subtracao: ${subtracao(a=5, b = 3)}")
    println("multiplicaçao: ${multiplicacao(5,7)}")

}
fun soma (a:Int,b:Int):Int{
    return a + b
}
fun subtracao(a: Int,b: Int) = a-b

val multiplicacao = fun (a: Int, b: Int) = a*b