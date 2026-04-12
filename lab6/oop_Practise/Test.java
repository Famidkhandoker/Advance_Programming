public class Test {
    public static void main(String[] args) {

        Authors[] authorsArray = new Authors[5];


        authorsArray[0] = new Authors("Dr. Rahim", 45, new Address("12A", 5, "Dhanmondi"), "AI in Ethics", 3);
        authorsArray[1] = new Authors("Mr. Karim", 30, new Address("7/B", 10, "Mirpur"), "Cloud Computing", 1);
        authorsArray[2] = new Authors("Sarah Hasan", 38, new Address("45", 2, "Gulshan"), "Cyber Security", 5);
        authorsArray[3] = new Authors("Tanvir Ahmed", 29, new Address("102", 15, "Uttara"), "Big Data", 1);
        authorsArray[4] = new Authors("Dr. Anis", 50, new Address("21", 8, "Banani"), "Robotics", 10);

        System.out.println("Authors who wrote more than 1 paper (using Private Attributes):\n");


        for (Authors author : authorsArray) {

            if (author.getNo_of_paprs() > 1) {
                System.out.println(author.toString());
            }
        }
    }
}

//output

//Authors who wrote more than 1 paper (using Private Attributes):
//
//Name: Dr. Rahim
//Age: 45
//Address: House: 12A, Road: 5, Area: Dhanmondi
//Paper: AI in Ethics
//Total Papers: 3
//        -----------------------
//Name: Sarah Hasan
//Age: 38
//Address: House: 45, Road: 2, Area: Gulshan
//Paper: Cyber Security
//Total Papers: 5
//        -----------------------
//Name: Dr. Anis
//Age: 50
//Address: House: 21, Road: 8, Area: Banani
//Paper: Robotics
//Total Papers: 10
//        -----------------------
