public class Administrador extends Empregado{
    private double ajudaDeCusto;

    @Override
    public double calcularSalario(){
        //A ajuda de custo tem caráter indenizatório e não é integrada
        // ao salário do funcionário; sendo assim, não há incidência de impostos para fins tributários e previdenciários.Jan 8, 2024 :)
        return (getSalarioBase() - (getImposto() /100.0)* getSalarioBase())+getAjudaDeCusto();
    }

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

}
//Implemente a classe Administrador como subclasse da classe
//Empregado. Um determinado administrador tem como atributos,
//para além dos atributos da classe Pessoa e da classe Empregado,
//o atributo ajudaDeCusto (ajudas referentes a viagens, estadias,
//...). Note que deverá redefinir na classe Administrador o método
//herdado calcularSalario (o salário de um administrador é
//        equivalente ao salário de um empregado usual acrescido das
//        ajuda de custo). Escreva um programa de teste adequado para
//esta classe.