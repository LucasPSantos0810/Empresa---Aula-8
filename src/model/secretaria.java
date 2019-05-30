package model;

public class secretaria extends funcionario {
	private long departamento;
	private long ramal;
	private String agenda;
	
	public String getAgenda() {
		return agenda;
	}
	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}
	public long getDepartamento() {
		return departamento;
	}
	public void setDepartamento(long departamento) {
		this.departamento = departamento;
	}
	public long getRamal() {
		return ramal;
	}
	public void setRamal(long ramal) {
		this.ramal = ramal;
	}

}
