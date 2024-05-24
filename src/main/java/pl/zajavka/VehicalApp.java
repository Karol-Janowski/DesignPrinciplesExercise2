package pl.zajavka;

public class VehicalApp {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Transmission automaticTransmission = new AutomaticTransmission();
        Transmission manualTransmission = new ManualTransmission();
        Brakes hydraulicBrakes = new HydraulicBrakes();
        Brakes discBrakes = new HydraulicBrakes();
        Accelerator electronicAccelerator = new ElectronicAccelerator();
        Accelerator twistGripAccelerator = new TwistGripAccelerator();
        Vehical car = new Car(engine, automaticTransmission, hydraulicBrakes, electronicAccelerator);
        Vehical motorcycle = new Motorcycle(engine, manualTransmission, discBrakes, twistGripAccelerator);

        car.startEngine();
        motorcycle.startEngine();

        car.accelerate();
        motorcycle.accelerate();

        car.brake();
        motorcycle.brake();

        car.stopEngine();
        motorcycle.stopEngine();
    }
}

//    W tym kodzie możemy znaleźć zasady SOLID:
//        • Single Responsibility Principle (SRP) - każda klasa ma jedną odpowiedzialność. Klasa Car i Motorcycle
//        są odpowiedzialne tylko za przechowywanie informacji o pojeździe i jego podzespołach oraz
//        implementację interfejsu Vehicle, a klasy Engine, Transmission, Brakes i Accelerator są
//        odpowiedzialne tylko za realizację odpowiednich funkcji.
//        • Open/Closed Principle (OCP) - klasy są otwarte na rozszerzenie, ale zamknięte na modyfikację. Jeśli
//        chcemy dodać nowy typ pojazdu, wystarczy utworzyć nową klasę implementującą interfejs Vehicle,
//        bez modyfikowania istniejącego kodu.
//        • Liskov Substitution Principle (LSP) - każda klasa implementująca interfejs Vehicle może być użyta w
//        miejsce interfejsu Vehicle bez zmiany zachowania aplikacji.
//        • Interface Segregation Principle (ISP) - interfejs Vehicle zawiera tylko te metody, które są niezbędne
//        dla każdego pojazdu, a pozostałe funkcje zostały wydzielone do innych interfejsów (Transmission,
//        Brakes, Accelerator).
//        • Dependency Inversion Principle (DIP), która mówi, że moduły wyższego poziomu nie powinny zależeć
//        od modułów niższego poziomu, oba powinny zależeć od abstrakcji, a nie od konkretnych
//        implementacji. Zależności są zdefiniowane w konstruktorach Car i Motorcycle, co pozwala na łatwe
//        podmienianie implementacji bez zmiany istniejącego kodu. W ten sposób implementacja modułów
//        niższego poziomu nie wpływa na moduły wyższego poziomu, co ułatwia rozwijanie i testowanie aplikacji.
