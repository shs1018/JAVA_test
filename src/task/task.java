package task;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {

        Management management = new Management();
        Scanner scanner = new Scanner(System.in);
        int trigger;

        while (true) {
            management.randomPositionGenerator();
            management.printLake();
            management.showAllDuckInfo();


            System.out.println();
            System.out.print("press any key to continue!(press 0 to exit)");
            trigger = scanner.nextInt();
            if (trigger == 0) {
                break;
            }
        }//while문 끝
    }//main의 끝
}