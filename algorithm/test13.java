package algorithm;

public class test13 {
    //a는 월 b는 일 1월1일은 금요일
    public String main(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        //String배열에 모든요일을 넣어주자 1월1일이 금요일이니 금요일부터 시작!
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //각 월의 모든날짜수를 넣어주자 2월은 윤년이니 29일!
        int select = 0;
        //몇월 몇일을 숫자로 나타난 변수를 select로 지정

        for (int i = 0; i < a - 1; i++) {
            select += date[i];
        }
        select += b - 1;

        return day[select % 7];
    }
}
//1월1일을 기준으로 삼았을 때 a월 b일의 일수를 계산한다
//ex)1월1일은 1일 => 5월 25일은 146일!
//5월 25일이 무슨요일인지 구하고 싶다면
//1~4월까지의 날짜를 모두 더한뒤 25일을 더한다

//6월 5일일경우 a=6 b=5
//for문에서 select에 31 + 29 + 31 + 30 + 31 5월까지의 일자를 더 더해준다
//그 다음 select에 b - 1인 4의 값을 더해준다
//select는 156이 되고 7로 나눈 나머지는 2이므로 SUN이 나온다

//b - 1을 하는 이유
//1월 1일 경우 b - 1이 아니라면
//day[select]는 day[1]이 되고 그러면 1월1일은 금요일인데 SAT가 나온다
//배열은 0번부터 시작하기 때문에 1을 빼준다