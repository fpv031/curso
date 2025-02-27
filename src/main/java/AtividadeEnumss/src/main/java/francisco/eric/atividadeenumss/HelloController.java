package francisco.eric.atividadeenumss;

import francisco.eric.atividadeenumss.Classes.Empresas;
import francisco.eric.atividadeenumss.Classes.Pedidos;
import francisco.eric.atividadeenumss.Classes.Produtos;
import francisco.eric.atividadeenumss.Classes.Status;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField codigoPedidoField;

    private Empresas empresas;

    public HelloController() {
        empresas = new Empresas();

        // Adicionando produtos e pedidos à empresa
        Produtos produto1 = new Produtos("Cadeira de escritório", 350.0);
        Produtos produto2 = new Produtos("Teclado mecânico", 200.0);
        Produtos produto3 = new Produtos("Monitor 24 polegadas", 1200.0);

        Pedidos pedido1 = new Pedidos("PED123", produto1, Status.PENDENTE);
        Pedidos pedido2 = new Pedidos("PED124", produto2, Status.EM_ROTA);
        Pedidos pedido3 = new Pedidos("PED125", produto3, Status.ENTREGUE);
        Pedidos pedido4 = new Pedidos("PED126", produto1, Status.CANCELADO);

        empresas.adicionarPedido(pedido1);
        empresas.adicionarPedido(pedido2);
        empresas.adicionarPedido(pedido3);
        empresas.adicionarPedido(pedido4);
    }

    @FXML
    public void onBuscarPedido(ActionEvent event) {
        String codigoPedido = codigoPedidoField.getText().trim();

        if (codigoPedido.isEmpty()) {
            exibirAlerta("Erro", "Código de pedido vazio!", "Por favor, insira um código válido.");
            return;
        }

        Pedidos pedidoEncontrado = empresas.buscarPedido(codigoPedido);

        if (pedidoEncontrado != null) {
            exibirAlerta("Pedido Encontrado", "Pedido encontrado com sucesso!", pedidoEncontrado.toString());
        } else {
            exibirAlerta("Pedido Não Encontrado", "Não foi possível encontrar o pedido.", "Verifique o código digitado.");
        }
    }

    private void exibirAlerta(String titulo, String cabecalho, String mensagem) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(cabecalho);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}
