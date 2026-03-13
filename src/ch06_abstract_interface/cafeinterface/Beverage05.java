package ch06_abstract_interface.cafeinterface;

//추상 메소드를 포함하는 클래스는 반드시 추상 클래스이어야 함
abstract public class Beverage05 {

   // 카페 이름은 객체 생성하지 않아도 접근이 가능하도록 하는 것이 좋겠습니다.
   // final이 붙어 있으면 편집  불가능한 상수(constant)입니다/
    public static final String STORE_NAME = "G-Cafe";

    public static int beverageCount = 0; // 주문한 커피 잔수

    public static int getBeverageCount(){
        return beverageCount;
    }
    private String name;
    private double price;

    public String getName(){
        return name;
    }


    // 모든 음료는 마십니다.
    // 추상 메소드는 바디({...})를 가질 수 없음, 할 동작X
    public abstract void drink(); //
    @Override
    public String toString() {
        return "Beverage05{" + "name='" + name + '\'' + ", price=" + price + '}';
    }

    public Beverage05() {
    }

    public Beverage05(String name, double price) {
        this.name = name;
        this.price = price;
    beverageCount++; // 커피 잔수 +1

    }
}

