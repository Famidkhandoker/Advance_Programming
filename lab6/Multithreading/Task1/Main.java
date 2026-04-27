import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String inputName = sc.nextLine();

            People p = new People(inputName);
            VowelThread t = new VowelThread(p);

            t.start();
        }
    }

//output

//Enter your name: Famid
//Thread Name: Thread-0
//Priority: 5
//Total vowels: 2
//Vowels are:
//a
//i
