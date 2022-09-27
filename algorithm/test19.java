package algorithm;

public class test19 {
    public String solution(int n){
        String answer= "";

        for(int i = 0; i < n; i++){
            answer += (i % 2 == 0) ? "수" : "박";
        }
        return answer;
    }
    public static void main(String[] args){
        test19 method = new test19();
        System.out.println(method.solution(1));
    }
}
//n=1일때 0 나누기 2의 나머지는 0이므로 수
//n=2일때 i = 0, 1
//1 나누기 2의 나머지는 1이므로 수박
//삼항연산자를 이용