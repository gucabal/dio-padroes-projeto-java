package one.digitalinovation.gof.facade;

import one.digitalinovation.gof.subsistema1.crm.CrmService;
import one.digitalinovation.gof.subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getSingletonEager().recuperarCidade("06440000");
        String estado = CepApi.getSingletonEager().recuperarEstado("06440000");

        CrmService.gravarCliente(nome, cep, cidade, estado);


    }

}
