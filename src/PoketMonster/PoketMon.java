package PoketMonster;

public class PoketMon {
    private String name; // 포켓몬 이름
    private String type;


    public String getName() {
        return name;
    }



    public String getType() {
        return type;
    }


    public PoketMon(String name, String type) {
        this.name = name;
        this.type = type;

    }
//
//    @Override
//    public String toString() {
//        return "" + "이름 : " + name + ", 타입 : " + type;
//    }
}