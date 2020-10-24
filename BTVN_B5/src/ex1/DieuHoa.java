package ex1;

import java.util.Scanner;

public class DieuHoa extends SanPham {
    private int congSuat;
    private long giaBan;

    @Override
    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        super.Nhap();
        System.out.print("Nhập công suất: ");
        congSuat = scanner.nextInt();
        System.out.print("Nhập giá bán: ");
        giaBan = scanner.nextLong();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println(" - " + congSuat + " - " + giaBan);
    }

    public DieuHoa() {
    }

    public DieuHoa(int congSuat, long giaBan) {
        this.congSuat = congSuat;
        this.giaBan = giaBan;
    }

    public DieuHoa(String maSanPham, String tenSanPham, String tenHSX, String ngayNhap, int congSuat, long giaBan) {
        super(maSanPham, tenSanPham, tenHSX, ngayNhap);
        this.congSuat = congSuat;
        this.giaBan = giaBan;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }
}
