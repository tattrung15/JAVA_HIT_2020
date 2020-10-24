package ex3;

public class RunMain {
    public static void main(String[] args) {
        Phieu phieu = new Phieu();
        phieu.InputPhieu();
        System.out.println("--------------------Phiếu vừa nhập: --------------------");
        phieu.OutputPhieu();
        double thanhTien = 0;
        for(int i = 0; i < phieu.getN(); i++){
            thanhTien += phieu.getList().get(i).getDonGia() * phieu.getList().get(i).getSoLuong();
        }
        System.out.println("Thành tiền: " + thanhTien);
    }
}
