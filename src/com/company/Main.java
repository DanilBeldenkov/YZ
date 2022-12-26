package com.company;


import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static int[] removeDuplicates(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.print("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] distinct = removeDuplicates(arr);
        System.out.println(Arrays.toString(distinct));
    }
}