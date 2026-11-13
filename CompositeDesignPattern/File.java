package DesignPatterns.CompositeDesingPattern;

public class File extends FileSystem {
    public File(String name) {
        super(name);
    }

    @Override
    public void ls() {
        System.out.println("File: " + name);
    }
}
