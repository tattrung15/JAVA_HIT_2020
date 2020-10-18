package ex3;

public class RunMain {
    public static void main(String[] args) {
        Phieu phieu = new Phieu();
        phieu.Nhap();
        phieu.Xuat();
        System.out.println("Tổng tiền: " + phieu.TongTien());
    }
}
