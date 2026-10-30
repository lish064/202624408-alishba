//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int 판매금액;
    int 금액;
    int 세금;

    System.out.print("판매금액을 입력하세요: ");
    판매금액 = keyboard.nextInt();

    금액 = (int) (판매금액 / 1.1);
    세금 = 판매금액 - 금액;

    System.out.printf("\n판매금액 : %,d원\n", 판매금액);
    System.out.printf("\n금액 : %,d원\n", 금액);
    System.out.printf("세금 : %,d원\n", 세금);

}
