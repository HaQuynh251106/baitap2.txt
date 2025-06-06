package baiTapThucHanh;

public class Product {
    private int id;
    private String name;
    private String thumbnail;
    private double price;
    private int qty;
    private String description;

    public Product(int id, String name, String thumbnail, double price, int qty, String description) {
        this.id = id;
        this.name = name;
        this.thumbnail = thumbnail;
        this.price = price;
        this.qty = qty;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void displayInfor(){
        System.out.println(" Product Infor ");
        System.out.println(" Id : "+id);
        System.out.println(" Name : "+name);
        System.out.println(" Price : "+price);
        System.out.println(" Quantity : "+qty);
        System.out.println(" Description : "+description);
    }

    public boolean checkAvailability(int orderQty){
        return qty >= orderQty;
    }

    public double placeOrder(int orderQty) {
        if (checkAvailability(orderQty)) {
            qty -= orderQty;
            return orderQty * price;
        } else {
            return -1;
        }
    }
}
