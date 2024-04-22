public class Product {
    protected int ProductId;
    protected String name;
    protected float price;
public Product(int ProductId,String name,float price){
    this.price=price;
    this.ProductId=ProductId;
    this.name=name;

}
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(float price) {
        this.price = Math.abs(price);
    }
    public float getPrice() {
        return price;
    }

    public void setProductId(int productId) {
        ProductId = Math.abs(productId);
    }

    public int getProductId() {
        return ProductId;
    }
}
