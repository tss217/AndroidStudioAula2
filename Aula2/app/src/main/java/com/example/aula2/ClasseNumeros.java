package com.example.aula2;

import java.util.Random;

public class ClasseNumeros {

    private int[] nros;
    private  int tam;

    //Construtor da classe
    public ClasseNumeros(int tam){
        nros = new int[tam];
        this.tam = tam;
        gerarNrosAleatorios();
    }

    private void gerarNrosAleatorios(){
        Random rand = new Random();
        int i;

        for(i=0;i<this.tam;i++){
            nros[i] = rand.nextInt(100);
        }
    }

    //Metodos de classe
    public String ordemCrescente(){
        String aux = "";

        return aux;
    }

    public String ordemInversa(){
        String aux = "";

        return aux;
    }

    public String mostrarPares(){
        String aux = "";

        return aux;
    }

    public String mostrarImpares(){
        String aux = "";

        return aux;
    }
    public String mostrarPrimos(){
        String aux = "";

        return aux;
    }
}
