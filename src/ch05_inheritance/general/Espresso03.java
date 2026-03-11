package ch05_inheritance.general;

public class Espresso03 extends Beverage03 {
    private int shotCount ; // 샷추가 갯수

    public Espresso03(String name,double price,int shotCount){
        super(name,price);
        this.shotCount = shotCount;
    }
    public void printInfo(){
        showInfo();
        System.out.println("추가된 샷은 " + shotCount + "샷 입니다.");
    }

}
