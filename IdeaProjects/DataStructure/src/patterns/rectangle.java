package patterns;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Length");
        int a = input.nextInt();
        System.out.println("Enter the width");
        int b= input.nextInt();
        for (int i=0;i<b;i++){
            for (int j =0;j<a;j++){
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }
}
