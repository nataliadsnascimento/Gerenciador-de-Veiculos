public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String placa, String marca, double preco, int cilindradas){
        super(placa, marca, preco);
        this.cilindradas = cilindradas;
    }

    public String getTipo() {
        return "Moto";
    }

    public int getcilindradas(){
        return cilindradas;
    }

    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Cilindradas: " + cilindradas);
    }

    public void mostrarDados(boolean Mostrarcavalos){
        super.mostrarDados();
        if (Mostrarcavalos) {
            double cavalos = cilindradas / 15;
            System.out.println("Potência: " + cavalos + " CV");
        } else {
            System.out.println("Cilindradas: " + cilindradas);
        }
    }
}
