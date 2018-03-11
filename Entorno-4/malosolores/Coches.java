package malosolores;

public class Coches {
	String matriculaCoche;
	String atribCoche;
	String modelo;
	String fabricante;		
	 public void Coche() {
		 matriculaCoche = "";
		 atribCoche = "";
		 modelo = "";
		 fabricante = "";
	 }
	 public Coches(String m, String t, String m1, String f) { //Contructores repetido añado m1
		 matriculaCoche = m1;
		 atribCoche = t;
		 modelo = m;
		 fabricante = f;
	 
	public String getModelo() {//Creo los getter and setter y los métodos correspondientes(A,B,C)
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int metodo1() {
		 int resultado = 0;
		 if(atribCoche == "Gasolina") {
			 resultado += metodoA(modeloCoche,fabricante);
		 }else if (atribCoche == "Diesel") {
			 resultado += metodoB(modeloCoche, fabricante);
		 }else if (atribCoche == "Híbrido") {
			 resultado += metodoC(modeloCoche,fabricante);
		 }else {
			 resultado +=10;
		 }
		 return resultado;
		 
	 }
	
	 
}
