//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int totalSeconds = 54321;
    int hours;
    int remainingSeconds;
    int minutes;
    int seconds;
    String result;

    hours = totalSeconds / 3600;
    remainingSeconds = totalSeconds % 3600;
    minutes = remainingSeconds / 60;
    seconds = remainingSeconds % 60;

    result = String.format("\n%d 초 = %d 시간 %d 분 %d 초", totalSeconds, hours, minutes, seconds);
    System.out.println(result);

}
