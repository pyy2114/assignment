package java1.ex06;

//while문을 이용하여 1부터 100까지의 수 중 3의 배수이면서 4의 배수인 수를 출력하는 프로그램을 작성하세요.
public class hw_4 {
    public static void main(String[] args) {
        int num = 1;

        System.out.println("1부터 100까지의 3의 배수이면서 4의 배수인 수:");

        while (num <= 100) {
            if (num % 3 == 0 && num % 4 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}
