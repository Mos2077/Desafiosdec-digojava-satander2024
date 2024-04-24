import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Transacao {
    private String tipo;
    private double valor;

    public Transacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return tipo + " de " + valor;
    }
}

public class RegistroTransacoesBancarias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();
        scanner.nextLine(); // consume newline

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 0; i < quantidadeTransacoes; i++) {
            String tipoTransacao = scanner.nextLine().toUpperCase();
            double valorTransacao = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            if (tipoTransacao.equals("D")) {
                saldo += valorTransacao;
                transacoes.add(new Transacao("Deposito", valorTransacao));
            } else if (tipoTransacao.equals("S")) {
                saldo -= valorTransacao;
                transacoes.add(new Transacao("Saque", valorTransacao));
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--;
            }
        }

        System.out.println("\nSaldo: " + saldo);
        System.out.println("\nTransacoes:");
        for (int i = 0; i < transacoes.size(); i++) {
            System.out.println((i + 1) + ". " + transacoes.get(i));
        }

        scanner.close();
    }
}
