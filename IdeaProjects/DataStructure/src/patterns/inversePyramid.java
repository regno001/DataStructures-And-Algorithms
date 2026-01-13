package patterns;

import java.util.Scanner;

public class inversePyramid {
    public static void main(String[] args) {
        System.out.println("Enter the num of row ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                System.out.print("*"+ " ");
            }
            System.out.println(" ");
        }
    }
}
