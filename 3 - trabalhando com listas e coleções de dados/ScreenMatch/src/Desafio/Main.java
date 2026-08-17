package Desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Cartao cartao = new Cartao();
        Compra compra = new Compra();

        boolean continuar = true;

        System.out.print("Digite o limite do seu cartão: ");
        double limite = teclado.nextInt();
        teclado.nextLine();
        cartao.setLimite(limite);

        while(continuar) {
            System.out.print("Digite o nome da compra que deseja efetuar: ");
            String carrinho = teclado.nextLine();
            compra.setCarrinho(carrinho);

            System.out.print("Digite o valor da compra: ");
            double valor = teclado.nextInt();
            compra.setValor(valor);
            System.out.println("Compra realizada!");

            System.out.println("Digite 0 para sair ou 1 para continuar");
            int acao = teclado.nextInt();
            if(acao == 1) {
                continuar = true;
            } else {
                continuar = false;
            }
        }
    }
}
