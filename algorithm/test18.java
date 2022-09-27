package algorithm;

public class test18 {
    public String main(String[] seoul){
        String answer = "";

        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }
}
//equals()메서드를 사용하여 "Kim"의 위치가 배열의 몇번째에 있는지
//찾은 후 i를 answer에 넣어준다