//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int price;
    boolean isMember;
    String message;

    System.out.print("구매 금액 입력: ");
    price = keyboard.nextInt();
    System.out.print("멤버십 회원 여부 (true/false): ");
    isMember = keyboard.nextBoolean();

    message = (price < 0) ? "오류: 구매 금액은 음수일 수 없습니다." :
              (price >= 50000 || (isMember && price >= 30000)) ? "무료배송 가능" : "배송비 발생";
    String result = String.format("\n[입력 데이터]\n구매 금액: %d원 | 멤버십: %b\n결과: %s", price, isMember, message);

    System.out.println(result);
}
