//-------------------------------------------Imports--------------------------------------------------------------------

import java.time.LocalDate;
import java.util.ArrayList;


public class Vendedor extends Funcionario{

//-------------------------------------------Declaracao de variaveis----------------------------------------------------

    private final float fixo = 12000;
    private final float bonus_ano = 1800;


    private final ArrayList<Venda> vendas = new ArrayList<>();                //array de vendas

//-------------------------------------------Criacao do cargo(Vendedor)-----------------------------------------------

    public Vendedor (String nome, LocalDate data){super(nome, data, "Vendedor");}

//-------------------------------------------Calculo do salario(Vendedor)---------------------------------------------

    public Float getSalario (LocalDate data_calc){
        return fixo + bonus_ano * ano_servico(data_calc);
    }

//-------------------------------------------Recebe beneficio(Vendedor)-----------------------------------------------

    public Boolean recebe_benef (){
        return true;
    }

    public void addVenda(Venda venda){
        this.vendas.add(venda);
    }            //adiciona vendas

//-------------------------------------------Calculo do beneficio(Vendedor)-------------------------------------------

    public Double benef_calc(LocalDate data_calc) {
        return this.getTotalVendas(data_calc) * 0.3;
    }

//-------------------------------------------Calculo do total de vendas-------------------------------------------

    public Float getTotalVendas (LocalDate data_calc){
        float total = 0;
        for (int i = 0; i < this.vendas.size(); i++){
            Venda venda = this.vendas.get(i);
            if (venda.getData_venda().getMonth() == data_calc.getMonth() && venda.getData_venda().getYear() == data_calc.getYear()){
                total += venda.getValor();
            }
        }
        return total;
    }

}
