package array_programs;

import java.util.*;

public class Program1 {
    public static void calSumAndAvg(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("total sum: " + sum);
        double avg = sum / arr.length;
        System.out.print("average: " + avg);
    }

    public static void checkEvenAndOdd(int arr[]) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("even: " + even);
        System.out.println("odd: " + odd);
    }

    public static void findMinAndMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)

        {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }

    public static int linearSearch(int arr[], int roll) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == roll) {
                return i;
            }
        }
        return -1;
    }

    public static void reverseArr(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void countPositiveAndNegative(int arr[]) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                positive++;
            }
        }
        System.out.println("positive: " + positive);
        System.out.println("negative: " + negative);
        System.out.println("zero: " + zero);
    }

    public static void calSumMatrix(int a[][], int b[][]) {
        int c[][] = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] + b[i][j];

            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void matrixTranspose(int arr[][]){
        int matrixTran[][] = new int[arr[0].length][arr.length];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                matrixTran[j][i] = arr[i][j];
            }
        }

        for(int i = 0; i<matrixTran.length; i++){
            for(int j = 0; j<matrixTran[0].length; j++){
                System.out.print(matrixTran[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void maxSubArr(int arr[]) {
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (max < currSum) {
                max = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.print("Maximum subarray: " + max);
    }

    public static void spiralMatrix(int arr[][]) {
        int startRow = 0;
        int endRow = arr.length - 1;
        int startCol = 0;
        int endCol = arr[0].length - 1;

        while ((startRow <= endRow) && (startCol <= endCol)) {
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][j] + " ");
            }
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(arr[i][startCol] + " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;

        }
    }

    public static void studentPerformanceAnalysis(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int passed = 0;
        int failed = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] >= 40) {
                passed++;

            } else {
                failed++;
            }
        }
        double avg = (double) sum / arr.length;
        int aboveAverage = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                aboveAverage++;
            }
        }
        System.out.println("Average: " + avg);
        System.out.println("Heihest: " + max);
        System.out.println("lowest: " + min);
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Above Average: " + aboveAverage);

    }

    public static void diagonalAnalysis(int arr[][]) {
        int primary = 0;
        int secondary = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    primary += arr[i][j];
                }
                if ((i + j) == arr.length - 1) {
                    secondary += arr[i][j];
                }
            }
        }
        System.out.println("Main Diagonal Sum: " + primary);
        System.out.println("Secondary Diagonal Sum: " + secondary);
        System.out.println("difference: " + (primary - secondary));
    }
    public static void removeDuplicateElement(int arr[]) {
        Arrays.sort(arr);
        int k = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[k - 1]) {
                arr[k] = arr[i];
                k++;

            }

        }
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void moveZeroToEnd(int arr[]){
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int secondLargest(int arr[]){
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if((arr[i] > secondLargest) && (arr[i] < firstLargest)){
                secondLargest = arr[i];
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }
       return secondLargest;
    }
   

    public static void main(String args[]) {
        int arr[][] = {{1,2,3},{4,5,6}};
        matrixTranspose(arr);
        // int arr[] = {10,15,20,10,90,50};
        // System.out.print(secondLargest(arr));

    }
}
