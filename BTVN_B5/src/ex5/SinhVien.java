package ex5;

import java.util.Scanner;

public class SinhVien extends Nguoi{
    private String maSV;
    private String nganh;
    private int khoaHoc;

    public SinhVien() {
    }

    public SinhVien(String maSV, String nganh, int khoaHoc) {
        this.maSV = maSV;
        this.nganh = nganh;
        this.khoaHoc = khoaHoc;
    }

    public SinhVien(String hoTen, String ngaySinh, String queQuan, String maSV, String nganh, int khoaHoc) {
        super(hoTen, ngaySinh, queQuan);
        this.maSV = maSV;
        this.nganh = nganh;
        this.khoaHoc = khoaHoc;
    }

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        super.Nhap();
        System.out.print("Nhập mã sinh viên: ");
        maSV = scanner.nextLine();
        System.out.print("Nhập ngành học: ");
        nganh = scanner.nextLine();
        System.out.print("Nhập khóa học: ");
        khoaHoc = scanner.nextInt();
    }
    
    public void Xuat(){
        super.Xuat();
        System.out.println("Mã sinh viên: " + maSV);
        System.out.println("Ngành học: " + nganh);
        System.out.println("Khóa học: " + khoaHoc);
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }
}
