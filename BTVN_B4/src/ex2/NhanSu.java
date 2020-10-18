package ex2;

import java.util.Scanner;

public class NhanSu {
    private String maNhanSu;
    private String hoTen;
    private Date date;

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã nhân sự: ");
        maNhanSu = scanner.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();
        date = new Date();
        date.Nhap();
    }

    public void Xuat(){
        System.out.println("Mã nhân sự: " + maNhanSu);
        System.out.println("Họ tên: " + hoTen);
        date.Xuat();
    }

    public NhanSu() {
    }

    public NhanSu(String maNhanSu, String hoTen, Date date) {
        this.maNhanSu = maNhanSu;
        this.hoTen = hoTen;
        this.date = date;
    }

    public String getMaNhanSu() {
        return maNhanSu;
    }

    public void setMaNhanSu(String maNhanSu) {
        this.maNhanSu = maNhanSu;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
