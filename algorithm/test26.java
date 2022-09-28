package algorithm;

public class test26 {
    public int[] solution(int[] arr) {

        //배열 길이가 1인 경우 -1반환
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        //배열길이가 1보다 클때 가장 작은 수를 뺀 길이의 배열로 만들기
        int[] answer = new int[arr.length -1];

        int min = arr[0];

        //가장 작은 수 구하기
        //Math.min() : min과 arr[i] 중에서 가장작은값 반환
        for(int i = 0; i < arr.length; i++){
            min = Math.min(min, arr[i]);
        }

        int index = 0;//반복문용 변수 가장작은수가 여러개일수 있기때문에

        //가장작은수를 제외한 배열만들기
        for (int i = 0; i < arr.length; i++){
            //배열의 값이 가장 작은 수라면!
            if(arr[i] == min){
                //continue를 이용하여 배열에 넣어주지 않고
                //반복부분 탈출후 다음반복실행
                continue;
            }
            //in
            answer[index++] = arr[i];
        }
        return answer;
    }
}
