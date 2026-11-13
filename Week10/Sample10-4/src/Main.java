//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    String source;         // 배열
    char[] convert;         // 배열 선언

    System.out.print("영어 문장 입력 : ");
    source = keyboard.nextLine();

    convert = new char[source.length()];   // 배열 정의
    for (int i = 0; i < source.length(); i++) {
        if (source.charAt(i) >= 'A' && source.charAt(i) <= 'Z')  // 대문자
            convert[i] = (char) (source.charAt(i) + 32);
        else if (source.charAt(i) >= 'a' && source.charAt(i) <= 'z')
            convert[i] = (char) (source.charAt(i) - 32);
        else
            convert[i] = source.charAt(i);
    }

    System.out.println("원문 : " + source);
    System.out.println("변화 : " + new String(convert));
}
