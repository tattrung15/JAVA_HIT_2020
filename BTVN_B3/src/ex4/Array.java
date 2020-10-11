package ex4;

import java.util.Scanner;

public class Array {
    private int[] arr;
    private int n;
    static Scanner scanner = new Scanner(System.in);

    public void InputData(){
        System.out.println("Nhập n: ");
        n = scanner.nextInt();
        arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Nhập a[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
    }
    public void Show(){
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public double Sum(){
        double sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += arr[i];
        }
        return sum;
    }

    public Array() {
    }

    public Array(int[] arr, int n) {
        this.arr = arr;
        this.n = n;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
