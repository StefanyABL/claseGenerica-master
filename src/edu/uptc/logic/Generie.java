package edu.uptc.logic;

public class Generie <T>{
	private T object;

	
	public Generie(T object) {
		
		this.object = object;
	}


	public T getObject() {
		return object;
	}


	public void setObject(T object) {
		this.object = object;
	}

// objeto Integer 
// Generie <Integer> = newGenerie <> (69);
//GenString <String> str = new  GenString <> ("HOLA MUNDO ");

}
