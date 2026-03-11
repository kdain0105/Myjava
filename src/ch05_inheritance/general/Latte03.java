package ch05_inheritance.general;

public class Latte03 extends Beverage03 {
    private String milkType ; // 우유타입

    public Latte03(String name,double price, String milkType){
        super(name, price);
        this.milkType = milkType;
    }
    public void printInfo(){
        super.showInfo();
        System.out.println("우유의 종류는 " + milkType + "입니다.");
    }

    }



