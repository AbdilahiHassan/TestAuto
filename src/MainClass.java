
import java.io.IOException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        while(running){
            System.out.println("Enter your choice: \n1. for English -> Morse Code \n2. for Morse Code -> English\n3. Exit");
            String choice = scan.nextLine();

            LogicClass inlamning = new LogicClass();

            if(choice.equals("1")){
                //om användaren väljer att gå ifrån eng -> morse
                System.out.println("Enter English");
                String input = scan.nextLine();
                String result = inlamning.EngSolve(input);
                System.out.println(result);
            }
            else if(choice.equals("2")){
                //om användaren väljer att gå ifrån morse -> eng
                System.out.println("Enter Morse");
                String input = scan.nextLine();
                String result = inlamning.morseSolve(input);
                System.out.println(result);
            }
            else if(choice.equals("3")) {
                running = false;
            }

        }
    }

}









