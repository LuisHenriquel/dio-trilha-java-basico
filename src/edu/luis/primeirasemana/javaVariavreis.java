package edu.luis.primeirasemana;

public class javaVariavreis {
                                        //VARIAVEIS


    // 8 TIPOS PRIMITIVOS DO JAVA


   /*int,byte,short,float,double,boolean, chear- esses tipos nao sao considerados objetos, e portanto  representam valores brutos
    eles são armazenados diretamente na pilha de memoria (memory stack)

    Ex dos tipos
    Se vc quiser usar um tipos para armazenar o valor minimo de -128 e o valor maximo de 127 vc pode usa o byte

    agora se for um pouco mais de numeros podemos usar o short que o valor minimo é -32.768 e o valor maximo 32.7

    agora se for maiz extenso podemos usar o int que o valor minimo dele é de -2.147.483.648

    agora se for um valor extremamento grande vc usa o long que o valor minimo pe de -9.223.372.036.854.775.808

    Tambem temos os tipos que contem partes fracionarias e podem ser representados por dois tipos

    float que o minimo é de -3,4028E + 38 e o maximo é de 3,4028E + 38

    temos o double que o nome ja fala que é o dobro de capacidade o minimo dele é de -1,7976E + 308 e o maximo é de 1,7976E + 308
*/
   //A estrutura padrao para se declarar uma variavel sempre é
  //<Tipo> <nomeVariavel> <atribuicaoDeValorOpcionak>
  //Ex:
  //int idade; // Tipo"int", nome"idade",com nenhum valor atribuido
  //int anoFabricacao 2021 = 2021; // Tipo"int", nome"anoFabricacao",com o valor atribuido de "2021"
  //double salarioMinimo = 2.500; //Tipo"double", nome"salarioMinimo",com o valor "2.500"
  //Preste atenção quando usar o double exemplo ali encima 2.500 seria 2.5 e nao 2500 para valores acima de 1000 nao coloque o ponto
  //Existe algumas peculiaridades a trabalhar com alguns tipos específicos. Observe no exemplo abaixo:

    byte idade = 123;
    short ano = 2021;
    int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo, o java nao armazena 0 para o tipo inteiro
    long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo, o java nao armazena 0 para o tipo inteiro, o long tambem tem que terminar com um L
    float pi = 3.14F; // quando usar o float sempre coloque um f no final pode ser maiusculo ou minusculo
    double salario = 1275.33;

    /*
    Variáveis e Constantes
    Uma variavel é uma area de memoria, associada a um nome que pode armazenar valores de um determinado tipo.Um tipo de dado define
    um conjunto de valores e um conjunto de operações. Java é uma linguagem com rigidez de tipos, diferente de liguagens como
    JavaScript, onde declarar o tipo de variavel não é obrigatorio

    Já a constante são valores armazenados em memoria que nao podem ser modificados depois de declarados. em Java esses valores
    são representados pela palavra reservada final, seguindo do tipo

    por convenção, Constantes sao sempre escritas em CAIXA ALTA
     */

    final double  VALOR_DE_PI = 3.14;

}
