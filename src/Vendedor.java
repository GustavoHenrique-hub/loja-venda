public class Vendedor extends Funcionario{
    private Double valorVendido;
    private Double meta;
    public Vendedor(String nome, String cpf, Double salario, Integer id, Double meta, Double valorVendido){
        super(nome, cpf, salario, id);
        this.meta = meta;
        this.valorVendido = valorVendido;
    }

    public Double getValorVendido() {
        return valorVendido;
    }

    public Double getMeta() {
        return meta;
    }


    public Double getSalarioFinal(){
        if(this.valorVendido >= this.meta){
            return super.getSalario() + (this.valorVendido * 1.1);
        }else {
            return super.getSalario()  + this.valorVendido;
        }
    }
}
