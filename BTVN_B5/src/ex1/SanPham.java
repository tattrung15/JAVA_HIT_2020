package ex1;

import java.util.Scanner;

public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private String tenHSX;
    private String ngayNhap;

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm: ");
        maSanPham = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        tenSanPham = scanner.nextLine();
        System.out.print("Nhập tên hãng sản xuất: ");
        tenHSX = scanner.nextLine();
        System.out.print("Nhập ngày nhâp: ");
        ngayNhap = scanner.nextLine();
    }

    public void Xuat(){
        System.out.print(maSanPham + " - " + tenSanPham + " - " + tenHSX + " - " + ngayNhap);
    }

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, String tenHSX, String ngayNhap) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.tenHSX = tenHSX;
        this.ngayNhap = ngayNhap;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getTenHSX() {
        return tenHSX;
    }

    public void setTenHSX(String tenHSX) {
        this.tenHSX = tenHSX;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
}
