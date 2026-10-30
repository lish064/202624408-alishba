//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int value1;
    int value2;
    int result;

    System.out.print("첫번째 숫자를 입력하세요 ");
    value1 = keyboard.nextInt();
    System.out.print("두번째 숫자를 입력하세요 ");
    value2 = keyboard.nextInt();

    result = value1 + value2;

    System.out.printf("%d + %d = %d\n", value1, value2, result);

}
