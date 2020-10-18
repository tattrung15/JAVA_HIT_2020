package ex1;

import java.util.Scanner;

public class Sach {
    private String maSach;
    private String tenSach;
    private String nhaXuatBan;
    private int soTrang;
    private long giaTien;

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        maSach = scanner.nextLine();
        System.out.print("Nhập tên sách: ");
        tenSach = scanner.nextLine();
        System.out.print("Nhập nhà xuất bản: ");
        nhaXuatBan = scanner.nextLine();
        System.out.print("Nhập số trang: ");
        soTrang = scanner.nextInt();
        System.out.print("Nhập giá tiền: ");
        giaTien = scanner.nextLong();
    }

    public void Xuat(){
        System.out.println("Sach{" + "maSach='" + maSach + '\'' + ", tenSach='" + tenSach + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' + ", soTrang=" + soTrang + ", giaTien=" + giaTien + '}');
    }

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String nhaXuatBan, int soTrang, long giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nhaXuatBan = nhaXuatBan;
        this.soTrang = soTrang;
        this.giaTien = giaTien;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public long getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(long giaTien) {
        this.giaTien = giaTien;
    }
}
