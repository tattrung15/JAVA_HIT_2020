package ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private int n;
    private ArrayList<Hang> list;

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã phiếu: ");
        maPhieu = scanner.nextLine();
        System.out.print("Nhập số lượng hàng: ");
        n = scanner.nextInt();
        list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin hàng thứ " + (i + 1));
            Hang hang = new Hang();
            hang.Nhap();
            list.add(hang);
        }
    }

    public void Xuat(){
        System.out.println("Mã phiếu: " + maPhieu);
        System.out.println("Số lượng hàng: " + n);
        for (Hang hang : list){
            hang.Xuat();
        }
    }

    public long TongTien(){
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += list.get(i).getDonGia();
        }
        return sum;
    }

    public Phieu() {
    }

    public Phieu(String maPhieu, int n, ArrayList<Hang> list) {
        this.maPhieu = maPhieu;
        this.n = n;
        this.list = list;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public ArrayList<Hang> getList() {
        return list;
    }

    public void setList(ArrayList<Hang> list) {
        this.list = list;
    }
}
