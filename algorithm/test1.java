package algorithm;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i < m; i++){ // m줄을 출력해야 하니 m번 반복
            for(int j = 0; j < n; j++) { //n개의 별을 출력해야 하니 n번 반복
                System.out.print("*");
            }
            System.out.println();//n개의 별을 출력하면 다음줄로!
        }
    }
}
