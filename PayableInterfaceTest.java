package practice10;

//Fig. 10.14: PayableInterfaceTest.java
public class PayableInterfaceTest {
 public static void main(String[] args) {
     // Assume classes SalariedEmployee, HourlyEmployee, CommissionEmployee,
     // and BasePlusCommissionEmployee are defined as in earlier figures.
     Payable[] payableObjects = new Payable[] {
         new Invoice("01234", "seat", 2, 375.00),
         new Invoice("56789", "tire", 4, 79.95),
         new SalariedEmployee("John", "Smith", "111-11-1111", 800.00),
         new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40),
         new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, 0.06),
         new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, 0.04, 300)
     };

     System.out.println("Invoices and Employees processed polymorphically:\n");

     for (Payable currentPayable : payableObjects) {
         System.out.printf("%s%nPayment due: $%,.2f%n%n",
                 currentPayable.toString(), currentPayable.getPaymentAmount());
     }
 }
}