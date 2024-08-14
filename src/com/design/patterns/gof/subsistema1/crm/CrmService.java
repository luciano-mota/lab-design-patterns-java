package com.design.patterns.gof.subsistema1.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Client salvo no sistema de CRM: " + nome + " " + cep + " " + cidade + " " + estado);
    }
}
