import com.di.xpninja.classes.Femme;
import com.di.xpninja.classes.Garcon;

public class App {
    public static void main(String[] args) throws Exception {
        Garcon garcon = new Garcon();
        garcon.displayInfo();

        Femme femme = new Femme();
        femme.displayInfo();
    }
}
