package tr.org.linux.kamp2016.filesystem;

	public class PlainTextFile extends TextFile {
	    private String[] lines;

	    public PlainTextFile(String fName, long fSize, String encoding, String[] fileLines) {
	        super(fName, fSize, encoding, getNumChars(fileLines));
	        this.lines = fileLines;
	    }

	    public String[] getLines() {
	        return this.lines;
	    }

	    @Override
	    public void onClick() {
	        String content="On click:\n";
	        for(int i=0; i<this.lines.length; i++) {
	            content += this.lines[i] + "\n";
	        }
	        System.out.println(content);
	    }

	    @Override
	    public void clear() {
	        this.lines = new String[10];

	        for(int i=0; i<10; i++) {
	            lines[i] = "";
	        }
	    }

	    private static long getNumChars(String[] fLines) {
	        long res=0;
	        for(int i=0; i<fLines.length; i++) {
	            res += (long)fLines[i].length();
	        }
	        return res;
	    }

	    public String toString() {
	        String res = "Type: Plain Text File \n" + super.toString();

	        res += "The content of the plaintext file: ";
	        for(int i = 0; i < lines.length; i++ ) {
	            res += lines[i] + "\n";
	        }

	        return res;
	    }

}
