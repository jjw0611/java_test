public class Exam2 {
    public String solution(String s) {
        String answer = "";

        String[] a = s.split("");
        //입력받은 문자열을 split()메서드를 사용하여
        //한글자씩 String 배열에 담기 공백포함!

        int idx = 0;//문자열 인덱스를 구분할 변수 선언

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(" ")) { //i번째 문자가 공백이 아닐때만 실행되는 조건문
                if (idx % 2 == 0) { //짝수일때
                    a[i] = a[i].toUpperCase(); //대문자로 변환!
                }
                idx++;
            }
            answer += a[i];
        }
        return answer;
    }

    public static void main (String[] args){
        Exam2 method = new Exam2();
        String s = "hang hae ninety nine";
        System.out.println(method.solution(s));
        //HaNg HaE nInEtY nInE
    }
}
