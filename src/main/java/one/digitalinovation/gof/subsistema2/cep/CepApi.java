package one.digitalinovation.gof.subsistema2.cep;

import one.digitalinovation.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi singletonLazy =  new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getSingletonEager(){
        return singletonLazy;
    }

    public String recuperarCidade(String cep){
        return "Barueri";

    }

    public String recuperarEstado(String cep){
        return "SP";

    }
}
