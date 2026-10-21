//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    final float DON = 3.75f;       // 1돈의 무게
    final int GOLD = 775000;       // 금 1돈의 가격
    float weight;

    System.out.print("당신의 몸무게는 ? ");
    weight = keyboard.nextFloat();            //45.6

    int weight1 = (int) weight;               //45
    float remainder = weight - weight1;       // .6

    int gram = (int) (weight1 * 1000 + remainder * 1000);

    int gram1 = (int) (weight * 1000);

    System.out.printf("%.1f Kg = %,d (%,d) gram\n", weight, gram, gram1);

}
