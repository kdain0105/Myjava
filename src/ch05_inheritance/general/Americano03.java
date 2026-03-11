package ch05_inheritance.general;

public class Americano03 extends Beverage03 {
    private double waterAmount; // 투입하는 물의 양

    public Americano03(String name, double price, double waterAmount){// InTest에 Americano의 매개변수를 받아 위에 waterAmount로 넣어줌
        // 서브 클래스의 생성자의 첫줄에는 super(); 라는 단어가 숨어있다 super():매개변수가 0개인 super 클래스의 생성자 , 서브 클래스에만 있음
        // 사용자가 super(매개변수); 형식으로 다시 작성하면, super();는 사라짐
        super(name,price);
        this.waterAmount = waterAmount; // 메인에서 전달받은 매개변수 값을 대입
    }
    public  void printInfo(){
        super.showInfo();
        System.out.println("투입된 물의 양 : " + waterAmount + "ml");
    }
}




