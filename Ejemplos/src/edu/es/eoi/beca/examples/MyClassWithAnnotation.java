package edu.es.eoi.beca.examples;

public class MyClassWithAnnotation {
 
@MYAnnotation(campo = "campo1", tipo = "varchar")
 private String campo1;
 
@MYAnnotation(campo="campo2",tipo="decimal")
 private String campo2;

public String getCampo1() {
	return campo1;
}

public void setCampo1(String campo1) {
	this.campo1 = campo1;
}

public String getCampo2() {
	return campo2;
}

public void setCampo2(String campo2) {
	this.campo2 = campo2;
}
 

}