package ex4;

import java.util.Scanner;

public class QuanLy {
    private String maQuanLy;
    private String hoTen;

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã quản lý: ");
        scanner.nextLine();
        maQuanLy = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();
    }

    public void Xuat(){
        System.out.println("Mã quản lý: " + maQuanLy);
        System.out.println("Họ tên: " + hoTen);
    }

    public QuanLy() {
    }

    public QuanLy(String maQuanLy, String hoTen) {
        this.maQuanLy = maQuanLy;
        this.hoTen = hoTen;
    }

    public String getMaQuanLy() {
        return maQuanLy;
    }

    public void setMaQuanLy(String maQuanLy) {
        this.maQuanLy = maQuanLy;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}
