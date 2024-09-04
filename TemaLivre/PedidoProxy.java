package TemaLivre;

public class PedidoProxy implements Pedido {
    private PedidoReal pedidoReal;
    private boolean autenticado;

    public PedidoProxy(boolean autenticado) {
        this.autenticado = autenticado;
        this.pedidoReal = new PedidoReal();
    }

    @Override
    public void adicionarItem(String item) {
        if (autenticado) {
            pedidoReal.adicionarItem(item);
        } else {
            System.out.println("Acesso negado! Usuário não autenticado.");
        }
    }

    @Override
    public void mostrarPedido() {
        if (autenticado) {
            pedidoReal.mostrarPedido();
        } else {
            System.out.println("Acesso negado! Usuário não autenticado.");
        }
    }
}
