package tr.org.linux.kamp2016.filesystem;

public class ExecutableFile extends BinaryFile {
    private String platform;
    private byte[] contents;

    public ExecutableFile(String fName, long fSize, String platform, byte[] content) {
        super(fName, fSize);
        this.platform = platform;
        this.contents = content;
    }

    @Override
    public String toString() {
        return "Type: Executable File: " + super.toString() + "Platform: " + platform + "\n";
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public byte[] getContents() {
        return contents;
    }

    public void setContents(byte[] contents) {
        this.contents = contents;
    }

    @Override
    public void onClick() {
        System.out.println("On click: " + this.getName());
    }

    public BinaryFile getCopy() {
        ExecutableFile newInstance = null;


        String newName=this.getName();
        if(newName.contains(".")) {
            int extensionIndex = newName.indexOf(".");
            newName = newName.substring(0, extensionIndex).concat("(copy)").concat(newName.substring(extensionIndex));
        } else
            newName += "(copy)";

    newInstance = new ExecutableFile(newName, this.getSize(), new String(this.platform), null);

    byte[] newContents = new byte[this.contents.length];
			for(int i=0; i<this.contents.length; i++)
    newContents[i] = this.contents[i];
    newInstance.contents = newContents;

        return newInstance;
}


}
