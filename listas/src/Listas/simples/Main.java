package listas.simple;

/*
*Listas simples, implemantacion del metodo Main
*@autor Cristopher Gerardo Villanueva Ramirez
*@date 15 de octubre de 2026
*/

public class Main {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        lista.recorrer();            // lista vacía: no imprime nada
        lista.insertarAlInicio(3);
        lista.insertarAlInicio(2);
        lista.insertarAlInicio(1);
        lista.recorrer();            // imprime 1, 2, 3
    }
}