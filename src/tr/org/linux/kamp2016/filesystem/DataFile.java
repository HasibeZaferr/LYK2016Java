package tr.org.linux.kamp2016.filesystem;

public class DataFile extends BinaryFile implements Openable {

    private String compressionFormat;
    private ExecutableFile opensWith;
    private boolean[] bits;

    public DataFile(String fName, long fSize, String format, ExecutableFile executableFile, boolean[] data) {
        super(fName, fSize);
        this.compressionFormat = format;
        this.opensWith = executableFile;
        this.bits=data;
    }

    @Override
    public void onClick() {
        System.out.println("On click: " + this.opensWith() + " " + this.getName());
    }

    @Override
    public BinaryFile getCopy() {
        DataFile newInstance = null;


            String newName=this.getName();
            if(newName.contains(".")) {
                int extensionIndex = newName.indexOf(".");
                newName = newName.substring(0, extensionIndex).concat("(copy)").concat(newName.substring(extensionIndex));


            newInstance = new DataFile(newName, this.getSize(), new String(this.compressionFormat), this.opensWith, null);
            boolean[] newBits = new boolean[this.bits.length];
            for(int i=0; i<this.bits.length; i++)
                newBits[i] = this.bits[i];
            newInstance.bits = newBits;

        }
    return newInstance;
    }

    @Override
    public String opensWith() {
        return this.opensWith.getName();
    }

    public String toString() {
        String res = "Type: Data File \n" + super.toString();
        res += "Compression format: " + this.compressionFormat + "\n";
        res += "Opens with: " + this.opensWith() + "\n";

        return res;
    }

}
