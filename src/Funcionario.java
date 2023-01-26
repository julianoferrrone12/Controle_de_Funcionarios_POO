//-------------------------------------------Imports--------------------------------------------------------------------

import java.time.LocalDate;


public abstract class Funcionario {

//-------------------------------------------Declaracao de variaveis----------------------------------------------------

    String nome;
    LocalDate data;
    String cargo;

//-------------------------------------------Construtor-----------------------------------------------------------------
    public Funcionario (String nome, LocalDate data, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
        this.data = data;
    }

//-------------------------------------------Criacao do Salario---------------------------------------------------------

    public abstract Float getSalario (LocalDate data_calc);

//-------------------------------------------Calculo dos anos de servico------------------------------------------------
    public int ano_servico (LocalDate data_calc){
        if (data_calc.isBefore(this.data)){
            return 0;
        }

        int tempo_contratacao = (((data_calc.getYear() - this.data.getYear()) * 12) +
                (data_calc.getMonthValue() - this.data.getMonthValue()))/12;
        return tempo_contratacao;
    }

//-------------------------------------------Criacao do beneficio-------------------------------------------------------

    public abstract Boolean recebe_benef ();

//-------------------------------------------Criacao do calculo do beneficio--------------------------------------------
    public abstract Double benef_calc (LocalDate data_calc);


    public String toString() {
        return "Nome: " + this.nome + " | " + "Cargo: " + this.cargo + " | " + " Mes/Ano de contratação: " + this.data + " | ";
    }
}
