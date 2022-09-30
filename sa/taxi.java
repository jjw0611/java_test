package sa;

public class taxi extends publicTransport{

    //필드
    String destination; //목적지
    int distanceDestination; //목적지까지 거리
    int distanceDefault = 1; //기본 거리
    int defaultPrice = 3000; //기본 요금
    int distancePrice = 1000; //거리당 요금

    //생성자
    public taxi(int taxiNum){
        super.startOperation("일반");
        super.num = taxiNum;
        super.currentPassenger = 0;
        super.maxPassenger = 4;
        System.out.println(taxiNum + "번 택시가 생성되었습니다");
    }

    @Override
    public void boardingPassenger(int newPassenger, String destination, int distanceDestination) {
        //기본 거리보다 먼 곳은 추가 요금
        if(distanceDestination > 1){
            distanceMoneyPlus(distanceDestination);
        }

    }

    //거리당 요금 추가
    public void distanceMoneyPlus(int distanceDestination){
        price = 3000 + (distanceDestination - 1) * 1000;
        System.out.println("지불할 금액 = " + price);
        System.out.println("상태 = " + state);
    }

    //요금 결제
    public void pay(){
        System.out.println("현재 금액은 " + getPrice() + "원 입니다");
        this.currentPassenger = 0;
    }

    //주유량이 10미만일시 운행불가
    @Override
    public void changeState() {
        if(fuel < 10){
            this.state = "운행불가";
        }
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDistanceDestination() {
        return distanceDestination;
    }

    public void setDistanceDestination(int distanceDestination) {
        this.distanceDestination = distanceDestination;
    }

    public int getDistanceDefault() {
        return distanceDefault;
    }

    public void setDistanceDefault(int distanceDefault) {
        this.distanceDefault = distanceDefault;
    }

    public int getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(int defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public int getDistancePrice() {
        return distancePrice;
    }

    public void setDistancePrice(int distancePrice) {
        this.distancePrice = distancePrice;
    }
}
