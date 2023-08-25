fun main(){
    println("Digite a nota do aluno")
    val nota = readln()?.toInt()

    when(nota){
        10,9,8 -> println("parabens,voce é o melhor aluno")
        7,6 -> println("voce é mediano")
        5,4,3 -> println("voce esta de af")
        2,1,0 -> println("voce foi reprovado")
        else -> println("nota fora da media")
    }
}