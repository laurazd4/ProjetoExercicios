package ListaDoisEntradaSaida;

class Exercicio18 {
	public static void main(String[] args) {

		double compraAcoes = 32.87;
		double vendaAcoes = 33.92;
		double quantidadeAcoes = 1000;
		double percentual = 0.02;
		double totCompra;
		double totVenda;
		double totDespesaCompra;
		double totDespVenda;
		double totLucroVenda;
		double totLucroCompra;
		double total;

		totCompra = compraAcoes * quantidadeAcoes;
		totVenda = vendaAcoes * quantidadeAcoes;
		totDespesaCompra = percentual * totCompra;
		totDespVenda = percentual * totVenda;
		totLucroVenda = totVenda - totDespVenda;
		totLucroCompra = totCompra + totDespesaCompra;
		total = totLucroVenda - totLucroCompra;

		System.out.println("O valor total da compra é: " + totCompra);
		System.out.println("O valor total da comissão é: " + totDespesaCompra);
		System.out.println("O valor total da venda é: " + totVenda);
		System.out.println("O valor total da comissão da venda é: " + totDespVenda);
		System.out.println("Lucro total: " + total);

	}
}