//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    String school;
    String name;
    int age;
    char gender;
    double height;
    float weight;

    System.out.print("학교를 입력하세요: ");
    school = keyboard.nextLine();
    System.out.print("이름을 입력하세요: ");
    name = keyboard.nextLine();
    System.out.print("나이를 입력하세요: ");
    age = keyboard.nextInt();
    System.out.print("성별을 입력하세요(남/여): ");
    gender = keyboard.next().charAt(0);
    System.out.print("신장을 입력하세요(cm): ");
    height = keyboard.nextDouble();
    System.out.print("체중을 입력하세요(kg): ");
    weight = keyboard.nextFloat();

    System.out.print("\n*********************\n");
    System.out.printf("학교 : %s\n", school);
    System.out.printf("이름 : %s\n", name);
    System.out.printf("나이 : %d\n", age);
    System.out.printf("성별 : %c\n", gender);
    System.out.printf("신장 : %.1f Cm\n", height);
    System.out.printf("체중 : %.1f Kg\n", weight);
    System.out.print("*********************\n");

}
