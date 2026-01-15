package Array;

import java.util.Scanner;

public class SearchNumberArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ente the number that is to be searched");
        int a= input.nextInt();
        int arr[]= {1,2,3,4,5};
        for (int i=0;i<arr.length;i++){
            if(a==arr[i]){
                System.out.printf("Found element %d at %d",a,i);
            }
        }

    }
}
