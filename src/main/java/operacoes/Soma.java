package operacoes;

import numeros.EntradaNumeros;

public class Soma {
    public static void main(String[] args) {
        EntradaNumeros entradaNumeros = new EntradaNumeros();
        entradaNumeros.pedirNumeros();
        System.out.println(entradaNumeros.x + entradaNumeros.y);
    }
}
