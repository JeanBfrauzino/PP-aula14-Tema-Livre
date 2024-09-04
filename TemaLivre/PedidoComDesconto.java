package TemaLivre;

public class PedidoComDesconto extends PedidoDecorator {
    private double desconto;

    public PedidoComDesconto(Pedido pedido, double desconto) {
        super(pedido);
        this.desconto = desconto;
    }

    @Override
    public void mostrarPedido() {
        super.mostrarPedido();
        System.out.println("Desconto aplicado: " + desconto + "%");
    }
}

