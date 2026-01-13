package patterns;

import java.util.Scanner;

public class inverseNumberPyramid {
    public static void main(String[] args) {
        System.out.println("Enter the num ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=i;j<=n;j++){

                System.out.print(j-i+1 +" " );
            }
            System.out.println(" ");
        }
    }
}
