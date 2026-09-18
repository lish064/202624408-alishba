//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    String 이름;
    int 가족;
    String 위치;

    System.out.print("당신의 이름은 ? ");
    이름 = keyboard.next();
    System.out.printf("%s님의 가족은 몇 명입니까 ? ", 이름);
    가족 = keyboard.nextInt();
    System.out.printf("%s님의 가족은 어디에서 살지요 ? ", 이름);
    위치 = keyboard.next();

    System.out.printf("\n%s님의 가족은 %d명 입니다.\n", 이름, 가족);
    System.out.printf("%s님의 가족은 %s에서 살고 있습니다.\n", 이름, 위치);

}
