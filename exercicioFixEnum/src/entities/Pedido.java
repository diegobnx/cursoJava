package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Enum.StatusPedido;

public class Pedido {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date data;
	private StatusPedido status;
	private List<ItensPedido> itens = new ArrayList<>();
	private Cliente client;
	
	public Pedido(Date data, StatusPedido status, Cliente cliente) {
		
		this.data = data;
		this.status = status;
		this.client = cliente;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public StatusPedido getStatusPedido() {
		return status;
	}
	
	public void setStatusPedido(StatusPedido status) {
		this.status = status;
	}
	
	public Cliente getCliente() {
		return client;
	}
	
	public void setCliente(Cliente cliente) {
		this.client = cliente;
	}

	public List<ItensPedido> getItens(){
		return itens;
	}
	
	public void addItem(ItensPedido item) {
		itens.add(item);
	}
	
	public void removeItem(ItensPedido item) {
		itens.remove(item);
	}
	
	public Double total() {
		double sum = 0;
		for (ItensPedido item : itens) {
			sum += item.subTotal();
		}
		return sum;
	}
	
	@Override	
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("Dados do Pedido: ");
		sb.append(sdf.format(data) + "\n");
		sb.append("Status: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(client + "\n");
		sb.append("Itens do Pedido:\n");
		for (ItensPedido item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Preço Total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();

	}
}
