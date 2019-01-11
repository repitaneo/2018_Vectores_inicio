package ejemplos;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Termometro t1 = new Termometro(7);
		t1.addTemperatura(-1);
		t1.addTemperatura(5);
		t1.addTemperatura(17);
		t1.addTemperatura(3);
		t1.addTemperatura(-12);
		t1.addTemperatura(8);
		t1.addTemperatura(70);
		t1.print();
		
		t1.addTemperatura(-70);
		t1.addTemperatura(50);
		t1.addTemperatura(7);
		t1.addTemperatura(-23);
		t1.addTemperatura(-2);
		t1.print();

		
		
	}

}
