package tr.org.linux.kamp2016.bookshop;

public class HardCopyBook extends Book{
	  private double weight;
	    private double shippingCost;

	    // Constructor
	    public HardCopyBook(String name, String author, double price, String bookId,  double weight, double shippingCost){
	        super(name, author, price, bookId);
	        setWeight(weight);
	        setShippingCost(shippingCost);
	    }

	    public void setWeight(double weight){
	        this.weight = weight > 0 ? weight : 1.0;
	    }

	    public double getWeight(){
	        return this.weight;
	    }

	    public void setShippingCost(double shippingCost) {
	        this.shippingCost = shippingCost >= 0 ? shippingCost : 0;
	    }

	    public double getShippingCost() {
	        return shippingCost;
	    }

	    public double getTotalCost(){
	        return super.getPrice() + this.getShippingCost();
	    }

	    public String toString(){
	        String myToString = super.toString() +
	                "Book weight: " + this.getWeight() + "\n" +
	                "Book shipping cost: " + this.getShippingCost() + "\n";
	        return myToString;
	    }
}
