package patterns;

import java.util.Scanner;

public class ZeroOneTrianglr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of line that you want to print ");
        int n = input.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if ((i+j)%2==0){
                    System.out.print("1"+ " ");
                    num++;
                }else{
                    System.out.print("0"+ " ");
                    num++;
                }
            }
            System.out.println(" ");
        }
    }

}
