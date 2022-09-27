package algorithm;

public class test10 {
    public int[][] main(int[][] arr1, int[][] arr2) {
        //arr1과 arr2 행과 열의 크기가 같다면
        //answer의 값을 arr1의 배열크기만큼 초기화해도 되지않을까?
        int[][] answer = {};
        answer = arr1;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] += arr2[i][j];
                //answer[i][j] = answer[i][j] + arr2[i][j]
            }
        }
        return answer;
    }
}
//이중 for문
//바깥쪽 for문은 다음 반복으로 넘어가기 위해서 안쪽for문을 모두 마쳐야함
//따라서 j for문 안쪽의 가장 안쪽문장은
//(i for문 반복횟수) * (j for문 반복횟수) 만큼 수행
//arr1 = {(1, 2), (3, 4)}
//arr2 = {(1, 2), (2, 3)}