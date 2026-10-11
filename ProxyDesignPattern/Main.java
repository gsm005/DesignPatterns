package DesignPatterns.ProxyDesignPattern;

public class Main {

    public static void main(String[] args) {
        FileDownloader fileDownloader = new FileDownloaderProxy(false);
        fileDownloader.downloadFile("https://example.com/file.txt");
        
        fileDownloader = new FileDownloaderProxy(true);
        fileDownloader.downloadFile("https://example.com/file.txt");
    }
}
