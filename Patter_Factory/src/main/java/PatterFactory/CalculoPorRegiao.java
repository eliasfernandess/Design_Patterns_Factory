package PatterFactory;

import modelo.Orcamento;

import java.math.BigDecimal;

public interface CalculoPorRegiao {
    public BigDecimal calcularPorRegiao(Orcamento orcamento);

}
