package ch02_control_statement;

public class TotalExam01 {
    static void main(String[] args) {

        String name = "김철수";
        int kor = 85, eng = 70, math = 90;
        String grade;
        String message;
        double average;
        int sum;

        average = (kor + eng + math) / 3.0;

        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        switch(grade){
            case "A" : case "B" :
                message = " 참 잘 하셨습니다. " ;
                break;

            case "C" : case "D" :
                message = " 조금만 더 노력하세요. " ;
                break;

            case "F" :
                message = " 다음 학기에 재수강하세요. " ;
                break;

                default:
                message =  "잘못된 입력입니다.";
        }

        sum = kor + eng + math;

        System.out.printf("이름: %S님 ", name);
        System.out.println();
        System.out.printf("국어: %d, 영어 :%d, 수학: %d \n", kor, eng, math);
        System.out.printf("총점 : %d ", sum);
        System.out.printf("평균 : %.5f", average);
        System.out.println();
        System.out.printf("학점: %s", grade);
        System.out.println();
        System.out.printf("메세지: %s ",message);
    }
}
