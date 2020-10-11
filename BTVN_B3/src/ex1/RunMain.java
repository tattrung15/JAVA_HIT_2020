package ex1;

public class RunMain {
    public static void main(String[] args) {
        Person DoanXinhGai = new Person();
        Person DiepBueDe = new Person();

        DoanXinhGai.setName("Doan Xinh Gái");
        DoanXinhGai.setDateOfBirth("không biết");
        DoanXinhGai.setGender("Nữ");
        DoanXinhGai.setHobby("Điệp");

        DiepBueDe.setName("Điệp Buê Đê");
        DiepBueDe.setDateOfBirth("không biết");
        DiepBueDe.setGender("Khác");
        DiepBueDe.setHobby("Doan");

        System.out.println(DoanXinhGai.getName());
        System.out.println(DoanXinhGai.getDateOfBirth());
        System.out.println(DoanXinhGai.getGender());
        System.out.println(DoanXinhGai.getHobby());

        System.out.println(DiepBueDe.getName());
        System.out.println(DiepBueDe.getDateOfBirth());
        System.out.println(DiepBueDe.getGender());
        System.out.println(DiepBueDe.getHobby());
    }
}
