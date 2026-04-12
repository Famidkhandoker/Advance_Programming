public class Cars {
    private String no;
    private String model;
    private double price;

    // Parameterized Constructor
    public Cars(String no, String model, double price) {
        this.no = no;
        this.model = model;
        this.price = price;
    }

    // Getter and Setter methods
    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // Taxes calculation (5%)
    public double taxes() {
        return price * 0.05;
    }

    @Override
    public String toString() {
        return no + " " + model + " " + price;
    }
}