public class Cart  {

    protected int orderID;
    protected int nProducts;
    protected Product[] products;
    public Cart(int nProducts){
        this.nProducts=Math.abs(nProducts);
        this.products=new Product[nProducts];
    }

    public void setnProducts(int nProducts) {
        this.nProducts=Math.abs(nProducts);
    }

    public int getnProducts() {
        return nProducts;
    }
    public void addProduct(Product newProduct,int index) {
        if(index>=0&&index<products.length){
            this.products[index]=newProduct;
        }
    }
    public void printArray(){
        for (Product product : products) {
            System.out.println("name:" + product.getName());
        }
    }
    public void removeProduct(Product productToRemove){
        int newSize=products.length;
        for (int i=0;i<products.length;i++){
            if (products[i]==productToRemove){
                newSize--;
            } else if (i < newSize) {
                products[i] = products[i + 1];
            }
        }
    }
    public float calculatePrice(){
        float totalPrice=0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
    public void placeOrder(int choice){
        if (choice==1){
            orderID++;
            System.out.println("order is placed");
        } else if (choice==2) {
            System.out.println("order is not placed");
            System.out.println("Total is:"+calculatePrice());
        }

    }
}
