package PatterFactory;

public class IcmsFactory {
    public CalculoPorRegiao getIcmsPorRegiao(String nomeEstado) {
        if(nomeEstado.equalsIgnoreCase("ICMS_MGs")){
            return new IcmsMG();
        } else if(nomeEstado.equalsIgnoreCase("ICMS_SP")){
            return new IcmsSP();
        } else {
            System.out.println("Valor invalido - ICMS nao cadastrado.");
            return null;
        }
    }
}
