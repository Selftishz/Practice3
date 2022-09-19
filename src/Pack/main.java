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

        boolean hightArr = true;

        for (int i = 1; i < 4; i++)
            if (arr[i] < arr[i-1]) hightArr = false;

        if (hightArr == true) System.out.println("Последовательность строго возрастающая");
            else System.out.println("Последовательность НЕ строго возрастающая");
    }
}
