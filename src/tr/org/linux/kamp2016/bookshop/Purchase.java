package tr.org.linux.kamp2016.bookshop;

public class Purchase extends ShoppingCart{
	
	   private String purchaseDate;
       private String shippingDate;
       private int deliveryLength;

       public Purchase(String purchaseDate, String shippingDate, int deliveryLength) {
           super();
           setPurchaseDate(purchaseDate);
           setShippingDate(shippingDate);
           setDeliveryLength(deliveryLength);
       }

       public String getPurchaseDate() {
           return purchaseDate;
       }

       public void setPurchaseDate(String purchaseDate) {
           this.purchaseDate = purchaseDate;
       }

       public String getShippingDate() {
           return shippingDate;
       }

       public void setShippingDate(String shippingDate) {
           this.shippingDate = shippingDate;
       }

       public int getDeliveryLength() {
           return deliveryLength;
       }

       public void setDeliveryLength(int deliveryLength) {
           if (deliveryLength >= 0)
               this.deliveryLength = deliveryLength;
           else
               this.deliveryLength = 3; 
       }

       public double getTotalPayment(){
           double totalPrice = 0.0;
           Book[] contents = super.getContents();
           for (int i = 0; i < super.getNumEntriesInCart(); i++){
               totalPrice += contents[i].getPrice();
           }
           return totalPrice;
       }

       @Override
       public String toString() {
           String myToString ="Purchase Date: " + this.purchaseDate + "\n"
                   + "Shipping Date: " + this.shippingDate + "\n"
                   + "Delivery Length: " + this.deliveryLength + "\n"
                   + super.toString();
           return myToString;
       }

}
