package malosolores;

public class Moto {
  String matricula;
	int cilindrada;

	public Moto() {
		matriculaMoto = "";
		cilindrada  = 0;
	
	}
	
	public Moto(String m2, int c, ) {
		matriculaMoto = m2;
		cilindrada = c;
	}
	
	
	}

	public String getMatriculaMoto() {
		return matriculaMoto;
	}

	public void setMatriculaMoto(String matriculaMoto) {
		this.matriculaMoto = matriculaMoto;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

}
