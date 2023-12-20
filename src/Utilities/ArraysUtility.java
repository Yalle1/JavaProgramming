package Utilities;

import java.util.Arrays;

public class ArraysUtility {

    public static int[] merge(int[] num1, int[] num2){

        int[] arr = new int[num1.length + num2.length];

        int k = 0;

        for (int i = 0; i < num1.length; i++, k++){
            arr[k] = num1[i];
        }

        for (int i = 0; i < num2.length; i++, k++) {
            arr[k] = num2[i];
        }

        return arr;
    }

    public static double[] merge(double[] num1, double[] num2){

        double[] arr = new double[num1.length + num2.length];

        int k = 0;

        for (int i = 0; i < num1.length; i++, k++){
            arr[k] = num1[i];
        }

        for (int i = 0; i < num2.length; i++, k++) {
            arr[k] = num2[i];
        }

        return arr;
    }

    public static char[] merge(char[] num1, char[] num2){

        char[] arr = new char[num1.length + num2.length];

        int k = 0;

        for (int i = 0; i < num1.length; i++, k++){
            arr[k] = num1[i];
        }

        for (int i = 0; i < num2.length; i++, k++) {
            arr[k] = num2[i];
        }

        return arr;
    }

    public static String[] merge(String[] num1, String[] num2){

        String[] arr = new String[num1.length + num2.length];

        int k = 0;

        for (int i = 0; i < num1.length; i++, k++){
            arr[k] = num1[i];
        }

        for (int i = 0; i < num2.length; i++, k++) {
            arr[k] = num2[i];
        }

        return arr;
    }

    public static int[] reversedArray(int[] array){
        int[] reversedArray = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[i] = array[j];
        }
        return reversedArray;
    }

    public static double[] reversedArray(double[] array){
        double[] reversedArray = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[i] = array[j];
        }
        return reversedArray;
    }

    public static char[] reversedArray(char[] array){
        char[] reversedArray = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[i] = array[j];
        }
        return reversedArray;
    }

    public static String[] reversedArray(String[] array){
        String[] reversedArray = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[i] = array[j];
        }
        return reversedArray;
    }

    public static int[] addElement(int[] array, int element){

        int[] newArray = Arrays.copyOf(array,array.length+1);

        newArray[newArray.length-1] = element;

        return newArray;

    }

    public static double[] addElement(double[] array, double element){

        double[] newArray = Arrays.copyOf(array,array.length+1);

        newArray[newArray.length-1] = element;

        return newArray;

    }

    public static String[] addElement(String[] array, String element){

        String[] newArray = Arrays.copyOf(array,array.length+1);

        newArray[newArray.length-1] = element;

        return newArray;

    }

    public static char[] addElement(char[] array, char element){

        char[] newArray = Arrays.copyOf(array,array.length+1);

        newArray[newArray.length-1] = element;

        return newArray;

    }

    public static boolean contains(int[] array, int element) {

        for (int each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(double[] array, double element) {

        for (double each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(char[] array, char element) {

        for (char each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(String[] array, String element) {

        for (String each : array) {
            if (each.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static int[] removeElement(int[] array, int elementIndex){

        int [] newArray = Arrays.copyOf(array, array.length-1);

        for (int i = elementIndex + 1; i < array.length; i++) {
            newArray[i - 1] = array[i];
        }
        return newArray;
    }

}
