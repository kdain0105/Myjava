package ch05_inheritance.mybeverage;

public class Beverage04 {
    private String name; // 음료이름
    private double price; // 단가

    @Override // object에 있는 toString 메소드 오버라이딩
    public String toString() {
        String imsi = "상품명 : " + name + ", 단가 :" + price;
       // return super.toString() + "\n" + imsi;
        return  imsi;


    }

    public String getName() {
        return name;
    }

    public  Beverage04(){} // 생성자 값 초기화

    public Beverage04(String name, double price) { // 생성자 만들기
            this.name = name;
            this.price = price;
    }
    protected void showInfo() {
            System.out.println("음료 이름 : " + name);
            System.out.println("단가 : " + price + "원");
    }

}




