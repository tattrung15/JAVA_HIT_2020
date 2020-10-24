package ex3;

import java.util.Scanner;

public class SanPham {
    private String maSP;
    private String tenSP;
    private int soLuong;
    private double donGia;
    
    public void InputSP(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm: ");
        maSP = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        tenSP = scanner.nextLine();
        System.out.print("Nhập số lượng: ");
        soLuong = scanner.nextInt();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
    }
    
    public void OutputSP(){
        System.out.println("Mã sản phẩm: " + maSP);
        System.out.println("Tên sản phẩm: " + tenSP);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Đơn giá: " + donGia);
    }

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, int soLuong, double donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}
