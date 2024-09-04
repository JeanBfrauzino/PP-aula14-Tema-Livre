package TemaLivre;

public class PedidoFacade {
    private Pedido pedido;

    public PedidoFacade(Pedido pedido) {
        this.pedido = pedido;
    }

    public void finalizarPedido() {
        System.out.println("Finalizando pedido...");
        pedido.mostrarPedido();
        System.out.println("Pedido finalizado com sucesso!");
    }
}
