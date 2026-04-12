class Address {
    private String House_no;
    private int Road_no;
    private String Area;

    // Constructor
    public Address(String House_no, int Road_no, String Area) {
        this.House_no = House_no;
        this.Road_no = Road_no;
        this.Area = Area;
    }

    // toString method
    public String toString() {
        return "House: " + House_no + ", Road: " + Road_no + ", Area: " + Area;
    }
}
