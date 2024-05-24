package pl.zajavka;

public class DiscBrakes implements Brakes{

    @Override
    public void apply() {
        System.out.println("Disc brakes applied.");
    }
}
