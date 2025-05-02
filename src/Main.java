import Pessoas.Clientes;

public class Main {
    public static void main(String[] args) {


        Clientes clientes = new Clientes();


        clientes.setNome("João");
        clientes.setAge(58);
        clientes.setVoucher(5);
        System.out.println(clientes.getNome());
        System.out.println(clientes.getAge());
        System.out.println(clientes.getVoucher());


    }
}