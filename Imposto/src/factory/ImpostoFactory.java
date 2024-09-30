package factory;


import imposto.*;

public class ImpostoFactory {

    public Imposto getImposto(TipoImposto tipo) {
        switch (tipo) {
            case TIPOICMS:
                return new ICMS();
            case TIPOIPI:
                return new IPI();
            case TIPOISS:
                return new ISS();
            case TIPOPIS:
                return new PIS();
            default:
                throw new IllegalArgumentException("Tipo de imposto não existe ou é inválido");
        }
    }
}
