package com.projeto.aluno.enums;

public enum Status {
	
	ATIVO("ativo"),
	INATIVO("inativo"),
	TRANCADO("Trancado"),
	CANCELADO("cancelado");
	
	private String status;
	
	private Status (String status) {
		this.status = status;	}

}
