package test;

public class TestCuentaConCliente {

    public static void main(String[] args) {
        Cliente diego = new Cliente();
       

        Cuenta cuentaDeDiego = new Cuenta();
        cuentaDeDiego.deposita(100);

        // cuentaDeDiego.titular = diego;
        cuentaDeDiego.setTitular(diego);
        System.out.println(cuentaDeDiego.getTitular().getNombre());
    }
    
}
