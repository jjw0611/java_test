package algorithm;

public class test9 {
    public String main(String phone_number){
        String answer = "";

        String[] numberArr = phone_number.split("");
        //split()메서드를 사용해 문자열의 각 문자를 배열에 담는다

        //담은 배열의 길이만큼 반복문 실행
        for(int i = 0; i < numberArr.length; i++){
            if(i < numberArr.length - 4){
                answer += "*";
                //answer = answer + "*"
            }else {
                answer += numberArr[i];
                //answer = answer + numberArr[i]
            }
        }
        return answer;
    }
}
//phone_number = 12345일 경우
//i = 0일때
//조건문에 의해 0 < 1 이니 if문이 참이므로 조건실행
//answer = *
//i = 1일때
//조건문에 의해 1 < 1 이므로 else문 실행
//answer = *2

