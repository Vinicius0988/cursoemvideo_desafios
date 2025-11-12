public class App {
    public static void main(String[] args) throws Exception {
        
        Agenda agen1 = new Agenda();

        agen1.setNome("Amigos");

        Contato cont1 = new Contato();
        Contato cont2 = new Contato();

        cont1.setNome("Jose");
        cont1.setEmail("Jose123@gmail.com");
        cont1.setTelefone("5753755893");

        cont2.setNome("Maria");
        cont2.setEmail("maria123@gmail.com");
        cont2.setTelefone("7472982993");

        Contato[] contatosArray = new Contato[2];

        contatosArray[0] = cont1;
        contatosArray[1] = cont2;

        agen1.setContatos(contatosArray);

        System.out.println(agen1.toString());
    }
}
