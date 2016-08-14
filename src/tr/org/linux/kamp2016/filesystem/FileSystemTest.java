package tr.org.linux.kamp2016.filesystem;

import java.util.ArrayList;
import java.util.List;

public class FileSystemTest {
	
	public static void main(String[] args) {

        ExecutableFile browser = new ExecutableFile("firefox.run", 824000, "Arch GNU/Linux", new byte[1]);

        HTMLFile page1 = new HTMLFile("philosophy.html", 2000, "Unicode", 5, browser, null);
        HTMLFile page2 = new HTMLFile("gnu.html", 5000, "Unicode", 5, browser, null);
        HTMLFile page3 = new HTMLFile("freelicences.html", 4000, "Unicode", 5, browser, null);
        HTMLFile page4 = new HTMLFile("contact.html", 1000, "Unicode", 5, browser, null);

        List<HTMLFile> myPageLinks = new ArrayList<HTMLFile>();
        myPageLinks.add(page1);
        myPageLinks.add(page2);
        myPageLinks.add(page3);
        myPageLinks.add(page4);

        File myWebpage = new HTMLFile("mypage.html", 9000, "Unicode", 5, browser, myPageLinks);

        File todos = new PlainTextFile("To Do List", 3000, "ASCII", new String[]{"Feed the cats", "Clean cats toilet",
                "Eat", "Write code", "Drink beer", "Sleep"});

        ExecutableFile player = new ExecutableFile("vlc.run", 160000, "Debian GNU/Linux", new byte[1]);

        File music = new DataFile("The Drones - Shark Fin Blues.flac", 350000, "flac", player, new boolean[1]);

        File movie = new DataFile("Pulp Fiction.1994.ETRG.x264.mkv", 1500000, "mkv", player, new boolean[1]);

        File[] files = new File[] {browser, myWebpage, todos, player, music, movie};

        System.out.println("Calling toString methods:");
        for(File f: files) {
            System.out.println(f.toString());
        }

        System.out.println("Calling polymorphic methods:");
        File.callPolymorphicMethods(files);
    }

}
