package algorithm;

public class test6 {
    //정수 배열 numbers 매개변수
    public int main(int[] numbers) {

        int sum = 45; //0~9까지의 합

        for (int i = 0; i < numbers.length; i++) { //배열의 numbers 길이만큼 반복
            sum -= numbers[i];
            //sum = sum - numbers[i]
            //총 합 45에서 배열에 들어가있는 각 값을 하나씩 빼준다
            //왜냐면 우리는 배열numbers에 찾을수 없는 모든값의 합을 구하면되니까!
        }
        return sum;
    }
}
