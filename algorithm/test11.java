package algorithm;

public class test11 {
    public long[] main(int x, int n){
        long[] answer = new long[n];
        //long[]배열의 길이는 입력받은 n만큼이어야 한다
        //n개를 지니는 리스트를 리턴해야하니까!
        for(int i = 0; i < answer.length; i++){
            answer[i] += x * (i + 1);
        }
        return answer;
    }
}
//n개의 갯수만큼 x의 배수가 나오면 된다!
//x=2 n=5일경우
//answer[0] = 2 * 1 = 2
//answer[1] = 2 * 2 = 4