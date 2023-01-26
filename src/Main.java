//-------------------------------------------Imports--------------------------------------------------------------------
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


//-------------------------------------------Cargos e data de Contratação-----------------------------------------------

        Secretario Jorge_Carvalho = new Secretario("Jorge Carvalho", LocalDate.of(2018, 1, 1));
        Secretario Maria_Souza = new Secretario("Maria Souza", LocalDate.of(2015, 12, 1));
        Vendedor Ana_Silva = new Vendedor("Ana Silva", LocalDate.of(2021, 12, 1));
        Vendedor Joao_Mendes = new Vendedor("Joao Mendes", LocalDate.of(2021, 12, 1));
        Gerente Juliana_Alves = new Gerente("Juliana Alves", LocalDate.of(2017, 7, 1));
        Gerente Bento_Albino = new Gerente("Bento Albino", LocalDate.of(2014, 3, 1));

//------------------------------------------Registro de Vendas----------------------------------------------------------

        Ana_Silva.addVenda(new Venda(LocalDate.of(2021, 12, 1), 5200.00));
        Joao_Mendes.addVenda(new Venda(LocalDate.of(2021, 12, 1), 3400.00));
        Ana_Silva.addVenda(new Venda(LocalDate.of(2022, 1, 1), 4000.00));
        Joao_Mendes.addVenda(new Venda(LocalDate.of(2022, 1, 1), 7700.00));
        Ana_Silva.addVenda(new Venda(LocalDate.of(2022, 2, 1), 4200.00));
        Joao_Mendes.addVenda(new Venda(LocalDate.of(2022, 2, 1), 5000.00));
        Ana_Silva.addVenda(new Venda(LocalDate.of(2022, 3, 1), 5850.00));
        Joao_Mendes.addVenda(new Venda(LocalDate.of(2022, 3, 1), 5900.00));
        Ana_Silva.addVenda(new Venda(LocalDate.of(2022, 4, 1), 7000.00));
        Joao_Mendes.addVenda(new Venda(LocalDate.of(2022, 4, 1), 6500.00));

//------------------------------------------Adicionando lista de Funcionarios-------------------------------------------

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(Jorge_Carvalho);
        funcionarios.add(Maria_Souza);
        funcionarios.add(Ana_Silva);
        funcionarios.add(Joao_Mendes);
        funcionarios.add(Juliana_Alves);
        funcionarios.add(Bento_Albino);

//-----------------------------------------Lista de funcionarios vendedores---------------------------------------------

        ArrayList<Vendedor> vendedores = new ArrayList<>();

        vendedores.add(Ana_Silva);
        vendedores.add(Joao_Mendes);

//-----------------------------------------Input de Data para consulta--------------------------------------------------

        LocalDate data = LocalDate.of(2022, 1, 1); //Insira aqui a data para a consulta

//----------------------------------------Para a tela de exibicao-------------------------------------------------------

        Empresa empresa = new Empresa(funcionarios);
        System.out.println("O valor da folha salarial foi de: " + empresa.folha_salarial(data));
        System.out.println("O valor do total de beneficios pagos foi de: " + empresa.benef_calc(data));
        System.out.println("O funcionario que recebeu o maior valor de beneficio foi o(a): " + empresa.maior_benef(data));
        System.out.println("O funcionario que recebeu a maior quantia de dinheiro foi o(a): " + empresa.maior_total(data));
        System.out.println("O total pago aos funcionarios no mes foi de: " + empresa.totalPago(data));
        System.out.println("O vendedor que faturou a maior quantia em vendas para a empresa foi o(a): " + empresa.maior_vendedor(data, vendedores));

    }

}
