package DesignPatterns.CompositeDesingPattern;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        Directory subDir = new Directory("subDir");
        File file3 = new File("file3.txt");

        root.add(file1);
        root.add(file2);
        root.add(subDir);
        subDir.add(file3);

        root.ls();
    }
}
