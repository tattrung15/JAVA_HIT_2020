package ex5;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;
        double s = 0;
        for (int i = 0; i < str.length(); i++){
            char charAtI = str.charAt(i);
            if(Character.isDigit(charAtI)){
                s += Integer.parseInt(String.valueOf(charAtI));
                count++;
            }
        }
        System.out.println(s/count);
    }
}
