package pl.zajavka;

public class ManualTransmission implements Transmission{
    @Override
    public void shiftUp() {
        System.out.println("Manual Transmission shifted up.");
    }

    @Override
    public void shiftDown() {
        System.out.println("Manual Transmission shifted down");
    }
}
