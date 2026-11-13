package DesignPatterns.CompositeDesignPattern;
import java.util.*;

public class Directory extends FileSystem {
    private List<FileSystem> files;

    public Directory(String name) {
        super(name);
        files = new ArrayList<>();
    }

    @Override
    public void ls() {
        System.out.println("Directory: " + name);
        for(FileSystem file : files) {
            file.ls();
        }
    }

    public void add(FileSystem fileSystem) {
        files.add(fileSystem);
    }
    
}
