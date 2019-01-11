package ejemplos;

public class Termometro {

	
	private int datos[];
	private int index;
	private boolean datosReales;
	
	
	
	/*
	 * CONSTRUCTOR
	 * 
	 */
	public Termometro(int cuantasTemperaturas) {
		
		index = 0;
		datos = new int[cuantasTemperaturas];
		datosReales = false;
		
		/*
		for(int i=0;i<datos.length;i++) {
			
			datos[i] = (int)(Math.random()*40)-10;
		}	
		*/	
	}
	
	
	
	
	
	
	/**
	 * Busca un valor en el vector
	 * @param valor dato a buscar
	 * @return la posición en la que se encuentra. 
	 * -1000 si no lo encuentra
	 */
	public int buscar(int valor) {
		
		boolean encontrado = false;
		int i = 0;
		while((i<datos.length)&(encontrado==false)){
		
			if(datos[i]==valor) {
				encontrado = true;
			}
			else i++;
		}
		if(encontrado) {
			
			return i;
		}
		else return -1000;
	}	
	
	
	
	
	
	/**
	 * Imprime los valores que hay en el vector
	 */
	public void print() {
		
		int finalImpresion = index;
		if((index==0)&(datosReales)) {
			
			finalImpresion = datos.length;
		}
		
		for(int i=0;i<finalImpresion;i++) {
			System.out.print(datos[i]+" ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	public void addTemperatura(int valor) {
		
		datos[index] = valor;
		index++;
		if(index==datos.length) {
			
			index = 0;
		}
		if(!datosReales) {
			
			datosReales = true;			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
