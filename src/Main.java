import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        boolean continuarCadastro = true;

        System.out.println("============== Seja bem-vindo =============");

        while (continuarCadastro) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1) Cadastrar veículo");
            System.out.println("2) Ver todos os veículos cadastrados");
            System.out.println("3) Sair");
            System.out.print("Opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.println("\nEscolha o tipo de veículo:");
                System.out.println("1) Carro");
                System.out.println("2) Moto");
                System.out.println("3) Caminhão");
                System.out.print("Opção: ");
                int tipo = sc.nextInt();
                sc.nextLine();

                System.out.print("Placa: ");
                String placa = sc.nextLine();
                System.out.print("Marca: ");
                String marca = sc.nextLine();
                System.out.print("Preço: ");
                double preco = sc.nextDouble();
                sc.nextLine();

                if (tipo == 1) {
                    System.out.print("Número de portas: ");
                    int portas = sc.nextInt();
                    sc.nextLine();
                    Carro carro = new Carro(placa, marca, preco, portas);

                    System.out.print("Deseja aplicar um desconto? (s/n): ");
                    String aplicarDesconto = sc.nextLine();
                    if (aplicarDesconto.equalsIgnoreCase("s")) {
                        System.out.print("Digite o valor do desconto (%): ");
                        double desconto = sc.nextDouble();
                        sc.nextLine();
                        carro.mostrarDados(desconto);
                    } else {
                        carro.mostrarDados();
                    }
                    listaVeiculos.add(carro);
                    System.out.println("Veículo cadastrado com sucesso!");

                } else if (tipo == 2) {
                    System.out.print("Cilindradas: ");
                    int cilindradas = sc.nextInt();
                    sc.nextLine();
                    Moto moto = new Moto(placa, marca, preco, cilindradas);

                    System.out.print("Deseja visualizar em cavalos? (s/n): ");
                    String verEmCv = sc.nextLine();
                    boolean mostrarCv = verEmCv.equalsIgnoreCase("s");

                    System.out.print("Deseja aplicar um desconto? (s/n): ");
                    String aplicarDesconto = sc.nextLine();
                    if (aplicarDesconto.equalsIgnoreCase("s")) {
                        System.out.print("Digite o valor do desconto (%): ");
                        double desconto = sc.nextDouble();
                        sc.nextLine();
                        moto.mostrarDados(desconto);
                    } else {
                        moto.mostrarDados(mostrarCv);
                    }
                    listaVeiculos.add(moto);
                    System.out.println("Veículo cadastrado com sucesso!");

                } else if (tipo == 3) { // Caminhão
                    System.out.print("Capacidade de carga em toneladas: ");
                    double carga = sc.nextDouble();
                    sc.nextLine();
                    Caminhao cam = new Caminhao(placa, marca, preco, carga);

                    System.out.print("Deseja visualizar a carga em quilogramas? (s/n): ");
                    String verEmKg = sc.nextLine();
                    boolean emQuilos = verEmKg.equalsIgnoreCase("s");

                    System.out.print("Deseja aplicar um desconto? (s/n): ");
                    String aplicarDesconto = sc.nextLine();
                    if (aplicarDesconto.equalsIgnoreCase("s")) {
                        System.out.print("Digite o valor do desconto (%): ");
                        double desconto = sc.nextDouble();
                        sc.nextLine();
                        cam.mostrarDados(desconto);
                    } else {
                        cam.mostrarDados(emQuilos);
                    }
                    listaVeiculos.add(cam);
                    System.out.println("Veículo cadastrado com sucesso!");

                } else {
                    System.out.println("Tipo de veículo inválido!");
                }

            } else if (opcao == 2) {
                if (listaVeiculos.isEmpty()) {
                    System.out.println("Nenhum veículo cadastrado.");
                } else {
                    System.out.println("\n========= Veículos cadastrados =========");
                    for (Veiculo v : listaVeiculos) {
                        System.out.println("Tipo: " + v.getTipo());
                        v.mostrarDados();
                        System.out.println("---------------------------");
                    }
                }

            } else if (opcao == 3) {
                continuarCadastro = false;
                System.out.println("Saindo do Sistema...");

            } else {
                System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}
