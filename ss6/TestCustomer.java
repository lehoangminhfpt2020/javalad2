package lad2.ss6;

public class TestCustomer {
    public static void main(String[] args) {
        Customer objCustomer = new Customer();

        objCustomer.customerID = 100;
        objCustomer.customerName="Jonh";
        objCustomer.customerAddress="123 Street";
        objCustomer.customerAge= 30;

        objCustomer.displayCustomerInformation();

        objCustomer.changeCustomerAddress("123 Fort,Main Street");

        objCustomer.displayCustomerInformation();
    }
}
