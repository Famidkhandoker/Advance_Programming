import java.io.*;
import java.util.*;

public class Main {

        // method to check year (throws exception)
        public static void checkYear(int year) throws InvalidYearException {
            if (year < 1800) {
                throw new InvalidYearException("Invalid Year: " + year);
            }
        }

        public static void main(String[] args) {

            try {
                File file = new File("record.txt");
                Scanner sc = new Scanner(file);

                ArrayList<Cars> list = new ArrayList<>();

                // 🔹 Read file
                while (sc.hasNext()) {

                    String no = sc.next();
                    String model = sc.next();
                    double price = sc.nextDouble();
                    int year = sc.nextInt();

                    try {
                        checkYear(year); // throw if invalid

                        if (no.length() == 4) {
                            list.add(new Cars(no, model, price, year));
                        }

                    } catch (InvalidYearException e) {
                        System.out.println(e.getMessage());
                    }
                }
                sc.close();

                // 🔹 Rewrite file (delete invalid NO)
                PrintWriter pw = new PrintWriter(file);

                for (int i = 0; i < list.size(); i++) {
                    pw.println(list.get(i));
                }
                pw.close();

                // 🔹 Display condition অনুযায়ী
                System.out.println("Filtered Cars:");

                for (int i = 0; i < list.size(); i++) {
                    Cars c = list.get(i);
                    String m = c.getModel();

                    if (m.startsWith("C") || m.endsWith("a")) {
                        System.out.println(c);
                    }
                }

            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }
    //output