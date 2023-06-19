package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItems;
import entities.Payment;

public class Program {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<OrderItems> orderItems = new ArrayList<>();
        Order order = new Order(null, null, null, null, null, null);

        System.out.println("Bem vindo ao DropperInteractive!");
        System.out.println("Aqui conectamos você aos melhores fornecedores do mercado");
        System.out.println();

        System.out.println("Vamos para a tela de cadastros: ");
        System.out.print("Enter name: ");
        String clientName = sc.nextLine();
        System.out.print("Enter email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Enter UserName: ");
        String user = sc.next();
        System.out.print("Enter birthday (dd/MM/yyyy): ");
        Date sfd = sdf.parse(sc.next());
        System.out.print("Enter password: ");
        String pass = sc.next();
        Client client = new Client(clientName, clientEmail, sfd, user, pass, order);

        System.out.println();
        System.out.println("----- Login ------");
        System.out.println("Entre com o usuário: ");
        String userNow = sc.next();
        System.out.println("Entre com a senha: ");
        String passNow = sc.next();
        System.out.println("-------------------");
        System.out.println();
        if (!passNow.equals(client.getPassword())) {
            System.out.println("Acesso negado, usuário ou senha inválida.");
            System.out.println();
            System.out.print("Tente a senha novamente: ");
            passNow = sc.next();
            if (passNow.equals(client.getPassword())) {
                System.out.println("Liberado.");
            }
        }

        if (userNow.equalsIgnoreCase(client.getUserName()) && passNow.equals(client.getPassword())) {
            System.out.println("Acesso liberado, bem vindo: " + client.getUserName());
            System.out.println(
                    "Temos disponíveis para o senhor os seguintes produtos, digite o número do produto que deseja comprar: ");
            System.out.println(" 1 - CELULAR APPLE IPHONE 12 - 1800");
            System.out.println(" 2 - TV SMART SAMSUNG GTX - 20000");
            System.out.println(" 3 - CELULAR XIAOMI REDMI 8 - 4000");
            System.out.println(" 4 - CELULAR APPLE IPHONE 13 PRO MAX - 25000 ");
            System.out.println(" 5 - VIDEO GAME PLAYSTATION - 5000");
            System.out.println();

            // Consumir a nova linha em branco
            sc.nextLine();

            String escolha = sc.nextLine();

            if (escolha.equals("1")) {
                System.out.println();
                Double initialMoney = client.getMoney();
                System.out.println("Seu Saldo no App: " + initialMoney);
                System.out.println("Para confirmar, entre com as informações do produto: ");
                System.out.println("Product Name: ");
                String prodName1 = sc.nextLine();
                System.out.println("Product type: ");
                String type = sc.nextLine();
                System.out.println("Quantidade de items a serem comprados: ");
                int quantityItems = sc.nextInt();
                System.out.println("Product price: ");
                double price = Double.parseDouble(sc.next());
                System.out.println();
                System.out.println("");
                order = new Order(prodName1, type, null, initialMoney, client, null);
                System.out.println("Your SubTotal product: " + order.subTotal1(quantityItems, price));
                
                sc.nextLine();
                
                System.out.println("Status do Pedido: " + new Payment().confirmPaym().AGUARDANDO);
                System.out.println();

                System.out.println(
                        "Você tem certeza que deseja comprar, aceitando o dinheiro será descontado do seu saldo: y/n ");
                String confirm = sc.nextLine();
                if (confirm.equals("y")) {
                    Double descounted;
                    descounted = initialMoney - order.subTotal1(quantityItems, price);
                    System.out.println();
                    System.out.println("Saldo atual = " + descounted + " = " + new Payment().confirmPaym());
                    System.out.println();
                    System.out.println(order.notaFiscal());

                } else if (confirm.equals("n")) {
                    System.out.println("");
                    System.out.println("Seu saldo atual é de: " + initialMoney + new Payment().failed());
                    order = new Order(confirm, type, null, initialMoney, client, null); // Adicionar esta linha para inicializar o objeto 'order' com a sobrecarga
                }
            }
        }
    }
}
