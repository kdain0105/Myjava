package PoketMonster;

import java.util.Scanner;

public class PoketMonmain {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("포켓몬을 선택하세요 .  1: 피카츄, 2: 꼬부기, 3: 파이리");
        System.out.print(">>");
        int atpoketmon = scan.nextInt();

        AtPoketmon attacker = new AtPoketmon(); //AtPoketmon attacker; // attacker = new AtPoketmon(...)
        DefPoketmon defender =  new DefPoketmon(); // DfPonketmon.defender;
        int attackcount=1;

        switch (atpoketmon){

            case 1 :
                attacker = new AtPoketmon( "피카츄","전기타입",30,"백만볼트","전기쇼크" );
               break;
            case 2 :
                attacker = new AtPoketmon("꼬부기","물타입",40,"물대포","로켓박치기");
                break;
            case 3 :
                attacker =  new AtPoketmon("파이리","불타입",20,"불꽃세례","화염발사");
                break;
            default:
                System.out.println("잘못 선택하셨습니다.");
                return;
        }
        System.out.println(attacker.getName()+ "을(를) 선택하셨습니다.");
        System.out.print("타입 : " + attacker.getType() + ", 공격력 : " + attacker.getAp1() + ", 스킬1 : " + attacker.getAp1() );
        System.out.println();
        System.out.println();

        System.out.println("공격할 상대 포켓몬을 선택하세요. 1 : 잠만보, 2 : 메타몽, 3 : 마자용");
        System.out.print(">>");
        int dfpoketmon = scan.nextInt();


        switch (dfpoketmon){

            case 1 :
                defender = new DefPoketmon("잠만보","노말타입",150,10 );
                break;
            case 2 :
                defender = new DefPoketmon("메타몽","노말타입",120,9);
                break;
            case 3 :
                defender =  new DefPoketmon("마자용", "에스퍼",80,8);
                break;
            default:
                System.out.println("잘못 선택하셨습니다.");
                return;
        }
        System.out.println(defender.getName()+ "을(를) 선택하셨습니다.");
        System.out.print("타입 : " + defender.getType() + ", 체력 : " + defender.getHp() + ", 방어력 : " + defender.getDefense());
        System.out.println();

        System.out.println("포켓몬 "+attacker.getName() + "의 스킬을 선택해주세요");
        System.out.print(">>");
        int choiceskill = scan.nextInt();




        double demage = (attacker.getAp1()) - (defender.getDefense());
        double remainhp = defender.getHp();

        while(remainhp > 0) {
            remainhp -= demage;
            if(remainhp>0){
                System.out.println();
                System.out.println(attacker.getName() + "의 " + attackcount + "번째 공격 !!!!!!");
                System.out.println(attacker.getName() + "이(가) 공격하여 " + demage + "를 입혔습니다.");
                System.out.println("남은 체력 : " + remainhp);
                System.out.println();
                attackcount++;
            } else {
                System.out.println(attacker.getName() + "이(가) 공격하여 " + demage + "를 입혔습니다.");
                System.out.println(defender.getName() + "이(가) 기절하였습니다");
            }
        }
    }
}
