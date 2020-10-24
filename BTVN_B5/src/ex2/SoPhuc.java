package ex2;

import java.util.Scanner;

public class SoPhuc {
    private double thuc;
    private double ao;

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phần thực: ");
        thuc = scanner.nextDouble();
        System.out.print("Nhập phần ảo: ");
        ao = scanner.nextDouble();
    }

    public void Xuat(){
        System.out.println(thuc + ((ao > 0) ? " + " : " ") + ao + "i");
    }

    public SoPhuc Cong(SoPhuc p){
        SoPhuc t = new SoPhuc();
        t.thuc = this.thuc + p.thuc;
        t.ao = this.ao + p.ao;
        return t;
    }

    public SoPhuc Tru(SoPhuc p){
        SoPhuc t = new SoPhuc();
        t.thuc = this.thuc - p.thuc;
        t.ao = this.ao - p.ao;
        return t;
    }

    public SoPhuc() {
    }

    public SoPhuc(double thuc, double ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public double getThuc() {
        return thuc;
    }

    public void setThuc(double thuc) {
        this.thuc = thuc;
    }

    public double getAo() {
        return ao;
    }

    public void setAo(double ao) {
        this.ao = ao;
    }
}
