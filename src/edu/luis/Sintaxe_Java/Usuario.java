package edu.luis.Sintaxe_Java;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv  = new SmartTv();

        System.out.println("Canal Atual: " +smartTv.canal);


        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);

        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: " +smartTv.canal);
        System.out.println("Volume Atual: " +smartTv.volume);

         smartTv.ligar();
        System.out.println("Novo Status Tv Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status Tv Ligada ? " + smartTv.ligada);


    }
}
