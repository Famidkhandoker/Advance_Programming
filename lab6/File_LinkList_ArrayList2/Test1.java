import java.io.*;
import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        // ফাইল থেকে ডেটা পড়া এবং নতুন ফাইলে ট্যাক্সসহ সেভ করা
        try {
            File inputFile = new File("record.txt");
            Scanner reader = new Scanner(inputFile);

            // নতুন একটি লিস্টে ডেটা রাখার জন্য
            List<String> updatedLines = new ArrayList<>();

            // হেডার লাইন হ্যান্ডলিং (NO Model Price)
            if (reader.hasNextLine()) {
                updatedLines.add(reader.nextLine() + " Taxes");
            }

            while (reader.hasNext()) {
                String no = reader.next();
                String model = reader.next();
                double price = reader.nextDouble();

                // কাস্টম এক্সেপশন চেক (৩ থেকে ৫ অক্ষরের বাইরে হলে)
                if (no.length() < 3 || no.length() > 5) {
                    throw new CarNoException("Invalid Car No: " + no);
                }

                Cars car = new Cars(no, model, price);
                double taxAmount = car.taxes();

                // নতুন কলামের ডেটা তৈরি
                updatedLines.add(no + " " + model + " " + price + " " + taxAmount);
            }
            reader.close();

            // record.txt ফাইলে ট্যাক্স কলামসহ আবার রাইট করা
            PrintWriter writer = new PrintWriter(new FileWriter("record.txt"));
            for (String line : updatedLines) {
                writer.println(line);
            }
            writer.close();
            System.out.println("Taxes added to record.txt successfully.\n");

            // ২য় কাজ: ফাইল আবার পড়ে যাদের মডেল নামে ১টির বেশি শব্দ আছে তাদের NO দেখানো
            System.out.println("Cars with model name more than 1 word (contains underscore):");
            Scanner reReader = new Scanner(new File("record.txt"));
            reReader.nextLine(); // Skip header

            while (reReader.hasNext()) {
                String no = reReader.next();
                String model = reReader.next();
                double price = reReader.nextDouble();
                double tax = reReader.nextDouble();

                // এখানে Chevrolet_Impala বা Rolls_Royce এ আন্ডারস্কোর (_) আছে মানে ২টা শব্দ
                if (model.contains("_")) {
                    System.out.println("Car NO: " + no);
                }
            }
            reReader.close();

        } catch (CarNoException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}

//output
//Cars with model name more than 1 word (contains underscore):
//Car NO: 9A02
//Car NO: p406
//Car NO: y667