package TemaLivre;

public abstract class PedidoDecorator implements Pedido {
    protected Pedido pedido;

    public PedidoDecorator(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void adicionarItem(String item) {
        pedido.adicionarItem(item);
    }

    @Override
    public void mostrarPedido() {
        pedido.mostrarPedido();
    }
}

