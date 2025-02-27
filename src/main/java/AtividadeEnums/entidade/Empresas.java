package AtividadeEnums.entidade;

import java.util.ArrayList;
import java.util.List;

public class Empresas {
    private List<Pedidos> pedidos;

    public Empresas() {
        pedidos = new ArrayList<>();
    }

    // Método para adicionar pedido
    public void adicionarPedido(Pedidos pedido) {
        pedidos.add(pedido);
    }

    // Método para buscar pedido por código
    public Pedidos buscarPedido(String codigo) {
        for (Pedidos pedido : pedidos) {
            if (pedido.getCodigo().equals(codigo)) {
                return pedido;
            }
        }
        return null;
    }
}
