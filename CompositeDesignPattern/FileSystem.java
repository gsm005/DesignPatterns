package DesignPatterns.CompositeDesignPattern;

public abstract class FileSystem {
    String name;
    

    public FileSystem(String name) {
        this.name = name;
    }

    public abstract void ls();

}
