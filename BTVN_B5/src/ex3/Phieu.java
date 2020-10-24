package ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private String tenPhieu;
    private DateTime a;
    private ArrayList<SanPham> list;
    private int n;
    
    public void InputPhieu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã phiếu: ");
        maPhieu = scanner.nextLine();
        System.out.print("Nhập tên phiếu: ");
        tenPhieu = scanner.nextLine();
        a = new DateTime();
        a.InputDate();
        System.out.print("Nhập số lượng sản phẩm: ");
        n = scanner.nextInt();
        list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SanPham sanPham = new SanPham();
            System.out.println("Nhập sản phẩm thứ " + (i + 1));
            sanPham.InputSP();
            list.add(sanPham);
        }
    }
    
    public void OutputPhieu(){
        System.out.println("Mã phiếu: " + maPhieu);
        System.out.println("Tên phiếu: " + tenPhieu);
        for (int i = 0; i < n; i++) {
            list.get(i).OutputSP();
        }
    }

    public Phieu() {
    }

    public Phieu(String maPhieu, String tenPhieu, DateTime a, ArrayList<SanPham> list, int n) {
        this.maPhieu = maPhieu;
        this.tenPhieu = tenPhieu;
        this.a = a;
        this.list = list;
        this.n = n;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getTenPhieu() {
        return tenPhieu;
    }

    public void setTenPhieu(String tenPhieu) {
        this.tenPhieu = tenPhieu;
    }

    public DateTime getA() {
        return a;
    }

    public void setA(DateTime a) {
        this.a = a;
    }

    public ArrayList<SanPham> getList() {
        return list;
    }

    public void setList(ArrayList<SanPham> list) {
        this.list = list;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
