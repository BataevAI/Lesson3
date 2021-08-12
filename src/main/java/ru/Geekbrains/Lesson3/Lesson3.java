package ru.Geekbrains.Lesson3;

import java.util.Arrays;

public class Lesson3 {


    public static void main(String[] args) {

        // first task
        System.out.println();
        System.out.println("Задание 1");
        System.out.println();

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1 };
        for (int i = 0; i < arr.length; i++ ) {

            arr[i] = arr[i] == 0 ? 1 : 0;

        }

        System.out.println(Arrays.toString(arr));


        // second task
        System.out.println();
        System.out.println("Задание 2");
        System.out.println();


        int [] arr1 = new int[10];

        for (int j = 0 ; j < arr1.length; j++  ) {
            arr1[j] =  j;

        }

        System.out.println(Arrays.toString(arr1));

        // third task
        System.out.println();
        System.out.println("Задание 3");
        System.out.println();

        int []arr2 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 }; // 2 10 6 4 11 8 10 4 8 8 9 2

        for (int i = 0; i < arr2.length; i++ ) {

            arr2[i] = arr2[i] < 6 ? 2 * arr2[i] : arr2[i];

        }
        System.out.println(Arrays.toString(arr2));



            // fourth task
        System.out.println();
        System.out.println("Задание 4");
        System.out.println();

    int [][] arr3 = new int[6][6];

    for (int i = 0; i < arr3.length; i++) {
        for (int j = 0; j < arr3.length; j++){
                arr3[i][j] = (int) ((Math.random() * 90) + 10); // заполняем случайными числами

if ((i == j)|(i + j == arr3.length - 1)) { arr3[i][j] = 1;}

/*
второй способ
            arr3[i][j] = i == j ? 1 : arr3[i][j];
            arr3[i][j] = i + j == (arr3.length - 1)   ? 1 : arr3[i][j];
*/
        }


    }
        // проверяем и выводим двумерный массив в консоль для проверки 4-го задания
        printArr(arr3);


        System.out.println();
        System.out.println("Задание 5");
        System.out.println();


        System.out.println(Arrays.toString(initialArray(10,5)));

        // task 6
        // проверка 6 задания

        System.out.println();
        System.out.println("Задание 6 *");
        System.out.println();

        int []arr5 = {-34, 101, 54, 32, 100, 1, 0, -4, 24, 45, 5, 17};
        MaxOrMin( arr5);

        System.out.println();
        System.out.println("Задание 7 **");
        System.out.println();

        // task 7
        //вызов 7-го задания метода

        int[] arr7 = {1, 1, 2, 4, 6, 2};
        checkBalance(arr7);

        System.out.println();
        System.out.println("Задание 8 ***");
        System.out.println();


        int []ar1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        
        // Вводим параметр numberOfshift
        // Сдвиг на 5 ячеек влево

        shiftInArray(-5, ar1);

    }
            //task 5
            // метод возврата инициализированного массива заданной длины

    public static int [] initialArray (int len, int initialValue) {

       int [] arr4 = new int [len];
       for (int i = 0; i < arr4.length; i++) arr4[i] = initialValue;

        return arr4;


    }





    // метод печати двумерного массива
    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               if (arr[i][j] < 10) System.out.print(arr[i][j] + "  ");
               else System.out.print(arr[i][j] + " ");
            }
            System.out.println();


        }
    }

    // метод поиска максимального и минимального значения в массиев
    // true -  минимальный элемент
    // false - максимальный элемент


    // метод поиска макcимального и минимального значения
    // метод 6-го задания

    public static void MaxOrMin (int ar[]) {

         for (int i = 0; i < ar.length; i++){

            for (int j = 1; j < ar.length; j++) {

                int ch;

                if (ar[j] < ar[j - 1]) {

                    ch = ar[j]; ar[j] = ar[j-1]; ar[j-1]=ch;

                }

            }
           // System.out.println(Arrays.toString(ar));
        }
        //System.out.println();
        //System.out.println(Arrays.toString(ar));
int min = ar[0];
int max = ar[ar.length -1 ];

       System.out.println("минимум = " + min);
      System.out.println("максимум = " + max);

    }

// метод 7** задания

    public static void checkBalance (int arr[]) {

        int sum, sum2;
        sum = sum2 = 0;
        boolean t = false;
// сначала находим сумм всех членов ряда

        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
           // System.out.println(sum);
        }
        //System.out.println();
       // System.out.println(sum);

        // далее проверяем условия равенства суммы первым и вторых элементов массива

        for (int i = 0; i < arr.length; i++) {

            sum2 = sum2 + arr[i];
            if (sum2 == sum - sum2) {
                t = true;
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(t); // если такая сумма есть выводим true, иначе - false

    }

    // метод 8*** задания



    public static int [] shiftInArray (int numberOfshift, int ar[]) {

        // numberOfshift - число ячеек, на которое идет сдвиг

        int n = numberOfshift >= 0 ? numberOfshift : ar.length + numberOfshift;
        int ch;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < ar.length; j++) {

                ch = ar[ar.length-1]; ar[ar.length-1] = ar[j]; ar[j] = ch;
                //System.out.println(Arrays.toString(ar));
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(ar));
        return ar;

    }


}

