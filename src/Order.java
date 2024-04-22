public class Order {
    private int customerId;
    private int orderId=0;
    int nProducts;
    protected Product[] products;
    private float totalPrice=0;
   public Order(int nProducts){
       this.nProducts=nProducts;
       this.products=new Product[nProducts];
   }
    public void setnProducts(int nProducts) {
        this.nProducts = nProducts;
    }

    public void setProduct(Product newProduct,int index) {
        if (index >= 0 && index < products.length) {
            this.products[index] = newProduct;
            totalPrice+=newProduct.getPrice();
        }}


        public void setCustomerId ( int customerId){
            this.customerId = Math.abs(customerId);
        }
        public void orderInfo() {
            orderId++;
            System.out.println("order id: " + orderId);
            System.out.println("customer id: " + customerId + "\nproducts:\n");
            for (Product product : products) {
                System.out.println(product.getName() + "- $" + product.getPrice());
            }
            System.out.println("total is " + totalPrice);
        }
    }
