package CamisetasESportivasFactory;

public class ConcreCreatorCamisetasEsportivas extends FactoryCamisetas{

	@Override
	public CamisetasEsportivas getCamisetasEsportivas (String fabrica, String time) {
		if(time.equals("Brasil")) {
			return new Nike(fabrica);
		}else{
			if(time.equals("Flamengo")) {
				return new Adidas(fabrica);
			}else {
				if(time.equals("Botafogo")) {
					return new Puma(fabrica);
				}else {
					if(time.equals("Fluminense")) {
						return new Umbro(fabrica);
					}else {
						if(time.equals("Vasco")) {
							return new Kappa(fabrica);
						}
					}
				}
			}
		}
		
		return null;
	}
	

}
