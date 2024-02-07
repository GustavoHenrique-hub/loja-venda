public class Funcionario {

    private String nome;
    private String cpf;
    private Double salario;
    private Integer id;

    public Funcionario(String nome, String cpf, Double salario, Integer id){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.id = id;
    }

    public String getNome() {

        return nome;
    }
    public String getCpf() {

        return cpf;
    }
    public Double getSalario() {

        return salario;
    }
    public Integer getId() {
        return id;
    }
}
