package algorithm;

public class test6 {
    public int main(int[] absolutes, boolean[] signs){
        int answer = 0;

        for(int i = 0; i < absolutes.length; i++){
            if(signs[i] == true){
                answer += absolutes[i];
                //answer = answer + absolutes[i]
                //boolean값이 true일 경우 즉, 양수일 경우 더하고
            }else{ // 아닐경우 false일경우 전체 값에서 뺀다
                answer -= absolutes[i];
                //answer = answer - absolutes[i]
            }
        }
        return answer;
    }
}
