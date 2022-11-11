import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Time time = new Time(1, 2, 3);
        System.out.println(time);
        method();


    }
public static String method(){
    Time time = new Time(1, 2, 3);
    Scanner scanner = new Scanner(System.in);
    int i = 0;
    while (i < 10) {
        char a = scanner.next().charAt(0);
        switch (a) {
            case '+' -> System.out.println(time.nextSecond());
            case '-' -> System.out.println(time.previosSecond());
            default -> System.out.println("err");
        }
        i++;
    }
    return time.nextSecond()+"\n"+ time.previosSecond();
}

}
