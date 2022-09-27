package algorithm;

public class test8 {
    public double main(int[] arr){
        double answer = 0;
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
            //answer = answer + arr[i]
            //배열에 있는 모든값을 더해 answer에 넣어준다
        }
        answer = answer / arr.length;
        //평균을 구해야 하니
        //더한 모든 값을 배열의 길이(arr의 원소 개수)만큼 나눈다
        return answer;
    }
}

