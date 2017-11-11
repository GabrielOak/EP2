package model;

abstract class FormaOnda {
	
	float frequenciaAngular = (float) (2 * Math.PI * 60);
	
	
	public FormaOnda() {
		
	}
	
	public float getFrenquenciaAngular() {
		return frequenciaAngular;
	}
	
}
