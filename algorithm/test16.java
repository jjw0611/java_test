package algorithm;

public class test16 {
    boolean main(String s){
        boolean answer = true;
        int p = 0;
        int y = 0;

        //전부 소문자로 변경
        s = s.toLowerCase();

        //p와 y의 개수 세기
        for(int i =0; i < s.length(); i++){
            char c = s.charAt(i);
            //String타입의 문자열을 char타입으로 변환시켜주는
            //charAt()메서드 사용
            //char타입의 변수 c 선언 후
            //s.charAt(i)의 의미가 무엇이냐?
            //str이 가리키고 있는 문자열에서 i번째에 잇는 문자를
            //char타입으로 변환한다는 의미!
            if(c == 'p'){
                p++;
            }else if(c == 'y'){
                y++;
            }
            answer = p == y ? true : false;
        }
        return answer;
    }
}
