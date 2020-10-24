package ex4;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private double gpa;

    public void Nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập id: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập tên: ");
        name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        address = scanner.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        gpa = scanner.nextDouble();
    }

    public Student() {
    }

    public Student(int id, String name, int age, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
