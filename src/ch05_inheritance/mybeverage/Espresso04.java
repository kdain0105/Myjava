package ch05_inheritance.mybeverage;

public class Espresso04 extends Beverage04 {
    private int shotCount ; // 샷추가 갯수

    @Override
    public String toString() {
        String imsi = ", 샷의 개수 : " + shotCount + "샷";
        return super.toString() + imsi;
    }

    public Espresso04(String name, double price, int shotCount){
        super(name,price);
        this.shotCount = shotCount;
    }
    public void drinkEspresso(){
        String message = "투입한 샷의 개수는" +shotCount + "개입니다.";
        System.out.println(message);
    }
}


