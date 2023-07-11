import java.util.ArrayList;

public class ShoppingTrolley {
    private  ArrayList<String> items = new ArrayList<String>();

public ShoppingTrolley(){

}

 public void addItem(String item){
    items.add(item);
 }
public int countItems() {
    return items.size();
}

public Boolean verifyIfItemInTrolley(String item){
    return items.contains(item);
}

}
