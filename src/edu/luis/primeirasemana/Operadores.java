package edu.luis.primeirasemana;

import java.util.Date;

public class Operadores {
    public static void main(String[] args) {


        //                                                OPERADORES

      /*Símbolos especiais que tem um significado próprio para a linguagem e estão associados a determinadas operações

        Atribuição
        Representado pelo símbolo de igualdade =
                O operador de atribuição é ultilizado para definir o valor inicial ou sobrescrever o valor de uma variavel.
                em Java definimos um tipo, nome e opcionalment atribuímos um valor á variável através do operador de atribuição
        Ex:
      */

        String nome = "LUIS";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M'; // o char é so para uma letra e so usamos uma aspa
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

      /*
        Aritméticos
        O operadores aritméticos é utilizado para realizar operações matemáticas entre valores numéricos, podendo se tornar
        ou não uma expressão mais complexa

        Os operadores aritmétricos são: +(adição), -(subtração), *(multiplicação) , /(divisão) e %(resto de divisão).
      */
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);
        //quando vc usa o operador de adição com estring ele vai concatenar elas juntar elas
      /*
        Unários
        Esses operadores são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos
        como incrementar, decrementar,inverter valores numéricos e booleanos.

        (+)Operador unário de valor positivo - números são positivos sem esse operador explicitamente
        (-)Operador unário de valor negativo - nega um número ou expressão aritmética
        (++)Operador unário de incremento de valor- incrementa o valor em 1 unidade
        (--)Operador unário de decremento de valor- decrementa o valor em 1 unidade
        (!)Operador unário lógico de negação- nega o valor de uma expressão booleana
      */

       /*
         Ternário
        O Operador de Condição Ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores.
        Você deve pensar numa condição ternária como se fosse uma condição IF normal, porém de uma forma em que toda sua estutura
        estará escrita numa única linha

        eles são representados pelos símbolos ?: caso a condição seja true, : caso a condição seja false
        Ex:
     */
        int a, b;
        a= 5;
        b = 6;

        String resu =  a==b ?"Verdadeiro" : "False";


      /*
        Racionais
        Os operadores relacionais avaliam a relação entre duas variaveis ou expressões.Neste caso, mais precisamente,definem seo
        o operando á esquerda é igual, diferente, menor ou igual, maior ou igual, ou igual ao da direita, retornando um valor boolean
        como resultado.
        Ex:
        == Quando vc deseja verificar se uma variável é igual a outra.
        != Quando vc deseja verificar se uma variável é diferente da outra.
        > Quando vc deseja verificar se uma variável é maior que a outra.
        >= Quando vc deseja verificar se uma variável é maior ou igual a outra.
        < Quando vc deseja verificar se uma variável é menor que a outra.
        <= Quando vc deseja verificar se uma variável é menor ou igual a outra.
      */
        System.out.println(resu);

        int numero1 = 2;
        int numero2 = 4;

        if(numero1 > numero2)
            System.out.println("o numero1 é menor que o numero2");
        else if(numero1 >= numero2)
            System.out.println("O numero1 é menor e nao é igual o numero2");
        else if (numero2 > numero1)
            System.out.println("O numero2 é maior que o numero1");
        else if (numero2 >= numero1)
            System.out.println("O numero2 é maior que o numero1 mas não é igual");
        else if (numero2 == numero1)
            System.out.println("O numero2 e o numero1 não é igual");

      //Strings podem ser comparadas tambem o  jeito certo de fazer essa comparação é usando o .equals EX:

        String nomeUm = "LUIS";
        String nomeDois = new String("LUIS");

        System.out.println(nomeUm.equals(nomeDois));
      /*
        Os operadores lógicos representam o recursi que nos permite criar expressões lógicas maiores
        a partir da junção de duas ou mais expressões.

        && Operador Lógico "E"
        || Operador Lógico "OU"
        Ex:
      */
        boolean condicao1=true;
        boolean condicao2=true;

        if(condicao1 && (7>4) )
            System.out.println("As duas condições são verdadeiras");
        else if (condicao1 || condicao2)
            System.out.println("Umas das condições é verdadeira");




    }


}