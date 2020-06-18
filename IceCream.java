/************************************************************************************************
 * Project 6 - Ice Cream
 ************************************************************************************************
 * Create system that keep tracks of customers' orders at Mal's Ice Cream Shop using abstraction
 * ______________________________________________________________________________________________
 * Meagan Nguyen
 * 09 November 2019
 * CMSC 255-002
 ***********************************************************************************************/

public class IceCream {

    private Size size;
    private Flavor flavor;
    private Sauce sauce;
    private Topping topping;
    private ToppingSun toppingSun;

    public IceCream() {
        this.size = Size.SINGLE;
        this.flavor = Flavor.VANILLA;
        this.sauce = Sauce.NONE;
        this.topping = Topping.NONE;
        this.toppingSun = ToppingSun.NONE;
    }

    public IceCream(Size size) {
        this.size = size;
        this.flavor = Flavor.VANILLA;
        this.sauce = Sauce.NONE;
        this.topping = Topping.NONE;
        this.toppingSun = ToppingSun.NONE;
    }

    public void setSize(Size newSize) { this.size = newSize;
    }

    public void setFlavor(Flavor newFlavor) {
        this.flavor = newFlavor;
    }

    public void setSauce(Sauce newSauce) {
        this.sauce = newSauce;
    }

    public void setTopping(Topping newTopping) {
        this.topping = newTopping;
    }

    public void setToppingSun(ToppingSun newToppingSun) {
        this.toppingSun = newToppingSun;
    }

    public Size getSize() {
        return size;
    }

    public Flavor getFlavor() {
        return flavor;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public Topping getTopping() {
        return topping;
    }

    public ToppingSun getToppingSun() {
        return toppingSun;
    }

    public String toString() {
        String string = "\n\t" + size + "\n\t" + flavor + "\n\t" + sauce + "\n\t" + topping + "\n\t" + toppingSun + "\n";
        return string;
    }
}