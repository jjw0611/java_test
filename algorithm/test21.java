package algorithm;

public class test21 {
    public String solution(String s){
        String answer = "";
        int idx = 0; //문자열 인덱스를 구분할 변수 선언

        String[] strArr = s.split("");
        //입력받은 문자열을 split()메서드를 활용해서
        //한글자씩 String 배열에 담기

        //for문을 통해 공백 처리
        //문자열 중 공백이 있다면 idx를 0으로 초기화
        //0으로 초기화켜야 각 단어마다 짝,홀 구분가능
        for(int i = 0; i < strArr.length; i++){
            if(("").equals(strArr[i])){
                idx = 0;
            }else {//공백이 아니라면 이글자의 홀짝 계산
                //짝수일 경우 대문자로 변경(toUpperCase메서드)
                if(idx % 2 == 0){
                    idx++; //idx++왜하는거져??
                    strArr[i] = strArr[i].toUpperCase();
                }else{//홀수일경우 소문자로 변경(toLowercase메서드)
                    idx++;
                    strArr[i] = strArr[i].toLowerCase();
                }
            }
            answer += strArr[i];
        }
        return answer;
    }
}