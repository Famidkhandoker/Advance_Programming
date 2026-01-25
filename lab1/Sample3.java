import java.util.Scanner; //user interface
public class Sample3 {
    static void main(String[] args) {
        Scanner S =new Scanner(System.in);

        //Integer
        System.out.print("Enter Your Integer Number: ");
        int n = S.nextInt();
        System.out.println(n);
        //Enter Your Integer Number: 100
        //100

        //Float
        System.out.print("Enter Your Float Number: ");
        float f = S.nextFloat();
        System.out.println(f);
//        Enter Your Float Number: 100
//        100.0

        //Double
        System.out.print("Enter Your Double Number: ");
        double d = S.nextDouble();
        System.out.println(d);
//      Enter Your Double Number: 100
//      100.0

        //string
        System.out.print("Enter Your String: ");
        String s1 =S.next();//only one Word
        System.out.println(s1);
        //Enter Your String: Famid Khandoker
        //Famid



        //string
        System.out.print("Enter Your String: ");
        String s2 =S.nextLine(); // string
        System.out.println(s2);
//        Enter Your String: Famid Khandoker
//        Famid Khandoker


        //string
        String fn ="Famid";
        String ln ="Khandoker";
        System.out.println(fn.length());
        System.out.println(fn.charAt(3));//index
        System.out.println(fn.contains("Z"));// letter string e ase kina check
//        output
//        5
//        i
//        false



//        String fn ="Famid";
//        String ln ="famid";
//        System.out.println(fn.equals(ln));// 2 ta string same kina check
        //output
        //false

//        String fn ="Famid";
//        String ln ="famid";
//        System.out.println(fn.equalsIgnoreCase(ln));//  small/capital matter kore na
//        //output
//        //true

        String m ="Madam";
        System.out.println(m.indexOf("a"));
        System.out.println(m.lastIndexOf("a"));
        System.out.println(m.toUpperCase());
        System.out.println(m.trim());
        System.out.println(m.substring(3));//index 3 to last letter
        System.out.println(m.substring(2,3)); //mid letter
        //output
//        1
//        3
//        MADAM
//        Madam
//        am
//        d


        //Boolean
        System.out.print("Enter Your Boolean: ");
        boolean b= S.nextBoolean();
        System.out.println(b);
        //Enter Your Boolean: true
        //true

    }
}
