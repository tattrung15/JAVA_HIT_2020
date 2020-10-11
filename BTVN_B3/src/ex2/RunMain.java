package ex2;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog a = new Dog();
        System.out.print("Nhập tên: ");
        a.InputName(scanner.nextLine());
        a.Bark();
        a.ShowMP();
        a.Bark();
        a.ShowMP();
        a.Bark();
        a.ShowMP();
    }
}
