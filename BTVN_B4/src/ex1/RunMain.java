package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sách: ");
        int n = scanner.nextInt();
        ArrayList<Sach> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sách thứ " + (i + 1));
            Sach sach = new Sach();
            sach.Nhap();
            list.add(sach);
        }
        for (Sach sach : list){
            sach.Xuat();
        }
    }
}
