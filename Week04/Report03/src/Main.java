//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    double earthWeight;
    double moonWeight;

    System.out.print("지구에서의 몸무게(kg)를 입력하세요: ");
    earthWeight = keyboard.nextDouble();

    moonWeight = earthWeight * 0.165;

    System.out.printf("\n지구에서의 몸무게: %.1f Kg\n", earthWeight);
    System.out.printf("달에서의 몸무게: %.1f kg\n", moonWeight);

}
