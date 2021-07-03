package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.obterDataFormatada();
		d1.ano = 2020;
		
		var d2 = new Data(31, 12, 2020);
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		System.out.printf("%d/%d/%d " , d1.dia, d1.mes, d1.ano);
		System.out.printf("\n%d/%d/%d ", d2.dia , d2.mes ,d2.ano);
		
	}
 
}
