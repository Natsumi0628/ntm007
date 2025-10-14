package practice10;

//Fig. 10.12: Invoice.java
public class Invoice implements Payable {
 private final String partNumber;
 private final String partDescription;
 private int quantity;
 private double pricePerItem;

 public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
     if (quantity < 0) throw new IllegalArgumentException("Quantity must be >= 0");
     if (pricePerItem < 0.0) throw new IllegalArgumentException("Price per item must be >= 0.0");

     this.partNumber = partNumber;
     this.partDescription = partDescription;
     this.quantity = quantity;
     this.pricePerItem = pricePerItem;
 }

 public String getPartNumber() { return partNumber; }
 public String getPartDescription() { return partDescription; }
 public int getQuantity() { return quantity; }
 public void setQuantity(int quantity) {
     if (quantity < 0) throw new IllegalArgumentException("Quantity must be >= 0");
     this.quantity = quantity;
 }

 public double getPricePerItem() { return pricePerItem; }
 public void setPricePerItem(double pricePerItem) {
     if (pricePerItem < 0.0) throw new IllegalArgumentException("Price per item must be >= 0.0");
     this.pricePerItem = pricePerItem;
 }

 // Payable implementation
 @Override
 public double getPaymentAmount() {
     return getQuantity() * getPricePerItem();
 }

 @Override
 public String toString() {
     return String.format(
         "invoice:%npart number: %s (%s)%nquantity: %d%nprice per item: $%,.2f",
         getPartNumber(), getPartDescription(), getQuantity(), getPricePerItem()
     );
 }
}
