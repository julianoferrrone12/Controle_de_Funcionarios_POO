//-------------------------------------------Imports--------------------------------------------------------------------

import java.time.LocalDate;

public class Secretario extends Funcionario{

//-------------------------------------------Declaracao de variaveis----------------------------------------------------

    private final float fixo = 7000;
    private final float bonus_ano = 1000;

//-------------------------------------------Criacao do cargo(Secretario)-----------------------------------------------

    public Secretario (String nome, LocalDate data){
        super(nome, data, "Secretario");
    }

//-------------------------------------------Calculo do salario(Secretario)---------------------------------------------

    public Float getSalario (LocalDate data_calc){
        return fixo + bonus_ano * ano_servico(data_calc);
    }

//-------------------------------------------Recebe beneficio(Secretario)-----------------------------------------------

    public Boolean recebe_benef (){
        return true;
    }

//-------------------------------------------Calculo do beneficio(Secretario)-------------------------------------------

    public Double benef_calc(LocalDate data_calc) {
        return this.getSalario(data_calc)*0.2;
    }

}
