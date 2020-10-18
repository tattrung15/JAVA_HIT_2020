package ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    private QuanLy quanLy;
    private int n;
    private ArrayList<May> list;

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã phòng: ");
        maPhong = scanner.nextLine();
        System.out.print("Nhập tên phòng: ");
        tenPhong = scanner.nextLine();
        System.out.print("Nhập diện tích: ");
        dienTich = scanner.nextDouble();
        quanLy = new QuanLy();
        quanLy.Nhap();
        System.out.print("Nhập số lượng máy: ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin máy thứ " + (i + 1));
            May may = new May();
            may.Nhap();
            list.add(may);
        }
    }

    public void Xuat(){
        System.out.println("Mã phòng: " + maPhong);
        System.out.println("Tên phòng: " + tenPhong);
        System.out.println("Diện tích: " + dienTich);
        quanLy.Xuat();
        System.out.println("Số lượng máy: " + n);
        for (May may : list){
            may.Xuat();
        }
    }

    public PhongMay() {
    }

    public PhongMay(String maPhong, String tenPhong, double dienTich, QuanLy quanLy, int n, ArrayList<May> list) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.quanLy = quanLy;
        this.n = n;
        this.list = list;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getQuanLy() {
        return quanLy;
    }

    public void setQuanLy(QuanLy quanLy) {
        this.quanLy = quanLy;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public ArrayList<May> getList() {
        return list;
    }

    public void setList(ArrayList<May> list) {
        this.list = list;
    }
}
