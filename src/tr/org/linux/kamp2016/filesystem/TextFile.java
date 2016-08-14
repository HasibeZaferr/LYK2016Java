package tr.org.linux.kamp2016.filesystem;

public abstract class TextFile extends File {
	
	private String encoding;
	private long numChars;
	
	public TextFile(String fName, long fSize, String encoding, long numChars)
	{
		super(fName, fSize);
		this.encoding = encoding;
		this.numChars = numChars;
	}
	
	public String getEncoding(){
		
		return this.encoding;
	}
	
	public long getNumChars(){
		
		return this.numChars;
		
	}
	
	public abstract void clear();
	
	 public String toString() {
	        String res = super.toString();
	        res += "Encoding: " + this.encoding + "\n";
	        res +=  "Number of characters: " + numChars + "\n";

	        return res;
	    }
	

}
