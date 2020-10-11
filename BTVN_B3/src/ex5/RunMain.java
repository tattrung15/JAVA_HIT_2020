package ex5;

public class RunMain {
    public static void main(String[] args) {
        Guns dt1 = new Guns();
        Guns dt2 = new Guns();
        dt1.setWeaponName("Doan");
        dt2.setWeaponName("Điệp");
        dt1.Load(100);
        dt2.Load(100);
        while(dt1.getAmmoNumber() != 0 && dt2.getAmmoNumber() != 0){
            dt1.Shoot(100);
            dt2.Shoot(10);
            if (dt1.getAmmoNumber() == 0) {
                System.out.println("Doan thua");
                break;
            }
            if(dt2.getAmmoNumber() == 0){
                System.out.println("Điệp thua");
                break;
            }
        }
    }
}
