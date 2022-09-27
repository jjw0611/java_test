public class Main {
    public String solution(int n) {
        String answer = "";
        int sum = 0;

        char[] s = Integer.toString(n).toCharArray();
        //한자리 한자리씩 처리하게 위해 자연수n을 배열에 넣기!
        //toString()메서드로 String으로 바꾸기
        //tocharArray()메서드를 이용하여 배열에 넣기

        for (int i = s.length - 1; i >= 0; i--) {
            //맨 뒤의 숫자(일의 자리 숫자)를 앞으로 끌어와 먼저 더해야 하므로
            //시작값을 길이의 - 1, 끝 값을 0보다 같거나 크게!
            //718253의 경우 5부터 0까지

            sum += Integer.parseInt(String.valueOf(s[i]));
            //총합을 출력하기 위해 parseInt함수를 이용하여 String을 다시 int로!
            //s[5]= 3 + s[4] = 5 + ... s[0] = 7

            if (i == 0) { //0번째는 총합의 직전에 들어가야할 숫자이므로 따로 조건문을 이용하여 "="기호 붙이기
                answer += s[i] + "=" + sum;
            } else { //i가 0이 아닌 경우 배열의 각 요소의 값을 answer에 더하고 "+"기호를 붙이기
                answer += s[i] + "+";
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Main method = new Main();
        System.out.println(method.solution(718253));
    }
}
//어떤 자연수를 뒤집어도 길이자체는 변하지 않으니
//자연수n을 길이로한 배열을 만들자