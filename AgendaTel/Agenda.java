package POO.AgendaTel;

public class Agenda {
    private String nome;
    private Contato[] contatos;

    public Agenda() {
    }

    public Agenda(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato[] getContatos() {
        return this.contatos;
    }

    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public String obterInfo(){
        String info = "Agenda - " + nome + "\n";

        if (contatos != null) {
            for (Contato c : contatos){
                info += c.obterInfo() + "\n";
            }
        }
        return info;
    }

}
