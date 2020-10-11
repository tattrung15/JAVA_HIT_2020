package ex2;

public class Dog {
    private String name;
    private int MP = 100;

    public void InputName(String name){
        this.name = name;
    }

    public void ShowMP(){
        System.out.println("MP còn: " + MP);
    }

    public void Bark(){
        if(!name.equals("")){
            System.out.println(name + " gâu gâu");
            MP -= 20;
        } else {
            System.out.println("Xin lỗi bạn chưa điền tên");
        }
    }
}
