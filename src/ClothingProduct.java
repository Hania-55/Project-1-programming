public class ClothingProduct extends Product{
    private String size;
    private String fabric;
    public ClothingProduct(int ProductId,String name,float price,String size,String fabric){
        super(ProductId,name,price);
        this.fabric=fabric;
        this.size=size;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getFabric() {
        return fabric;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
