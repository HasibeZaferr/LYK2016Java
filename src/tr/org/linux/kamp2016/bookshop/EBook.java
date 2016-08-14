package tr.org.linux.kamp2016.bookshop;

public class EBook extends Book {
	
    private double fileSize;
    private String encodingFormat;
    private int numDevicesBeingUsed;

    public EBook(String name, String author, double price, String bookId, double fileSize, String encodingFormat){
        super(name, author, price, bookId);
        setFileSize(fileSize);
        setEncodingFormat(encodingFormat);
        this.numDevicesBeingUsed = 0;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize > 0 ? fileSize : 1.0;
    }

    public double getFileSize() {
        return this.fileSize;
    }

    public void setEncodingFormat(String encodingFormat) {
        this.encodingFormat = encodingFormat;
    }

    public String getEncodingFormat() {
        return this.encodingFormat;
    }




    public int getNumDevicesBeingUsed() {
        return this.numDevicesBeingUsed;
    }

    // Other asked methods in the homework
    public boolean addDevice(){
        this.numDevicesBeingUsed++;
        return true;
    }

    public boolean removeDevice(){
        this.numDevicesBeingUsed--;
        return true;
    }

    public String toString(){
        String res = super.toString() +
                "Book file size: " + this.getFileSize() + "\n" +
                "Number of devices the book is being used on: " + this.getNumDevicesBeingUsed() + "\n";
        return res;
    }

}
