public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String placa, String marca, double preco, int numPortas) {
        super(placa, marca, preco);
        this.numPortas = numPortas;
    }

    public String getTipo() {
        return "Carro";
    }

    public int getnumPortas(){
        return numPortas;
    }

    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Número de portas do veículo: " + numPortas);
    }

    public void mostrarDados(boolean mostrarPortas) {
        super.mostrarDados();
        if (mostrarPortas) {
            System.out.println("Número de portas: " + numPortas);
        }
    }
}