//run method
public class Multithreading1 {
    public static void main(String[] args) {
        DownloadTask t1 = new DownloadTask("File1");
        DownloadTask t2 = new DownloadTask("File2");
        t1.run();
        t2.run();
    }
}

//output
//DownloadingFile1
//File1 downloaded!
//DownloadingFile2
//File2 downloaded!




//start method
public class Multithreading1 {
    public static void main(String[] args) {
        DownloadTask t1 = new DownloadTask("File1");
        DownloadTask t2 = new DownloadTask("File2");
        t1.start();
        t2.start();
    }
}

//output
//DownloadingFile2
//File2 downloaded!
//DownloadingFile1
//File1 downloaded!
