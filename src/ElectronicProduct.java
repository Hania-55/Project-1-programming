public class ElectronicProduct extends Product{
    private String brand;
    private int warrantyPeriod;
    public ElectronicProduct(int ProductId,String name,float price,String brand,int warrantyPeriod){
        super(ProductId,name,price);
        this.brand=brand;
        this.warrantyPeriod=warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
