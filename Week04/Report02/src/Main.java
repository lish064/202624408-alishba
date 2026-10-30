//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int 가로;
    int 높이;
    int 세로;
    int 부피;

    System.out.print("직육면체 가로 세로 높이 입력 : ");
    가로 = keyboard.nextInt();
    세로 = keyboard.nextInt();
    높이 = keyboard.nextInt();

    부피 = 가로 * 세로 * 높이;

    System.out.printf("\n직육면체 가로 = %d Cm\n", 가로);
    System.out.printf("직육면체 세로 = %d Cm\n", 세로);
    System.out.printf("직육면체 높이 = %d Cm\n", 높이);
    System.out.printf("직육면체 부피 = %d Cm\u00B3", 부피);

}
