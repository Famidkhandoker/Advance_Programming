public class Cars {


    private String no;
    private String model;
    private double price;
    private int year;

    public Cars(String no, String model, double price, int year) {
        this.no = no;
        this.model = model;
        this.price = price;
        this.year = year;
    }

    public String getNo() {
        return no;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    // Tax = 5%
    public double taxes() {
        return price * 0.05;
    }

    public String toString() {
        return no + " " + model + " " + price + " " + year + " Tax: " + taxes();
    }
}
