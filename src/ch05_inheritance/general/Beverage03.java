package ch05_inheritance.general;
 /*
  서브 클래스가 수퍼 클래스의 변수에 접근
  1. private는 getter/setter로 접근
  2. private 대신 protected로 접근(pubilc : 동일 패키지 내에서 접근 가능)
  3. 생성자를 통한 대입
 */
public class Beverage03 {
     private String name; // 음료이름
     private double price; // 단가

     //public  Beverage03(){} // 생성자 값 초기화

     public Beverage03(String name, double price) { // 생성자 만들기
         this.name = name;
         this.price = price;
     }

     protected void showInfo() {
         System.out.println("음료 이름 : " + name);
         System.out.println("단가 : " + price + "원");
     }

 }


