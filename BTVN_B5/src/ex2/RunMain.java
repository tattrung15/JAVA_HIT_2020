package ex2;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SoPhuc p1 = new SoPhuc();
        SoPhuc p2 = new SoPhuc();
        System.out.println("Nhập số phức p1");
        p1.Nhap();
        System.out.println("Nhập số phức p2");
        p2.Nhap();
        SoPhuc p3, p4;
        p3 = p1.Cong(p2);
        p4 = p1.Tru(p2);
        System.out.println("Cộng: ");
        p3.Xuat();
        System.out.println("Trừ: ");
        p4.Xuat();
    }
}
