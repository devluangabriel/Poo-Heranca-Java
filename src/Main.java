import Pessoas.Clientes;

public class Main {
    public static void main(String[] args) {


        Clientes clientes = new Clientes();

        //Acessando a class clientes que herda todos os métodos da classe Pessoa(Mãe).
        clientes.setNome("João");
        clientes.setAge(58);

        //Acessando atributo da propria class clientes.
        clientes.setVoucher(5);

        //Exibindo no console os dados setados.
        System.out.println(clientes.getNome());
        System.out.println(clientes.getAge());
        System.out.println(clientes.getVoucher());


    }
}