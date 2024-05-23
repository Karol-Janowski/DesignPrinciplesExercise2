package pl.zajavka;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car implements Vehical{
    private Engine engine;
    private Transmission transmission;
    private Brakes brakes;
    private Accelerator accelerator;
    @Override
    public void startEngine() {
        engine.start();
    }

    @Override
    public void stopEngine() {
        engine.stop();
    }

    @Override
    public void accelerate() {
        accelerator.accelerate();
        transmission.shiftUp();
    }

    @Override
    public void brake() {
        brakes.apply();
    }
}
