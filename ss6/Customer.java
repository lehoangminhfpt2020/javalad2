package lad2.ss6;
//snippet 1 to 4
public class Customer {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;

    void changeCustomerAddress(String address){
        customerAddress=address;
    }
    void displayCustomerInformation(){
        System.out.println(customerID);
        System.out.println(customerName);
        System.out.println(customerAddress);
        System.out.println(customerAge);
    }

    public static void main(String[] args) {
        Customer objCustomer1 = new Customer();
        objCustomer1.customerID = 100;
        objCustomer1.customerName="Jonh";
        objCustomer1.customerAddress="123 Street";
        objCustomer1.customerAge= 30;

        System.out.println(objCustomer1.customerID);
        System.out.println(objCustomer1.customerName);
        System.out.println(objCustomer1.customerAddress);
        System.out.println(objCustomer1.customerAge);
    }

}