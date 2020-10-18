package ex3;

import java.util.Scanner;

public class Hang {
    private String maHang;
    private String tenHang;
    private long donGia;

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã hàng: ");
        scanner.nextLine();
        maHang = scanner.nextLine();
        System.out.print("Nhập tên hàng: ");
        tenHang = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextLong();
    }

    public void Xuat(){
        System.out.println("Mã hàng: " + maHang + " Tên hàng: " + tenHang + " Đơn giá: " + donGia);
    }

    public Hang() {
    }

    public Hang(String maHang, String tenHang, long donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }
}
