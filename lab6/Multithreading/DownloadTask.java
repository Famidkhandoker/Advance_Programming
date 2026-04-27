// Multithread using run method
class DownloadTask {
    private String fileName;
    public DownloadTask(String fileName) {
        this.fileName = fileName;
    }
    public void run() {
        System.out.println("Downloading" + fileName);
        System.out.println(fileName +" downloaded!");
    }
}




// Multithread using start method
class DownloadTask extends Thread {
    private String fileName;
    public DownloadTask(String fileName) {
        this.fileName = fileName;
    }
    public void run() {
        System.out.println("Downloading" + fileName);
        System.out.println(fileName +" downloaded!");
    }
}
