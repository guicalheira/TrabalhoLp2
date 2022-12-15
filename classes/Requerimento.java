package classes;

import java.util.Date;

import javafx.scene.control.TextField;

public class Requerimento {
		String numeroProtocolo;
		int numeroMatricula;
		Date data;
		String tipoSolicitacao;
		String observacao;
		String status;

		public Requerimento(String numeroProtocolo, int numeroMatricula, Date data,String tipoSolicitacao, String observacao, String status) {
	        this.numeroProtocolo = numeroProtocolo;
			this.numeroMatricula = numeroMatricula;
			this.data = data;
			this.tipoSolicitacao = tipoSolicitacao;
			this.observacao = observacao;
			this.status = status;
		}

	
		


		public static String geraNumeroProtocolo() {
			String numeroProtocolo = GeradorProtocolo.getProximoIdentificador();
			return numeroProtocolo;
		}

		public String alterarStatus(String status) {
			this.status = status;
			return status;
		}
		
		// G&Ss

		public String getTipoSolicitacao() {
			return tipoSolicitacao;
		}

		public void setTipoSolicitacao(String tipoSolicitacao) {
			this.tipoSolicitacao = tipoSolicitacao;
		}

		public void setObservacao(String observacao) {
			this.observacao = observacao;
		}

		public String getNumeroProtocolo() {
			return numeroProtocolo;
		}
	  
		public int getNumeroMatricula() {
			return numeroMatricula;
		}

		public void setNumeroMatricula(int numeroMatricula) {
			this.numeroMatricula = numeroMatricula;
		}

		public Date getData() {
			return data;
		}

		public void setData(Date data) {
			this.data = data;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getObservacao() {
			return observacao;
		}
}
