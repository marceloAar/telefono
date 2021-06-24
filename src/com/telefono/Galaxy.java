//Marcelo Aceituno R
//Full Stack JAVA 0034
//Telefono
package com.telefono;

public class Galaxy extends Phone implements Ringable{

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
	@Override
    public String ring() {        
		String sonido = "Galaxy "+getVersionNumber()+" says "+getRingTone();
		return sonido;		
    }
    
	@Override
    public String unlock() {        
		return "Equipo desbloquea via huella dactilar";		
    }
    
	@Override
    public void displayInfo() {        
		System.out.println("Galaxy "+getVersionNumber() + " from "+ getCarrier());		
    }	
	
}
