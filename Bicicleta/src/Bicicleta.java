public class bicicleta {
    private double velocidadactual;
    private int platoactual;
    private int pinonactual;

    public bicicleta(double velocidadactual, int platoactual, int pinonactual) {
        this.velocidadactual = velocidadactual;
        this.platoactual = platoactual;
        this.pinonactual = pinonactual;
    }

    public bicicleta() {
        this.velocidadactual = 0;
        this.platoactual = 1;
        this.pinonactual = 1;
    }

    public void acelerar() {
        velocidadactual = velocidadactual * 2;
    }

    public void frenar() {
        velocidadactual = velocidadactual / 2;
    }

    public void cambiarplato(int plato) {
        this.platoactual = plato;
    }

    public void cambiarpinon(int pinon) {
        this.pinonactual = pinon;
    }

    public void cambiarplato() {
        this.platoactual = 1;
    }

    public void cambiarpinon() {
        this.pinonactual = 1;
    }

    public int getplatoactual() {
        return platoactual;
    }

    public int getpinonactual() {
        return pinonactual;
    }
}
