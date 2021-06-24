//Marcelo Aceituno R
//Full Stack JAVA 0034
//Telefono
package com.telefono;

public class IPhone extends Phone implements Ringable {
	
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
	    super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	@Override
	public String ring() {	    
		String sonido = "IPhone "+getVersionNumber()+" says "+getRingTone();
		return sonido;
	}
	
	@Override
	public String unlock() {	    
		return "Equipo desbloquea via reconocimiento facial";
	}
	
	@Override
	public void displayInfo() {	   
		System.out.println("IPhone "+getVersionNumber() + " from "+ getCarrier());
	}

}
