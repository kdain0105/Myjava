package ch01_variable_operator;

public class Casting {
    static void main() {

        double d = 100;
        System.out.println("d : " + d);


        int i = (int)3.14 ; // 명시적 형변환 (형변환연산자)3.14
        System.out.println("i :" + i);

        //(double)14/5 => 명시적 14.0/5 => 암시적 14.0/5.0 => 2.8
        System.out.println((double)14/5);// (정수)/(정수) = (정수)

        // (double)(14/5) => (double)2 => 2.0
        System.out.println((double)(14/5));// (정수)/(정수) = (정수)

        int kor = 50, eng = 60, math = 80 ;
        int total = kor + eng + math;
        System.out.println("총점 : " + total);

        double average = (double)total/3 ;
        System.out.println("평균 : " + average);

        // 아스키 코드 : A(65) a(97) 0(48)
        char ch1 ='c';
        char ch2 ='a';
        boolean bool1 = ch1 > ch2 ; // 각각 99와 97으로 암시적 형변환
        System.out.println("bool1 : " + bool1 );

        int result = ch1 - ch2 + 5 ;
        System.out.println("result : " + result);

        char ch3 = 'D';
        String str = ch3>='A' && ch3<='Z' ? "대문자" : "대문자아님";
        System.out.println("str : " + str);

    }
}

