package algorithm;

public class test17 {
    public boolean main(String s){
        boolean answer = true;

        if(s.length() == 4 || s.length() == 6){
            answer = s.matches("^[0-9]*$");
        }
        return answer;
    }
}
//문자열 s의 길이가 4 or 6일때만 반환해야하니 || 사용!
//변수로 정규표현식을 가지는 matches()메서드 사용
//문자열에 정규식과 일치하는 부분이 있는지 체크하는 메서드
//문자열에 숫자만 있어야 true를 return하므로
//^패턴의시작 [0-9] 괄호사이의 두 숫자를 넣어 범위를 지정
//*를 넣으면 글자수를 상관하지 않고 검사
//$으로 정규식 종료!