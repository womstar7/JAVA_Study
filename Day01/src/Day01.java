/*
 * 소스 파일 : Hello.java
 */
public class Day01 {

    public static int sum(int n, int m) {
        return n + m;
    }

    public static void main(String[] args) {
        int i = 20;
        int s;
        char a;

        s = sum(i, 10);             //메소드 호출
        a = '?';
        System.out.println(a);
        System.out.println("Hello");
        System.out.println(s);
    }
}