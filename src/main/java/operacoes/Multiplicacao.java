package operacoes;

import numeros.EntradaNumeros;

public class Multiplicacao {
    public static void main(String[] args) {
        EntradaNumeros entradaNumeros = new EntradaNumeros();
        entradaNumeros.pedirNumeros();
        System.out.println(entradaNumeros.x * entradaNumeros.y);
    }
}
