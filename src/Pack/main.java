package Pack;

import java.util.*;

public class main {
    public static void main(String[] args) {
        System.out.println("Задача 3");
        int[] arr = new int[4];
        Random rand = new Random();

        System.out.println("Созданный массив:");
        for (int i = 0; i < 4; i++) {
            arr[i] = (int) (Math.random() * 90) + 10;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        boolean hightArr = true;

        for (int i = 1; i < 4; i++)
            if (arr[i] < arr[i-1]) hightArr = false;

        if (hightArr == true) System.out.println("Последовательность строго возрастающая");
            else System.out.println("Последовательность НЕ строго возрастающая");

        System.out.println("-----------------------------------------------------------");

        System.out.println("Задача 4 \nВведите размер массива: ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            while (true) {
                int n = scan.nextInt();
                if (n <= 0) {
                    System.out.println("Введите натуральное число, большее нуля");
                    continue;
                }

                int[] array = new int[n];
                System.out.println("Созданный массив из случайных чисел отрезка [0; n]:");
                for (int i = 0; i < n; i++) {
                    array[i] = (int) (Math.random() * n+1);
                    System.out.print(array[i] + " ");
                }
                break;
            }
        } else System.out.println("Введите натуральное число");
    }
}
