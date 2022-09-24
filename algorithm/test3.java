package algorithm;

import java.util.Scanner;

public class test3 {
    public String main(String s) {
        return s.substring((s.length() - 1) / 2, s.length() / 2 + 1);
    }
}

//substring(a,b) : a번째 부터 b번째 전까지 잘라내서 표시
//짝수인 경우 4 => (4 - 1) / 2 = 1 부터 4 / 2 + 1 = 3 까지인데 b번째 전까지 이니 2가되어  1 ~ 2 두글자를 잘라 return
//홀수인 경우 5 => (5 - 1) / 2 = 2 부터 5 / 2 + 1 = 3 까지인데 b번째 전까지 이니 2가되어  2 ~ 2 한글자만 잘라 return