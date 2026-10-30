//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

void main() {
    Scanner keyboard = new Scanner(System.in);
    double celsius;
    double fahrenheit;

    System.out.print("섭씨(°C)로 온도를 입력하세요. ");
    celsius = keyboard.nextDouble();

    fahrenheit = celsius * 9.0 / 5.0 + 32;

    System.out.println("화씨 온도 (℉) : " + fahrenheit);

}
