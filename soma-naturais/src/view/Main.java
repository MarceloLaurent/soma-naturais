package view;

import controller.SomaNaturaisController;

public class Main {
    public static void main(String[] args) {

        SomaNaturaisController sn = new SomaNaturaisController();

        int resultado = sn.soma(10);

        System.out.println(resultado);
    }
}