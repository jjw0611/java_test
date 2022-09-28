package algorithm;

public class test27 {
    public int solution(int num) {
        int answer = 0;

        //num이 1이 아닐때 실행되는 반복문
        //1이 나올때까지 반복
        while (num != 1) {
            //num이 짝수이면 2로나누고 아닐때는 3곱하고 1더하기
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
            answer++;//횟수를 1씩 추가 => 다시 반복

            if(answer > 500){
                return -1;
            }
        }
        return answer;
    }
}
