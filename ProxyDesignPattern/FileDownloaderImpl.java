package DesignPatterns.ProxyDesignPattern;

public class FileDownloaderImpl implements FileDownloader {
    
    @Override
    public void downloadFile(String url){
        System.out.println("Downloaded file from url: " + url);
    }
}
