package algorithm;

public class test22 {
    public class Solution {
        public int solution(int n) {
            int answer = 0;
            int a = 0;

            while (true){
                a = n % 10; //n=12345일경우 a= 5
                n = n / 10; //n=1234
                answer += a; //answer = answer + 5

                if(n == 0)//n이 0이되면 반복문탈출!
                    break;
            }
            return answer;
        }
    }
}