package pl.zajavka;

public class HydraulicBrakes implements Brakes{
    @Override
    public void apply() {
        System.out.println("Hydraulic brakes applied.");
    }
}
