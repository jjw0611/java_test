package algorithm;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }
    }
}
