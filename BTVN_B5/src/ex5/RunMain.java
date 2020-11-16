package ex5;

public class RunMain {
    public static void main(String[] args) {
        LopHoc lopHoc = new LopHoc();
        lopHoc.Nhap();
        lopHoc.Xuat();
        SoLuongSVTheoKhoa(lopHoc, 14);
        SapXepDSLopTheoKhoaHoc(lopHoc);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>Sau khi sắp xếp danh sách sinh viên<<<<<<<<<<<<<<<<<<<<<<<<<");
        lopHoc.Xuat();
    }

    private static void SoLuongSVTheoKhoa(LopHoc lopHoc, int khoaHoc) {
        int count = 0;
        for (SinhVien sinhVien : lopHoc.getList()) {
            if (sinhVien.getKhoaHoc() == khoaHoc) {
                count++;
            }
        }
        System.out.println("Có " + count + " sinh viên khóa 14");
    }

    private static void SapXepDSLopTheoKhoaHoc(LopHoc lopHoc) {
        for (int i = 0; i < lopHoc.getList().size() - 1; i++) {
            for (int j = lopHoc.getList().size() - 1; j > i; j--) {
                SinhVien sv1 = lopHoc.getList().get(j - 1);
                SinhVien sv2 = lopHoc.getList().get(j);
                if (sv1.getKhoaHoc() > sv2.getKhoaHoc()) {
                    lopHoc.getList().set(j - 1, sv2);
                    lopHoc.getList().set(j, sv1);
                }
            }
        }
    }
}
