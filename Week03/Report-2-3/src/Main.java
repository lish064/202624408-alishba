//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String school = "경복대학교";
    String name = "홍 길동";
    int age = 20;
    char gender = '남';         //  char 타입은 작은따옴표(' ') 사용
    double height = 170.6;
    float weight = 65.4f;      //   float 타입은 숫자 뒤에 'f' 접미사 필수

    System.out.print("\n*********************\n");
    System.out.printf("학교 : %s\n", school);
    System.out.printf("이름 : %s\n", name);
    System.out.printf("나이 : %d\n", age);
    System.out.printf("성별 : %c\n", gender);      // char 출력 서식 지정자 %c 사용
    System.out.printf("신장 : %.1f Cm\n", height);
    System.out.printf("체중 : %.1f Kg\n", weight);
    System.out.print("*********************\n");
}
