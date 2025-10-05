public class Caminhao extends Veiculo {
    private double carga;

    public Caminhao(String placa, String marca, double preco, double carga) {
        super(placa, marca, preco);
        this.carga = carga;
    }

    public String getTipo() {
        return "Caminhão";
    }

    public double getcarga() {
        return carga;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Capacidade de carga: " + carga);
    }

    public void mostrarDados(boolean mostrarCarga) {
        super.mostrarDados();
        if (mostrarCarga) {
            double cargaKg = carga * 1000;
            System.out.println("Capacidade de carga:  %.2f kg%n" + cargaKg);
        } else {
            System.out.println("Capacidade de carga:  %.2f toneladas%n" + carga);
        }
    }
}