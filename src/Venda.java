//-------------------------------------------Imports--------------------------------------------------------------------

import java.time.LocalDate;

public class Venda {

//-------------------------------------------Declaracao de variaveis----------------------------------------------------

    private final LocalDate data_venda;
    private final Double valor;

//-------------------------------------------Construtor-----------------------------------------------------------------

    public Venda(LocalDate data_venda, Double valor){
        this.data_venda = data_venda;                  //data da venda
        this.valor = valor;                           //valor da venda
    }

//-------------------------------------------Recebe valor da venda------------------------------------------------------

    public Double getValor(){
        return this.valor;
    }

//-------------------------------------------Recebe data da venda-------------------------------------------------------
    public LocalDate getData_venda(){
        return this.data_venda;
    }
}
