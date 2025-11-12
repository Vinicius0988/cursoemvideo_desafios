public class App {
    public static void main(String[] args) throws Exception {
        
        Contato contato = new Contato();

        contato.setNome("Tyrion");
        

        //criar o objeto endereco

        Endereco end = new Endereco();
        end.setNomeRua("Vielas da uva");
        end.setBairro("pobre");
        end.setCep("389893");
        end.setCidade("Kings Landing");
        end.setEstado("Westeros");
        end.setNumero("444");

        Telefone tel = new Telefone();
        tel.setDdd("47");
        tel.setNumero("89367362");
        tel.setTipo("celular"); 

        Telefone tel2 = new Telefone();
        tel2.setDdd("48");
        tel2.setNumero("89367432");
        tel2.setTipo("orelhao"); 

        contato.setEndereco(end);
        
        Telefone[] telefones = new Telefone[2];

        telefones[0] = tel;
        telefones[1] = tel2;

        contato.setTelefones(telefones);

        System.out.println(contato.getNome());

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getBairro());
        }
        
        if (contato != null && contato.getTelefones() != null) {
           for (Telefone t : contato.getTelefones()) {
            System.out.println(t.getDdd() + t.getNumero());
           }
        }
    }
}
