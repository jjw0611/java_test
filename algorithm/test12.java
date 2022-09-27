package algorithm;

public class test12 {
    public long main(int price, int money, int count){
        //price:이용료 money: 처음 가지고있던 금액 count: 이용횟수
        long totalPrice = 0; //총 이용금액

        for(int i = 1; i <= count; i++){
            totalPrice += price * i;
        }
        //totalPrice에 이용료의 i(count)를 곱한값을 누적해서 더해준다
        //count번 타게되면 총 이용금액이 처음이용료 * count번을 모두 더한값이 된다

        return (money - totalPrice) >= 0 ? 0 : (money - totalPrice) * -1;
    }
}   //삼항연산자 이용!
    //현재 가지고있는 금액에서 얼마가 모자라는지를 return해야하니
    //현재 가지고있는 금액에서 총 이용금액을 빼주고
    //그값이 0보다 크거나 같다면(금액이 부족하지 않다면) 0을 return하고
    //부족하다면 부족한금액을 return한다(양수로 return되어야 하니 -1를 곱해준다)
