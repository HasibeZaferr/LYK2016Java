package tr.org.linux.kamp2016.bookshop;

public class Book {
	
	protected String name;
    protected String author;
    protected double price;
    protected String bookId;


    public Book(String name, String author, double price, String bookId){

      this.name = name;
      this.author = author;
      this.price = price;
      this.bookId = bookId;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


public void setAuthor(String name){
    this.author = author;
}

public String getAuthor(){
    return author;
}

    public void setPrice(double price){
        if(0 <= price)
            this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void setBookId(String bookId){

        String defaultBookId = "0123456789";

        if (bookId.length() != 10)
            this.bookId = defaultBookId;

        for (int i = 0; i < bookId.length(); i++){
            if (!Character.isDigit(bookId.charAt(i)))
            {
                this.bookId = defaultBookId;
                return; // Exit method
            }
        }

        this.bookId = bookId;
    }

    public String getBookId(){
        return this.bookId;
    }

    public void applyDiscount(double discountPercentage){

        if(0 <= discountPercentage && discountPercentage <= 1){
            this.price -= this.price * discountPercentage;
        }
    }

    public String toString(){
        String res = "--------------------\n" +
                "Book name: " + this.getName() + "\n" +
                "Book author: " + this.getAuthor() + "\n" +
                "Book price: " + String.valueOf(this.getPrice()) + "\n" +
                "ISBN: " + this.getBookId() + "\n";
        return res;
    }

}
