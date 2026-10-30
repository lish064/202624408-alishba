//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int num1;
    int num2;
    int num3;
    String status;
    String result;

    System.out.print("첫 번째 정수 입력: ");
    num1 = keyboard.nextInt();
    System.out.print("두 번째 정수 입력: ");
    num2 = keyboard.nextInt();
    System.out.print("세 번째 정수 입력: ");
    num3 = keyboard.nextInt();

    status = (num1 > 0 && num2 > 0 && num3 > 0) ? "모두 양수" :
             (num1 < 0 || num2 < 0 || num3 < 0) ? "음수 포함" :
             !(num1 != 0 || num2 != 0 || num3 != 0) ? "모두 0" : "양수/0 혼합";

    result = String.format("\n입력값 : %d, %d, %d\n결과 : %s", num1, num2, num3, status);
    System.out.println(result);

}
