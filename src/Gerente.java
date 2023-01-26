//-------------------------------------------Imports--------------------------------------------------------------------

import java.time.LocalDate;

public class Gerente extends Funcionario{

//-------------------------------------------Declaracao de variaveis----------------------------------------------------

    private final float fixo = 20000;
    private final float bonus_ano = 3000;

//-------------------------------------------Criacao do cargo(Gerente)--------------------------------------------------

    public Gerente (String nome, LocalDate data){
        super(nome, data, "Gerente");
    }

//-------------------------------------------Calculo do salario(Gerente)------------------------------------------------

    public Float getSalario (LocalDate data_calc){
        return fixo + bonus_ano * ano_servico(data_calc);
    }

//-------------------------------------------Nao Recebe beneficio(Gerente)----------------------------------------------

    public Boolean recebe_benef (){
        return false;
    }

//-------------------------------------------Calculo do beneficio(Secretario)-------------------------------------------

    public Double benef_calc(LocalDate data_calc) {
        return 0.0;
    }       //beneficio = 0 (nao recebe beneficio)

}
