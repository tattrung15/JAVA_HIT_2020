package ex3;

public class RunMain {
    public static void main(String[] args) {
        HangHoa hh1 = new HangHoa("abc", "cần sa", 10000000, 2);
        HangHoa hh2 = new HangHoa();

        hh2.setMaHang("xyz");
        hh2.setTenHang("ma túy");
        hh2.setDonGia(12000000);
        hh2.setSoLuong(123);

        hh1.Xuat();
        hh2.Xuat();
    }
}
