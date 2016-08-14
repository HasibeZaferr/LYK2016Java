package tr.org.linux.kamp2016.bookshop;

public class Customer {
	
	 private String userName;
     private String userSurname;
     private Purchase[] purchaseHistory;
     private int purchaseCount;

     public Customer(String userName, String userSurname) {
         setUserName(userName);
         setUserSurname(userSurname);
         this.purchaseHistory = new Purchase[2];
         this.purchaseCount = 0;
     }

     public String getUserName() {
         return userName;
     }

     public void setUserName(String userName) {
         this.userName = userName;
     }

     public String getUserSurname() {
         return userSurname;
     }

     public void setUserSurname(String userSurname) {
         this.userSurname = userSurname;
     }

     public int getPurchaseCount() {
         return purchaseCount;
     }

     public boolean placePurchase(Purchase current){
         if (purchaseCount < 2){
             purchaseHistory[purchaseCount] = current;
             purchaseCount++;
             return true;
         }
         else{
             System.out.println("We cannot process your purchase for now! Please try again later.");
             return false;
         }
     }

     public double getTotalAmountSpent(){
         double total = 0;
         for (int i = 0; i < purchaseCount; i++){
             total += purchaseHistory[i].getTotalPayment();
         }
         return total;

     }

     public String toString() {
         String myToString = "++++++++++++++++++++++++++++++++\n"
                 + "Customer user name: " + this.userName + "\n"
                 + "Customer user surname: " + this.userSurname + "\n";
         for(int i = 0; i < this.purchaseCount; i++){
             String temp = "--------------------------------\n"
                     + "*****Purchase #" + (i+1) + ":\n"
                     + this.purchaseHistory[i].toString() + "\n";
             myToString += temp;
         }
         return myToString;
     }

}
