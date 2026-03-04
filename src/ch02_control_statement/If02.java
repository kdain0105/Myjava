package ch02_control_statement;

public class If02 {
    static void main() {
        // 짝수이면 '하하하'를 홀수이면 '호호호'를 출력해주세요.
        int su = 4;

        // 양자 택일 구문
        if(su%2==0){//짝수이면
            System.out.println("하하하");
            System.out.println(su + "는 짝수");
        }
        else{//짝수가 아니면
            System.out.println("호호호");
            System.out.println(su +"는 홀수");
        }
    }
}
