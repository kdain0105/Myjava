package ch02_control_statement;

public class If06 {
    static void main() {
        int month = 3;
        if (month>=3 && month<=5) {
            System.out.println("봄입니다.");
        }
        else if (month>=6 && month<=8){
            System.out.println("여름입니다.");
        }
        else if (month>=9 && month<=11){
            System.out.println("가을입니다.");
        }
        else if (month==12 || (month>=1 && month<=2)){ // month==12||month==2||month==1
            System.out.println("겨울입니다.");
        }
        else{
            System.out.println("1~12를 입력해주세요.");
     }}
}
