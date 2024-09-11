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
        double resultado = (10 * 7) + (20/4);
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
    }

}