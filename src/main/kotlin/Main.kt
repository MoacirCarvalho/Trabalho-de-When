fun main(args: Array<String>) {
    taxa()
  //  pagamento()
}

    fun taxa(): Unit{
        println("Digite o numero de crianças nascidas:")
     val numeroDeCriancasNascidas = readLine()!!.toInt()
     println("Digite o numero de Habitantes")
     val numeroDeHabitantes = readLine()!!.toInt()
     println("Digite o numero de Obtos")
     val numeroDeObtos = readLine()!!.toInt()
     println("Escolha qual taxa você quer Descobrir:\n1 - Taxa de Natalidade \n2 Taxa de Obtos ")

     when(readLine()!!.toInt()){
         1 -> println("A Taxa de Natalidade é ${(numeroDeCriancasNascidas * 1000) / numeroDeHabitantes} ")
         2-> println("A Taxa de obtos è ${(numeroDeObtos  * 1000) / numeroDeHabitantes }")
         else -> println("Operação Invalida")


     }

    }

    fun pagamento():Unit{
        println("Digite o total de Compras")
        val  totalDaCompra = readLine()!!.toInt()
        println("Escolha o tipo de pagamento \n1 -  Á vista \n2 Á prazo (30 dia)\n3 Á prazo parcelado")

        when (readLine()!!.toInt()){

            1-> println(" O Valor do pagamento Á vista é : ${totalDaCompra - (( totalDaCompra * 10)/ 100 )}")
            2-> println("O Valor do pagamento Á prazo para (30 dias ) é: ${totalDaCompra -(( totalDaCompra * 3 )/ 100 )}")
            3-> println("O Valor do pagamento Á prazo parcelado é: ${totalDaCompra - ((totalDaCompra * 1.5)/100)}")
            else-> println("Forma de pagamento Invalida !!!")

        }

    }
