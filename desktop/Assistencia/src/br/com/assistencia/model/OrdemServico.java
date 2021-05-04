package br.com.assistencia.model;

import java.sql.Timestamp;

public class OrdemServico {

	private long idOrdemDeServico;
	private Cliente idCliente;
	private Equipamento idEquipamento;
	private Usuario idUsuario;
	private String status;
	private String orcamento;
	private String diagnostico;
	private String observacao;
	private Timestamp data_entrada;
	private Timestamp data_saida;

	public OrdemServico() {
		this.idCliente = new Cliente();
		this.idEquipamento = new Equipamento();
		this.idUsuario = new Usuario();
	}
	
	public long getIdOrdemDeServico() {
		return idOrdemDeServico;
	}

	public void setIdOrdemDeServico(long idOrdemDeServico) {
		this.idOrdemDeServico = idOrdemDeServico;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	public Equipamento getIdEquipamento() {
		return idEquipamento;
	}

	public void setIdEquipamento(Equipamento idEquipamento) {
		this.idEquipamento = idEquipamento;
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(String orcamento) {
		this.orcamento = orcamento;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Timestamp getData_entrada() {
		return data_entrada;
	}

	public void setData_entrada(Timestamp data_entrada) {
		this.data_entrada = data_entrada;
	}

	public Timestamp getData_saida() {
		return data_saida;
	}

	public void setData_saida(Timestamp data_saida) {
		this.data_saida = data_saida;
	}

}
