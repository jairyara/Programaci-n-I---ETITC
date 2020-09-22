public class Bicicleta {
    private double velocidadActual;
    private int platoActual;
    private int pinonActual;

    public Bicicleta(double velocidadActual, int platoActual, int pinonActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.pinonActual = pinonActual;
    }

    public Bicicleta() {
        this.velocidadActual = 0;
        this.platoActual = 1;
        this.pinonActual = 1;
    }

    public void acelerar() {
        velocidadActual = velocidadActual * 2;
    }

    public void frenar() {
        velocidadActual = velocidadActual / 2;
    }

    public void cambiarPlato(int plato) {
        this.platoActual = plato;
    }

    public void cambiarPinon(int pinon) {
        this.pinonActual = pinon;
    }

    public void cambiarPlato() {
        this.platoActual = 1;
    }

    public void cambiarPinon() {
        this.pinonActual = 1;
    }

    public int getPlatoActual() {
        return platoActual;
    }

    public int getPinonActual() {
        return pinonActual;
    }
}
