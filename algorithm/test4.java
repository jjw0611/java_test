package algorithm;

public class test4 {
    public long main(int a, int b){
        long answer = 0;
        if(a <= b){
            for(int i = a; i <= b; i++){
                answer += i;
                //answer = answer + i
            }
        }else { //(a > b)
            for(int i = b; i <= a; i++){
                answer += i;
            }
        }
        return answer;
    }
}
//a=3 b=5 일경우
//if문에 의해 3 <= 5
//내부 for문 실행에 따라 i가 3부터 5보다 작거나같을때까지 반복
//a=5 b=3 일경우
//else문 5 > 3
//
