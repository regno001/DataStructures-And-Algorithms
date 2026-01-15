package Array;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of row ");
        int a= input.nextInt();
        System.out.println("Enter the column");
        int b= input.nextInt();
        int[][] arr= new int[a][b];
        for (int i=0;i< a;i++){
            for (int j=0;j<b;j++){
                System.out.println("at"+ i + j);
                arr[i][j]=input.nextInt();
            }
        }
        System.out.println("Enter the number that to be found ");
        int c=input.nextInt();
        for (int i=0;i< a;i++){
            for (int j=0;j<b;j++) {
             if (c==arr[i][j]){
                 System.out.printf("element found  %d at %d",c,arr[i][j]);
             }else {
                 System.out.println("Element is not found");
             }

            }}
            }
}
