package algorithm;

public class test28 {
    public boolean solution(int x) {
        boolean answer = true;

        //valueOf() : 괄호안의 해당 객체를 String객체로 변환
        String str = String.valueOf(x);

        //split() : 각 자릿수를 numberArr배열에 담기
        //x=10 이라면 [1, 0] 이된다
        String[] numberArr = str.split("");

        int sum = 0;

        //numberArr배열의 값들을 num에 담기
        for(String num : numberArr){
            //num을 int로 형변환 후 num에 누적시켜 더하기
            num+= Integer.parseInt(num);
        }
        //입력받은수인 x를 sum으로 나눈 나머지가 0이면 true
        //아니면 false를 리턴!
        return (x % sum == 0 ? true : false);
    }
}
