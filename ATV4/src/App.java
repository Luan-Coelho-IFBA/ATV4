public class App {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco("Luan", "Lucas", "Pedro");

        banco.creditar("Luan", 50);
        banco.creditar("Lucas", 50);
        banco.creditar("Pedro", 50);

        banco.debitar("Lucas", 20);

        banco.transferir("Pedro", "Luan", 30);

        System.out.println(banco.getSaldo("Luan"));
        System.out.println(banco.getSaldo("Lucas"));
        System.out.println(banco.getSaldo("Pedro"));
    }
}
