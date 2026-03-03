package ch01_variable_operator;

public class CondOper {
    static void main() {

        int x =3, y = 8, z = 4;
        int max = x > y ? x : y;
        max = max > z ? max : z;

        System.out.println("출력 결과 : 3, 8, 4 중 최대 수는" + max + "입니다.");
    }
}
