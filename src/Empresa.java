//-------------------------------------------Imports--------------------------------------------------------------------

import java.time.LocalDate;
import java.util.ArrayList;


public class Empresa {

    private ArrayList<Funcionario> funcionarios = new ArrayList<>();        //Array de funcionarios

//-------------------------------------------Construtor-----------------------------------------------------------------

    public Empresa (){}
    public Empresa(ArrayList<Funcionario> funcionarios){
        this.funcionarios = funcionarios;                                   //recebe uma lista de funcionarios
    }

//-------------------------------------------Folha salarial(sem beneficios)---------------------------------------------

    public Float folha_salarial (LocalDate data_calc){
        float total = 0;
        for (int i = 0; i < this.funcionarios.size(); i++){
            Funcionario funcionario = this.funcionarios.get(i);
            if (!data_calc.isBefore(funcionario.data)){
                total += funcionario.getSalario(data_calc);
            }
        }
        return total;
    }

//-------------------------------------------Calculo do beneficio-------------------------------------------------------

    public Float benef_calc (LocalDate data_calc){
        float total = 0;
        for (int i = 0; i < this.funcionarios.size(); i++){
            Funcionario funcionario = this.funcionarios.get(i);
            if (!data_calc.isBefore(funcionario.data)){
                total += funcionario.benef_calc(data_calc);
            }
        }
        return total;
    }

//-------------------------------------------Total pago(folha salarial + beneficios)------------------------------------

    public Float totalPago (LocalDate data_calc){
        return this.folha_salarial(data_calc) + this.benef_calc(data_calc);
    }

//-------------------------------------------Quem recebeu maior valor---------------------------------------------------

    public Funcionario maior_total (LocalDate data_calc){
        Funcionario bem_pago = null;
        float maior_total = 0;
        for (int i = 0; i < this.funcionarios.size(); i++){
            float total = 0;
            Funcionario funcionario = this.funcionarios.get(i);
            if (!data_calc.isBefore(funcionario.data)){
                total += funcionario.benef_calc(data_calc);
                total += funcionario.getSalario(data_calc);
            }
            if (total > maior_total){
                maior_total = total;
                bem_pago = funcionario;
            }
        }
        return bem_pago;
    }

//-------------------------------------------Quem recebe maior beneficio------------------------------------------------

    public Funcionario maior_benef (LocalDate data_calc){
        Funcionario bem_benef = null;
        float maior_benef = 0;
        for (int i = 0; i < this.funcionarios.size(); i++){
            float total = 0;
            Funcionario funcionario = this.funcionarios.get(i);
            if (!data_calc.isBefore(funcionario.data)){
                total += funcionario.benef_calc(data_calc);
            }
            if (total > maior_benef){
                maior_benef = total;
                bem_benef = funcionario;
            }
        }
        return bem_benef;
    }

//-------------------------------------------Quem vendeu mais-----------------------------------------------------------

    public Vendedor maior_vendedor (LocalDate data_calc, ArrayList<Vendedor> vendedores){
        Vendedor best_seller = null;
        float maior_seller = 0;
        for (int i = 0; i < vendedores.size(); i++){
            float total = 0;
            Vendedor vendedor = vendedores.get(i);
            total += vendedor.getTotalVendas(data_calc);
            if (total > maior_seller){
                maior_seller = total;
                best_seller = vendedor;
            }
        }
        return best_seller;

    }

}
