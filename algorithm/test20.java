package algorithm;

import java.util.HashMap;
import java.util.Map;

public class test20 {
    public String solution(String[] participant, String[] completion){
        String answer = "";
        //key는 String형태, value는 Integer형태인 HashMap생성
        Map<String, Integer> hm = new HashMap<>();

        //String배열 participant의 값을 변수 p로 보낸다
        for(String p : participant){
            //HashMap에 데이터를 넣기위해 put()메서드를 사용
            //put(key, value)
            //getOrDefault()메서드
            //찾는키가 존재한다면 찾는키의 값을 반환
            //없다면 기본값을 반환하는 메서드
            //getOrDefault(key, DefaultValue)
            hm.put(p, hm.getOrDefault(p, 0) + 1);
            //참가자를 key값으로 value는 +1을 hm에 넣는다
        }

        for(String c : completion){
            //get()메서드 map의값 가져오기(여기서는 hm)
            //completion 명단이 key값에 존재하면 value에 -1
            hm.put(c, hm.get(c) - 1);
        }

        //keySet() Map에 저장되어있는 모든key들을 반환
        //반환후 key변수에 넣는다
        for(String key : hm.keySet()){
            //hm에서 가져온 key 값이 0이 아닐경우
            //
            if(hm.get(key) != 0){
                answer = key;
                break;
            }
        }
        return answer;
    }
}
//for-each문
//for(자료형 변수 : 배열){ 배열의 값이 있으면 자료형 변수로 값을 보내주고
//  반복실행할 문장        문장을 실행
//}                      값이 없으면 종료