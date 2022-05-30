package Lesson4;

public class Payment {
    int totalSum;
    Product[] products;
    int count=0;
    class Product{
        private int price;
        private int amount;
        public Product(int price, int amount){
            this.price = price;
            this.amount =amount;
            totalSum += price*amount;
        }
    }
    public Payment(int productAmount){
         products = new Product[productAmount];
    }
    public void addProduct(int price, int amount){
        if(count< products.length)
           products[count++] = new Product(price, amount);
    }
    public void info(){
        for(Product product:products){
            System.out.println("price: " + product.price + ", amount: " + product.amount);
        }
        System.out.println("Total purchase of payment is " + totalSum);
    }

    public static void main(String[] args) {
        Payment payment = new Payment(5);
        payment.addProduct(5000,2);
        payment.addProduct(200,3);
        payment.addProduct(1000,4);
        payment.addProduct(100,3);
        payment.addProduct(500,2);
        payment.info();
    }
}
