package ex4;

import java.util.Scanner;

public class May {
    private String maMay;
    private String kieuMay;
    private String tinhTrang;

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã máy: ");
        maMay = scanner.nextLine();
        System.out.print("Nhập kiểu máy: ");
        kieuMay = scanner.nextLine();
        System.out.print("Nhập tình trạng: ");
        tinhTrang = scanner.nextLine();
    }

    public void Xuat(){
        System.out.println("Mã máy: " + maMay + " Kiểu máy: " + kieuMay + " Tình trạng: " + tinhTrang);
    }

    public May() {
    }

    public May(String maMay, String kieuMay, String tinhTrang) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.tinhTrang = tinhTrang;
    }

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
