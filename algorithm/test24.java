package algorithm;

import java.util.Arrays;

public class test24 {
    public long solution(long n) {
        //n=118372
        long answer = 0;
        //toString() : 객체가 가지고 있는 정보나 값들을 문
        //문자열로 만들어 리턴하는 메서드
        String str = Long.toString(n);
        //toCharArray() : 문자열을 char형 배열로 바꿔주는 메서드
        char[] arr = str.toCharArray();

        //char 배열의 모든 요소 오름차순 정렬
        Arrays.sort(arr); //arr=873211

        //정렬한 배열을 다시 String으로!
        String newstr = new String();
        for(int i = arr.length -1; i >= 0; i--){
            newstr += arr[i];
        }
        //newstr = newstr + arr[5] , arr[5]=1

        //for(int i = 0; i < arr.length; i++){
        //            newstr += arr[i];
        //        }
        //안되는것인가?

        //String배열을 다시 long으로 변환!
        answer = Long.parseLong(newstr);

        return answer;
    }
}
