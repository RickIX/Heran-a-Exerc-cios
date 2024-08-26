public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ricardo", "Rua Jiriboca 78", "4199548918");
        Fornecedor f1 = new Fornecedor("Ricardo", "Rua Jiriboca 78", "4199548918", 5300, 2500);
        Empregado e1 = new Empregado("Ricardo", "Rua Jiriboca 78", "4199548918", 10, 2100, 22.5);
        Administrador admin1 = new Administrador("Ricardo", "Rua Jiriboca 78", "4199548918", 10, 2100,
                22.5, 1412);
        Operario operario = new Operario("Ricardo", "Rua Jiriboca 78", "4199548918", 10, 2100,
                22.5, 10, 5);
        Vendedor vendedor = new Vendedor("Ricardo", "Rua Jiriboca 78", "4199548918", 10, 2100,
                22.5, 10, 5);

        System.out.println("Pessoa\n"+p1.getNome()+"\nEndereço "+p1.getEndereco()+ "\nNúmero de Telefone "+p1.getTelefone()+"\n");
        System.out.println("Fornecedor\n"+"Nome Endividados: "+ f1.getNome()+"\nEndereço "+f1.getEndereco()+"\nTelefone "+f1.getTelefone()+"\n" +"Saldo:"+ f1.obterSaldo());
        System.out.println("\nDados Empregado\nSalário Líquido: " + e1.calcularSalario() + "\nCodigo Setor: " +
                e1.getCodigoSetor() + "\nSalário Bruto: " + e1.getSalarioBase() + "\nPorcentagem de Impostos: " + e1.getImposto());
        System.out.println("\nAdministrador " + admin1.getNome()+":" + "\nSalário Líquido: " + admin1.calcularSalario() + "\nCodigo Setor: " +
                admin1.getCodigoSetor() + "\nSalário Bruto: " + admin1.getSalarioBase() + "\nPorcentagem de Impostos: " + admin1.getImposto() +
                "\nAjuda de custo:" + admin1.getAjudaDeCusto());
        System.out.println("\nOperário " + operario.getNome()+":" + "\nSalário Líquido: " + operario.calcularSalario() + "\nCodigo Setor: " +
                operario.getCodigoSetor() + "\nSalário Bruto: " + operario.getSalarioBase() + "\nPorcentagem de Impostos: " + operario.getImposto()
        + "\nValor de produção = " + operario.getValorProducao() + "\n% de Comissão " + operario.getComissao());
        System.out.println("\nVendedor " + vendedor.getNome()+":" + "\nSalário Líquido: " + vendedor.calcularSalario() + "\nCodigo Setor: " +
                vendedor.getCodigoSetor() + "\nSalário Bruto: " + vendedor.getSalarioBase() + "\nPorcentagem de Impostos: " + vendedor.getImposto()
                + "\nValor de Venda = " + vendedor.getValorVendas() + "\n% de Comissão " + vendedor.getComissao());
    }
}


