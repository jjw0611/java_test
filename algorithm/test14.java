package algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class test14 {
    public int[] main(int[] arr, int divisior){
        int[] answer = {};
        //ArrayList 선언
        //Integer객체들로 이루어진 ArrayList 객체를 만들겠다는 뜻!
        ArrayList<Integer> divList = new ArrayList();

        //나누어 떨어지는 수 구하기
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisior == 0){
                divList.add(arr[i]);
                //값을 추가하기 위한 add()메서드 사용
            }
        }
        //나누어 떨어지는 수가 없는 경우
        //반환값이 없는경우
        //배열의 크기가 0인경우
        if(divList.size() == 0){
            //배열의 크기를 알기 위해 size()메서드 사용
            answer = new int[1]; //크기 1짜리 배열 선언
            answer[0] = -1; //-1을 담아 return
        }
        //나누어 떨어지는 수가 있는 경우
        else{
            answer = new int[divList.size()];
            //새로운 배열에 divList의 크기만큼 크기지정

            //오름차순 정렬
            //List를 정렬할때 사용되는 Collections.sort
            Collections.sort(divList);

            for(int i = 0; i < divList.size(); i++){
                answer[i] = divList.get(i);
                //get() 특정값 가져오기
                //오름차순으로 정렬된 모든 값들을
                //반복문을 사용하여 answer배열에 넣는다
            }
        }
        return answer;
    }
}
//한번생성되면 크기가 변하지 않는 일반배열과는 달리
//객체가 추가되면서 필요할 경우 자동으로 크기가 늘어나는
//가변배열인 ArrayList를 사용해보자
//ArrayList도 하나의 클래스이며 그 클래스는 자바에서
//이미 만들어 놓았고 우리는 그 객체를 생성해서 사용한다!