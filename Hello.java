public class Hello {

    public static void main(String[] args) {

        /*
        원래 코드
        int var1 = 5;
        int var2 = 2;
        double var3 = var1 / var2;
        var1 / var2는 정수 연산이므로 결과는 정수 2
        그래서 변수 var3에는 2.0이 저장
        int var4 = (int) (var3 * var2);
        int var4 = (int) (2.0 * 2)이므로 결과는 4
        System.out.println(var4);
        */

        int var1=5;
        int var2=2;
        double var3= (double)var1/var2;
        int var4=(int)(var3*var2);
        System.out.println(var4);



        int x=10;
        int y=20;
        int z = (++x) + (y--);
        System.out.println(z);

        /*
        출력값 : 31
        ++x의 경우 전위증가 연산자 이므로 x의 값을 1증가 시킨후 연산을 진행하므로 ++x의 값은 11이되고,
        y--의 경우 후위감소 연산자 이므로 먼저 연산을 진행 후 y의 값을 1감소시키므로 y의 값은 20이 된다
         */

        while (true){
            int num1 = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random() * 6) + 1;
            System.out.println("(" + num1 + ", " + num2 + ")");
            if ((num1 + num2) == 5){
                break;
            }
        }

        /*
        while(true) 무한반복문 생성
        Math.random() 메서드는 double형으로 0 에서 0.9999~~ 사이의 값을 반환함
        Math.random() * 6 = 0 ~ 5.999999~~
        (Math.random() * 6) + 1 = 1 ~ 6.999999999~~
        (int) (Math.random() * 6) + 1 = 1 ~ 6 int형으로 변환 => 정수화
        if문에 두 수의 합이 5이면 반복을 멈추는 조건을 준뒤 break로 반복문 탈출
         */
    }
}
