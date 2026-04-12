class Authors {
    private String Author_name;
    private int Age;
    private Address Adrs;
    private String Paper_name;
    private int No_of_paprs;

    // Constructor
    public Authors(String Author_name, int Age, Address Adrs, String Paper_name, int No_of_paprs) {
        this.Author_name = Author_name;
        this.Age = Age;
        this.Adrs = Adrs;
        this.Paper_name = Paper_name;
        this.No_of_paprs = No_of_paprs;
    }


    public int getNo_of_paprs() {
        return No_of_paprs;
    }

    // toString method
    public String toString() {
        return "Name: " + Author_name +
                "\nAge: " + Age +
                "\nAddress: " + Adrs.toString() +
                "\nPaper: " + Paper_name +
                "\nTotal Papers: " + No_of_paprs +
                "\n-----------------------";
    }
}
