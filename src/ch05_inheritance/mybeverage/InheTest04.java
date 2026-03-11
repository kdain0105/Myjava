package ch05_inheritance.mybeverage;

public class InheTest04 {
    static void main(String[] args) {
        // 승급(업캐스팅) : 낮은 등급의 클래스가 높은 등급의 클래스 타입으로 한시적 형태가 바뀌는 동작
        // 전제조건 : 두 클래스가 반드시 상속관계여야함
        Beverage04 beverage01 = new Americano04("아메리카노", 4000.0, 2);  // 암시적 형변환
        beverage01.showInfo(); // 수퍼클래스 내 들어 있는 메소드는 상속의 개념에 의하여 접근이 가능함
        Americano04 coffee = (Americano04) beverage01; // 명시적 형변환, int i = int(12.5) // 명시적 형변환
        coffee.sipAmericano();
        System.out.println();

        Beverage04 beverage02 = new Espresso04("에스프레소", 5000.0, 2);
        beverage02.showInfo();
        Espresso04 coffee2 = (Espresso04) beverage02;
        coffee2.drinkEspresso();
        System.out.println();

        Beverage04 beverage03 = new Latte04("라떼", 10000, "아몬드우유");
        beverage03.showInfo();
        Latte04 coffee3 = (Latte04) beverage03;
        coffee3.enjoyLatte();


        //승급 개념과 배열 사옹
        Beverage04[] beverage = {
                beverage01,
                new Espresso04("루왁", 9000.0, 2),
                new Latte04("배눼눼뤠떼", 7000, "붸눼눼우유")
        };
        for (int i = 0; i < beverage.length; i++) {
            System.out.println("--------------------------------------");
            beverage[i].showInfo();

            // instanceof : 승급된 객체 변수가 수많은 서브 클래스 중에서 어떤 클래스로 생성이 되었는 지를 판단하고자 할 때 사용
            if (beverage[i] instanceof Americano04) {// 아아 , i번째 객체 beverage를 아아 클래스로 만들었는 지 물음
                Americano04 ameri = (Americano04) beverage[i]; // 강등
                ameri.sipAmericano();

            } else if (beverage[i] instanceof Espresso04) { // 에스프레소
                Espresso04 espr = (Espresso04) beverage[i]; // 다운 캐스팅 , 에스프레소만의 drinkEspresso 메소드를 호출하기 위해
                espr.drinkEspresso();

            } else if (beverage[i] instanceof Latte04) { // 아바라
                Latte04 late = (Latte04) beverage[i];
                late.enjoyLatte();

            } else { // 차후에 ..
            }
            // 객체를 프린트하면 암시적으로 toString() 메소드가 호출됨
            System.out.println(beverage[i]);
        }
    }
}