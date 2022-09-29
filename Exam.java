import java.util.Arrays;

public class Exam {
        public int solution(int[] arr1) {
            int answer = 0;

            int[] a = {0,1,2,3,4,5,6,7,8,9}; //arr1과 비교하여 없는 숫자를 찾아내는 배열a 생성
            Arrays.sort(arr1);//a와 비교할수 있게 오름차순정렬하기
            int min = 0; //최솟값을 담을 변수 min 생성
            int max = 0; //최댓값을 담을 변수 max 생성

            for(int i = 0; i < a.length; i++){
                if(arr1[i] != a[i]){ //두 배열의 각 요소 비교시 같지않으면 최솟값
                    min = i;
                    break; //값을 찾았다면 반복문 종료
                }
            }

            for(int i = a.length-1; i >= 0; i--){//최솟값의 순서와는 반대로!
                if(arr1[i-2] != a[i]){
                    max = i;
                    break;
                }
            }

            for(int i = min; i < max +1; i++){//최솟값부터 최댓값까지 더하기
                answer += i;
            }
            return answer;
        }

        public static void main(String[] args) {
            Exam method = new Exam();
            int[] arr1 = {1,3,5,9,2,4,8,0};
            System.out.println(method.solution(arr1));
        }
}
