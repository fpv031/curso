package AtividadeEnums.entidade;

import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empresas empresa = new Empresas();

        Produtos produto1 = new Produtos("Cadeira de escritório", 350.0);
        Produtos produto2 = new Produtos("Teclado mecânico", 200.0);
        Produtos produto3 = new Produtos("Monitor 24 polegadas", 1200.0);

        Pedidos pedido1 = new Pedidos("PED123", produto1, Status.PENDENTE);
        Pedidos pedido2 = new Pedidos("PED124", produto2, Status.EM_ROTA);
        Pedidos pedido3 = new Pedidos("PED125", produto3, Status.ENTREGUE);
        Pedidos pedido4 = new Pedidos("PED126", produto1, Status.CANCELADO);

        empresa.adicionarPedido(pedido1);
        empresa.adicionarPedido(pedido2);
        empresa.adicionarPedido(pedido3);
        empresa.adicionarPedido(pedido4);

        System.out.print("Digite o código do pedido: ");
        String codigoPedido = sc.nextLine();

        Pedidos pedidoEncontrado = empresa.buscarPedido(codigoPedido);

        if (pedidoEncontrado != null) {
            System.out.println("Pedido encontrado: " + pedidoEncontrado);
        } else {
            System.out.println("Pedido não encontrado!");
        }
    }
}
