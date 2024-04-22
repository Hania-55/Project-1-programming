// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ElectronicProduct p1=new ElectronicProduct(1,"smartphone",599.9F,"samsaung",1);
        ClothingProduct p2=new ClothingProduct(2,"T-shirt",19.99F,"Medium","cotton");
        BookProduct p3=new BookProduct(3,"OOP",39.99F,"O'Reilly","X publications");
        System.out.println("Welcome to Ecommerce System");
        Customer c1=new Customer();
        System.out.println("please enter your name");
        String name= in.next();
        String s= in.nextLine();
        c1.setName(name);
        System.out.println("please enter yor id");
        int id=in.nextInt();
        c1.setCustomerId(id);
        System.out.println("please enter your address");
        String address= in.next();
         s= in.nextLine();
        c1.setAddress(address);
        System.out.println("how many products you want to add?");
        int nProducts = in.nextInt();
        Cart cart=new Cart(nProducts);
        Order o1=new Order(nProducts);
        for (int i=0;i<nProducts;i++){
            System.out.println("which product would you like to add? 1-smartphone 2-T-shirt 3-OOP");
            int choice=in.nextInt();
            switch (choice){
                case 1:
                    cart.addProduct(p1,i);
                    o1.setProduct(p1,i);
                    break;
                case 2:
                    cart.addProduct(p2,i);
                    o1.setProduct(p2,i);
                    break;
                case 3:
                    cart.addProduct(p3,i);
                    o1.setProduct(p3,i);
                    break;
                default:
                    System.out.println("please choose among given choices");
            }
        }
        System.out.println("your total is "+cart.calculatePrice()+" Would you like to place order? 1-Yes 2-No");
        int choice2=in.nextInt();
        cart.placeOrder(choice2);

        if (choice2==1){
            System.out.println("here is your order summary:\n");
            o1.orderInfo();
        }
        



        }
    }
