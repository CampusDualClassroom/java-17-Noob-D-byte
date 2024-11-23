package com.campusdual.classroom;

public class Exercise17 {
    //Completar el metodo createEmptyIntArray() que reciba por parámetro un número entero y devuelva un array de tipo int,
    // solamente creado, pero no inicializado (sin valores asignados a cada posición), con tantos elementos como indique el parámetro.
    public static int[] createEmptyIntArray(int positions) {
        return new int[positions];
    }

    //Completar el metodo createInitializedStringArray() para crear y devolver un sencillo array de tipo String de 3 elementos.
    public static String[] createInitializedStringArray() {
        String[] array = new String[3];// creo o array String con 3 elementos
        array[0] = "1";
        array[1] = "2";
        array[2] = "3";
        return array;
    }

    //Completar el metodo populateArray(), que recibe por parámetro un array de tipo entero, un índice y un valor,
    // para asignar dicho valor al índice especificado de dicho array.
    public static void populateArray(int[] array, int index, int value) {
        array[index] = value; //Asigno o valor ao índice especificado de dito array

    }

    //Completar el metodo arrayLength(), que recibe por parámetro un array de tipo entero y devuelve su tamaño.
    public static int arrayLength(int[] array) {
        return array.length; //Utilizo a propiedade length para que me devolva o tamaño do array
    }

    //Completar el metodo showValue(), que recibe por parámetro un array de tipo entero y un índice,
    // y muestra por pantalla el valor de ese índice del array.
    public static void showValue(int[] array, int index) {
        System.out.println(array[index]);//mostro por pantalla o valor dese indice do array
    }

    public static void main(String[] args) {
        int[] intArray = createEmptyIntArray(3);
        String[] stringArray = createInitializedStringArray();
        populateArray(intArray, 0, 10);
        populateArray(intArray, 1, 9);
        populateArray(intArray, 2, 8);
        showValue(intArray, 0);
        System.out.println(arrayLength(intArray));
    }
}
