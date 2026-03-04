package ch02_control_statement;

public class If01 {
    static void main() {
        // su가 짝수이면 출력해 주세요.
        int su = 4;

        if (su % 2 == 0){ // 단순 if 구문
            System.out.println(su + "는 짝수입니다.");
        }

        System.out.println("나는 무조건 실행 됩니다.");
    }
}