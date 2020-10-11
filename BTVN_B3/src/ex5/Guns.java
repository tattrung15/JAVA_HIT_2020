package ex5;

public class Guns {
    private String weaponName;
    private int ammoNumber;

    public void Load(int x){
        ammoNumber += x;
    }
    public void Shoot(int x){
        if(ammoNumber - x >= 0){
            ammoNumber -= x;
        }
        if(ammoNumber == 0){
            System.out.println(weaponName + " hết đạn");
        }
    }

    public Guns() {
    }

    public Guns(String weaponName, int ammoNumber) {
        this.weaponName = weaponName;
        this.ammoNumber = ammoNumber;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getAmmoNumber() {
        return ammoNumber;
    }

    public void setAmmoNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }
}
