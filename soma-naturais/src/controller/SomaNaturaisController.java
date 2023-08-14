//Exercício 1
package controller;

public class SomaNaturaisController {

    public SomaNaturaisController() {
    }

    public int soma(int numero){
        if(numero <= 0){
            return 0; //Condição de parada: n = 0
        } else {
            return numero + soma(numero-1); //Chamada: último número mais o anterior
        }
    }
}
