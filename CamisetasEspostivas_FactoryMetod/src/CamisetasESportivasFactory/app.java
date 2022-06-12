package CamisetasESportivasFactory;

public class app {

	public static void main(String[] args) {
		FactoryCamisetas factory = new ConcreCreatorCamisetasEsportivas();
		String time = "Brasil";
		String fabrica = "Nike";
		
		factory.getCamisetasEsportivas(fabrica, time);
		
		time = "Flamengo";
		fabrica = "Adidas";
		
		factory.getCamisetasEsportivas(fabrica, time);
		
		time = "Botafogo";
		fabrica = "Puma";
		
		factory.getCamisetasEsportivas(fabrica, time);
		
		time = "Fluminense";
		fabrica = "Umbro";
		
		factory.getCamisetasEsportivas(fabrica, time);
		
		time = "Vasco";
		fabrica = "Kappa";
		
		factory.getCamisetasEsportivas(fabrica, time);

	}

}
