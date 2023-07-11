public class Computer {
    private int storage;
    private String printer;

    public Computer(int storage, String printer){
    this.storage =storage;
this.printer = printer;

    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }
    public void addStorage(int addedStorage){
        this.storage += addedStorage;
    }

    public String getPrinterModel() {
        return printer;
    }

    public void setPrinterModel(String printer) {
        this.printer = printer;
    }

    public void print(String msg){
        System.out.println(msg);

    }
}
