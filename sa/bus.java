package sa;

public class bus extends publicTransport{

    public bus(int busNum){
        super.startOperation("운행");
        super.num = busNum;
        super.maxPassenger = 30;
        super.price = 1000;
        super.currentPassenger = 26;
        System.out.println(busNum + "번 버스가 생성되었습니다");
    }
}
