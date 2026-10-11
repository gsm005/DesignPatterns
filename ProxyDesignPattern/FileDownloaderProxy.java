package DesignPatterns.ProxyDesignPattern;

public class FileDownloaderProxy implements FileDownloader {

    private FileDownloaderImpl fileDownloaderImpl;
    private boolean isAuthenticated;

    public FileDownloaderProxy(boolean isAuthenticated) {
        this.isAuthenticated = isAuthenticated;
    }
    
    @Override
    public void downloadFile(String url){
        if(isAuthenticated){
            if(fileDownloaderImpl==null){
                fileDownloaderImpl=new FileDownloaderImpl();
            }
            fileDownloaderImpl.downloadFile(url);
        }else{
            System.out.println("User is not authenticated. Cannot download file from url: " + url);
        }
    }
}
