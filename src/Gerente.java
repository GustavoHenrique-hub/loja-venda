public class Gerente extends Funcionario {

    private String senha;

    public Gerente(String nome, String cpf, Double salario, Integer id, String senha) {
        super(nome, cpf, salario, id);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public Boolean autenticaSenha(String senha) {
        if (this.senha.equals(senha)) {
            return true;
        } else {
            return false;
        }
    }

}
