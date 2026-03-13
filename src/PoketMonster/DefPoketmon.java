package PoketMonster;

public class DefPoketmon extends PoketMon{

    private double hp; // 포켓몬 체력
    private  int defense; // 방어력
    boolean isFaint = true ; // 생존 여부

    public DefPoketmon(){
        super("null","null");
    }

    public double getHp() {return hp;}
    public int getDefense() {return defense;}
    public boolean isAlive() {return isFaint;}

    public DefPoketmon(String name, String type, double hp , int defense){
        super(name,type);
        this.hp = hp;
        this.defense = defense;

    }
    public void defense(){
        String message = super.getName() + "이(가) 방어합니다.";
        System.out.println(message);

    }
}

