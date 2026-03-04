package ch02_control_statement;

public class Switch03 {
    static void main(String[] args) {
     String name = "김철수";
     String grade = "B"; // 고객등급(ABC 중 하나)
     String present = "" ; // 등급에 따른 선물

        switch (grade) {

                case "A" :
                present += " 강남 빌딩" ;

                case "B" :
                present += " 고급 자동차 " ;

                case "C" :
                present += " 노트북 ";


        }



       String message = "%s님의 경품은 %s입니다.";
       System.out.printf(message,name, present);

       double average = 74.6666666666666666666666;
       message = "평균 : %.3f ";
        System.out.printf(message, average);



    }
}
