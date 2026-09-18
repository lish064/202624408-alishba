//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    String 이름 = "alishba";
    int 나이;
    float 체중;
    double 신장;

    System.out.println("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하세요");
    나이 = keyboard.nextInt();
    체중 = keyboard.nextFloat();
    신장 = keyboard.nextDouble();

    System.out.printf("\n%s의 나이는 %d살 입니다.\n", 이름, 나이);
    System.out.printf("%s의 체중은 %.1fkg 입니다.\n", 이름, 체중);
    System.out.printf("%s의 신장은 %.1fcm 입니다.\n", 이름, 신장);


}
