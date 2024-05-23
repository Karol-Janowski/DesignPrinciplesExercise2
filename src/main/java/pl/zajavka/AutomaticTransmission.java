package pl.zajavka;

public class AutomaticTransmission implements Transmission{
    @Override
    public void shiftUp() {
        System.out.println("Automatic transmission shifted up. ");
    }

    @Override
    public void shiftDown() {
        System.out.println("Automatic transmission shifted down. ");
    }
}
