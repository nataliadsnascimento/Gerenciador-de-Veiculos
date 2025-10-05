public class Veiculo {
    private String placa;
    private String marca;
    private double preco;

    public Veiculo(String placa, String marca, double preco) {
        this.placa = placa;
        this.marca = marca;
        this.preco = preco;
    }
    public String getTipo() {
        return "Veículo";
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }

    public void mostrarDados() {
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.printf("Preço: R$ %.2f%n", preco);
    }

    public void mostrarDados(double desconto) {
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());

        if (desconto > 0) {
            double precoComDesconto = getPreco() * (1 - desconto / 100);
            System.out.printf("Preço com desconto: R$ %.2f%n", precoComDesconto);
        }
    }
}