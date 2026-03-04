package ch02_control_statement;

public class If03 {
    static void main() {
        int jumsu = 60;


        // 학점 매기기(다중 택일)
        if (jumsu >=90) {
            System.out.println("A학점");
        } else if(jumsu >= 80 && jumsu <=90) {
            System.out.println("B학점");
        }else if(jumsu>=70) {
            System.out.println("C학점");
        } else if (jumsu>=60) {
            System.out.println("D학점");
        }else{
            System.out.println("F학점");
        }
      }
    }