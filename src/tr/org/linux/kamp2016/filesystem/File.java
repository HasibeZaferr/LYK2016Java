package tr.org.linux.kamp2016.filesystem;

import java.util.Date;

public abstract class File {

	private String name;
	private long size;
	private Date dateCreated;

	public File(String fName, long fSize) {

		this.setName(fName);
		this.size = fSize;
		this.dateCreated = new Date();

	}

	public String getName() {
		return name;
	}

	public void setName(String fileName) {
		if (fileName.contains(" ")) {
			fileName = fileName.replace(" ", "");
		}
		this.name = fileName;

		this.name = name;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public abstract void onClick();

	public static void callPolymorphicMethods(File[] files) {
		for (int i = 0; i < files.length; i++) {
			System.out.println("\nFile: " + files[i].getName());
			files[i].onClick();

			if (files[i] instanceof Openable)
				System.out.println("Open with: " + ((Openable) files[i]).opensWith());
			if (files[i] instanceof TextFile)
				((TextFile) files[i]).clear();
			else if (files[i] instanceof BinaryFile) {

				BinaryFile cp = ((BinaryFile) files[i]).getCopy();
				System.out.println("Copied. ");
				cp.onClick();

			}

		}
	}
}
