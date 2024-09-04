package TemaLivre;

import java.util.ArrayList;
import java.util.List;

public class PedidoReal implements Pedido {
    private List<String> itens = new ArrayList<>();

    @Override
    public void adicionarItem(String item) {
        itens.add(item);
        System.out.println(item + " adicionado ao pedido.");
    }

    @Override
    public void mostrarPedido() {
        System.out.println("Pedido: " + itens);
    }
}

