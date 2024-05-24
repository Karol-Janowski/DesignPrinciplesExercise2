package pl.zajavka;

public class ElectronicAccelerator implements Accelerator{
    @Override
    public void accelerate() {
        System.out.println("Electronic acceleerator pressed.");
    }
}
