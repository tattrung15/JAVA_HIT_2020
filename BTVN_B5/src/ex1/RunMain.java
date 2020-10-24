package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        ArrayList<DieuHoa> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            DieuHoa dieuHoa = new DieuHoa();
            System.out.println("Nhập thông tin điều hòa thứ " + (i + 1));
            dieuHoa.Nhap();
            list.add(dieuHoa);
        }
        HienThiDieuHoaTheoHSXVaGiaBanThapNhat(list, "Electrolux");
    }

    private static void HienThiDieuHoaTheoHSXVaGiaBanThapNhat(ArrayList<DieuHoa> list, String hangSX) {
        boolean check = false;
        long giaThapNhat = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTenHSX().compareTo(hangSX) == 0){
                giaThapNhat = list.get(i).getGiaBan();
                check = true;
            }
        }
        if (!check){
            System.out.println("Không tồn tại điều hòa hãng " + hangSX);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getGiaBan() < giaThapNhat && list.get(i).getTenHSX().compareTo(hangSX) == 0){
                giaThapNhat = list.get(i).getGiaBan();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getGiaBan() == giaThapNhat && list.get(i).getTenHSX().compareTo(hangSX) == 0){
                list.get(i).Xuat();
            }
        }
    }
}
