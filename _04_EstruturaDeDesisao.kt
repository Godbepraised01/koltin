fun main(){
    println("Digite um numero")
    val num = readLine()
    val num2 = num?.toInt()?:0
    val impressao = if ((num2 % 2) ==0) "numero par" else "numero impar"

    print(impressao)
    print("---------------------------")

    println("digite um nome:")
    val nome = readLine()
    if (nome.equals("fabiana"))
        println("voce é a ${nome}")
    else if (nome.equals( "lucia"))
        println("voce é a ${nome}")
    else println("nome invalido")
}