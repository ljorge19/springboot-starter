package br.com.fiap.model;




public class PedidoDto {

	private Long idPedido;
	private String nomeCliente;
	private String itemAdquirido;
	
	/* 
	 email, 
	 Nome
	 completo e 
	 shipping address, 
	 id do pedido, 
	 descrição de cada item do pedido,
	 quantidade de itens do pedido, 
	 preço unitário de cada item, 
	 preço total do
	 pagamento, 
	 forma de pagamento, 
	 data do pedido e status do pedido
	*/
	
	
	/**
	 * @return the idPedido
	 */
	public Long getIdPedido() {
		return idPedido;
	}
	/**
	 * @param idPedido the idPedido to set
	 */
	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}
	/**
	 * @return the nomeCliente
	 */
	public String getNomeCliente() {
		return nomeCliente;
	}
	/**
	 * @param nomeCliente the nomeCliente to set
	 */
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	/**
	 * @return the itemAdquirido
	 */
	public String getItemAdquirido() {
		return itemAdquirido;
	}
	/**
	 * @param itemAdquirido the itemAdquirido to set
	 */
	public void setItemAdquirido(String itemAdquirido) {
		this.itemAdquirido = itemAdquirido;
	}
	
	
	
	
}
