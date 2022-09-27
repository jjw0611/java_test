package algorithm;

public class test23 {
    public int[] solution(long n) {
        //문자열 + 숫자 = 문자열 String으로 할당
        String s = "" + n;

        //입력받은 문자열 길이만큼 배열생성
        int[] answer = new int[s.length()];
        int count = 0;

        //n=123일 경우
        while (n > 0){
            answer[count] = (int) (n % 10);
            //answer[0] = 3
            //answer[1] = 2
            n /= 10; //n = n /10 , n=12
            count++; //count증가 즉, 배열의 인덱스값 증가
        }

        return answer;
    }
}
