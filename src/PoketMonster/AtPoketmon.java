package PoketMonster;

public class AtPoketmon extends PoketMon {
    private double ap;
   private String skill1;
  private String skill2;
//    private String[] skills  ;
//    private int[] skilldemage;

//    public String[] getSkills(){
//       return skills;
//    }

//    public int[] getSkilldemage() {
//        return skilldemage;
//    }

    public AtPoketmon(){
        super("null","null");
    }
    //    @Override
//    public String toString() {
//        return super.toString() + "스킬1 : "+skill1 + "스킬2 : " + skill2;
//    }
    public double getAp1() {return ap;}
    public double getAp2() {return ap*2;}



    public AtPoketmon(String name, String type,double ap,String skill1,String skill2){
        super(name, type);
        this.ap = ap;
        this.skill1 = skill1;
        this.skill2 = skill2;
    }
//    public void display(){
//            for(int i =0; i < skills[i].length() ; i++);
//        System.out.println(skills + " 스킬의 데미지 : " + skilldemage);
//
//    }
}

