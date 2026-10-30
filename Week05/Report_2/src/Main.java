//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int score;
    String grade;
    String result;

    System.out.print("당신의 JAVA 점수 입력 : ");
    score = keyboard.nextInt();

    char letter = (score >= 90) ? (char) ('A') :            //  A = 65
                  (score >= 80) ? (char)('A' + 1) :         //  65 + 1 = 66
                  (score >= 70) ? (char)('A' + 2) :         //  65 + 2 = 67
                  (score >= 60) ? (char)('A' + 3) : 'F';    //  65 + 3 = 68

    char suffix = (score % 10 >= 5 || score == 100) ? '+' : '0';
    grade = (letter == 'F') ? "F" : String.format("%c%c", letter, suffix);
    result = String.format("\n입력 점수: %d\n학점 : %s", score, grade);

    System.out.println(result);
}
