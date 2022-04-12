package br.edu.utfpr.dv.sireata.model;

import java.util.ArrayList;
import java.util.List;

public class AtaReport {
	
	public String departamento;
	public String orgao;
	public String numero;
	public String dataHora;
	public String local;
	public List<ParticipanteReport> participantesMembros;
	public List<ParticipanteReport> demaisParticipantes;
	public String presidente;
	public String secretario;
	public String texto;
	
	public AtaReport(){
		this.setDepartamento("");
		this.setOrgao("");
		this.setNumero("");
		this.setDataHora("");
		this.setLocal("");
		this.setParticipantesMembros(new ArrayList<ParticipanteReport>());
		this.setDemaisParticipantes(new ArrayList<ParticipanteReport>());
		this.setPresidente("");
		this.setSecretario("");
		this.setTexto("");
	}
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getOrgao() {
		return orgao;
	}
	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDataHora() {
		return dataHora;
	}
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public List<ParticipanteReport> getParticipantesMembros() {
		return participantesMembros;
	}
	public String getStringParticipantesMembros(){

		List<ParticipanteReport> listParticipante = this.getParticipantesMembros();
		boolean auxiliar = (listParticipante != null) && (listParticipante.size() > 0) ? true : false;

		if(auxiliar){
			String retorno = listParticipante.get(0).getNome();
			
			for(int i = 1; i < listParticipante.size(); i++){
				retorno += ", " + listParticipante.get(i).getNome();
			}
			
			retorno += ".";
			
			return retorno;
		}else{
			return "";
		}
	}
	public void setParticipantesMembros(List<ParticipanteReport> participantesMembros) {
		this.participantesMembros = participantesMembros;
	}
	public String getStringDemaisParticipantes(){

		List<ParticipanteReport> listDemaisParicipantes = this.getDemaisParticipantes();
		boolean auxiliar = (listDemaisParicipantes != null) && (listDemaisParicipantes.size() > 0) ? true : false;

		if(auxiliar){
			String retorno = listDemaisParicipantes.get(0).getNome();
			
			for(int i = 1; i < listDemaisParicipantes.size(); i++){
				retorno += ", " + listDemaisParicipantes.get(i).getNome();
			}
			
			retorno += ".";
			
			return retorno;
		}else{
			return "";
		}
	}
	public List<ParticipanteReport> getDemaisParticipantes() {
		return demaisParticipantes;
	}
	public void setDemaisParticipantes(List<ParticipanteReport> demaisParticipantes) {
		this.demaisParticipantes = demaisParticipantes;
	}
	public String getPresidente() {
		return presidente;
	}
	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}
	public String getSecretario() {
		return secretario;
	}
	public void setSecretario(String secretario) {
		this.secretario = secretario;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}

}
