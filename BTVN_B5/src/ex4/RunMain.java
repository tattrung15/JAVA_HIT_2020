package ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        int choice;
        do {
            System.out.println("----------------------MENU----------------------");
            System.out.println("1. Add student.");
            System.out.println("2. Edit student by id.");
            System.out.println("3. Delete student by id.");
            System.out.println("4. Sort students by gpa.");
            System.out.println("5. Sort students by name.");
            System.out.println("6. Show students.");
            System.out.println("0. Exit.");
            System.out.print("Your choice: ");

            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    AddNewStudent(list);
                    break;
                case 2:
                    ShowStudents(list);
                    EditStudentById(list);
                    break;
                case 3:
                    ShowStudents(list);
                    DeleteStudentById(list);
                    break;
                case 4:
                    SortStudentsByGpa(list);
                    ShowStudents(list);
                    break;
                case 5:
                    SortStudentsByName(list);
                    ShowStudents(list);
                    break;
                case 6:
                    ShowStudents(list);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

    private static void AddNewStudent(ArrayList<Student> list) {
        boolean checkExists = false;
        int id = 0;
        do {
            System.out.print("Input id: ");
            id = scanner.nextInt();
            checkExists = CheckExistsId(list, id);

            if (checkExists) {
                System.out.println("Id already exists");
            } else {
                break;
            }
        } while (true);

        scanner.nextLine();
        System.out.print("Input name: ");
        String name = scanner.nextLine();
        System.out.print("Input age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Input address: ");
        String address = scanner.nextLine();
        System.out.print("Input gpa: ");
        double gpa = scanner.nextDouble();

        Student student = new Student(id, name, age, address, gpa);
        list.add(student);
        System.out.println("Added new student");
    }

    public static void EditStudentById(ArrayList<Student> list){
        String name;
        int age;
        String address;
        double gpa;

        boolean checkExists = false;
        System.out.print("Input id to edit: ");
        int id = scanner.nextInt();
        checkExists = CheckExistsId(list, id);
        if (checkExists){
            Student student = GetStudentById(list, id);
            int choice;
            do {
                System.out.println("1. Edit name.");
                System.out.println("2. Edit age.");
                System.out.println("3. Edit address.");
                System.out.println("4. Edit gpa.");
                System.out.print("Your choice: ");

                choice = scanner.nextInt();

                switch (choice){
                    case 1:
                        System.out.print("Input name to edit: ");
                        scanner.nextLine();
                        name = scanner.nextLine();
                        student.setName(name);
                        System.out.println("Edited student name");
                        break;
                    case 2:
                        System.out.print("Input age to edit: ");
                        age = scanner.nextInt();
                        student.setAge(age);
                        System.out.println("Edited student age");
                        break;
                    case 3:
                        System.out.print("Input address to edit: ");
                        scanner.nextLine();
                        address = scanner.nextLine();
                        student.setAddress(address);
                        System.out.println("Edited student address");
                        break;
                    case 4:
                        System.out.print("Input gpa to edit: ");
                        gpa = scanner.nextDouble();
                        student.setGpa(gpa);
                        System.out.println("Edited student gpa");
                        break;
                }

            } while (choice >= 5 || choice <= 0);

        } else {
            System.out.println("Id does not exist");
        }
    }

    public static void DeleteStudentById(ArrayList<Student> list){
        boolean checkExists = false;
        System.out.print("Input id to delete: ");
        int id = scanner.nextInt();
        checkExists = CheckExistsId(list, id);
        if (checkExists){
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == id){
                    list.remove(i);
                    break;
                }
            }
            System.out.println("Removed student has id " + id);
        } else {
            System.out.println("Id does not exist");
        }
    }

    public static void SortStudentsByGpa(ArrayList<Student> list){
        for (int i = 0; i < list.size() - 1; i++){
            for (int j = list.size() - 1; j > i; j--){
                if (list.get(j - 1).getGpa() < list.get(j).getGpa()){
                    Student temp = list.get(j - 1);
                    list.set(j - 1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static void SortStudentsByName(ArrayList<Student> list){
        for (int i = 0; i < list.size() - 1; i++){
            for (int j = list.size() - 1; j > i; j--){
                if (list.get(j - 1).getName().compareTo(list.get(j).getName()) > 0){
                    Student temp = list.get(j - 1);
                    list.set(j - 1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static void ShowStudents(ArrayList<Student> list){
        for (Student s : list){
            System.out.println(s);
        }
    }

    public static boolean CheckExistsId(ArrayList<Student> list, int id){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                return true;
            }
        }
        return false;
    }

    public static Student GetStudentById(ArrayList<Student> list, int id){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                return list.get(i);
            }
        }
        return null;
    }
}
