package algorithm;

public class test15 {
    public int main(int[] a, int[] b){
        int answer = 0;

        for(int i = 0; i < a.length; i++){
            answer += a[i] * b[i];
        }
        return answer;
    }
}
//배열 a,b가 길이가 같다고 했으므로
//반복문을 통해 각 배열의 값을 곱한뒤 더해준다