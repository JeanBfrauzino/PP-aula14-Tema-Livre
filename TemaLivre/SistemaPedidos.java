package TemaLivre;

public class SistemaPedidos {
    public static void main(String[] args) {
        // Simulando um usuário autenticado
        Pedido pedido = new PedidoProxy(true);
        pedido.adicionarItem("Notebook Gamer");
        pedido.adicionarItem("Mouse Gamer");

        // Adicionando desconto via Decorator
        Pedido pedidoComDesconto = new PedidoComDesconto(pedido, 10.0);

        // Finalizando o pedido via Facade
        PedidoFacade facade = new PedidoFacade(pedidoComDesconto);
        facade.finalizarPedido();
    }
}
