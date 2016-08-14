package tr.org.linux.kamp2016.filesystem;

import java.util.List;

public class HTMLFile extends TextFile implements Openable {

    private ExecutableFile browserCompatibleWith;
    private List<HTMLFile> linksTo;
    private int htmlVersion;

    public HTMLFile(String fName, long fSize, String encoding, int htmlVersion, ExecutableFile compatibleBrowser, List<HTMLFile> links) {

        super(fName, fSize, encoding, 10000);
        this.htmlVersion = htmlVersion;
        this.browserCompatibleWith = compatibleBrowser;
        this.linksTo = links;
    }

    public int getHTMLVersion() {
        return this.htmlVersion;
    }

    public ExecutableFile getCompatibleBrowser() {
        return this.browserCompatibleWith;
    }

    public List<HTMLFile> getLinks() {
        return this.linksTo;
    }

    @Override
    public void onClick() {
        System.out.println("On click: " + this.opensWith() + " " + this.getName());
    }

    @Override
    public void clear() {
            this.linksTo.clear();
        
        this.browserCompatibleWith = new ExecutableFile("firefox.run", 200000, "Debian GNU/Linux", new byte[1]);
    }

    @Override
    public String opensWith() {
        return this.browserCompatibleWith.getName();
    }

    public String toString() {
        String res = "Type: HTML File \n" + super.toString();

        res += "Compatible with: " + this.browserCompatibleWith.getName() + "\n";
        res += "HTML version: " + this.htmlVersion + "\n";

        if(linksTo != null) {
            res += "Links to: ";
            for(File f: linksTo) {
                res += f.getName() + " ";
            }
        }

        return res + "\n";
    }
}

