package algorithm;

public class test25 {
    public long solution(long n) {
        long answer = 0;
        //Math.sqrt(n) : n의 제곱근을 구하는 메서드
        double a = Math.sqrt(n);



        if(a % 1 > 0){
            //a를 나눈 나머지가 0보다 클경우
            //a가 실수일경우를 말함
            //n=3일 경우 a=루트3
            //a는 실수 루트3은 대략 1.73~~
            //루트3을 1로 나눈 나머지는 0.73~~
            answer = -1;

            //n=121일 경우 a=11
        }else {//a가 정수일경우
            //Math.pow(a, b):a를 b제곱한다
            //a를1더한값을 제곱한다
            answer = (long)Math.pow(a+1, 2);
        }
        return answer;
    }
}
