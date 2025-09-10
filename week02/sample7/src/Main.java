import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String name ="";
        int age = 0;
        String address = "";

        System.out.print("당신의 이름은 ? ");
        name = keyboard.nextLine();
        System.out.printf("%s님의 나이는 ? ");
        age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.printf("%s님의 주소는 ? ");
        address = keyboard.nextLine();

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);

















    }
}