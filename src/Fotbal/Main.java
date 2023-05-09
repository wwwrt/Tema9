package Fotbal;

public class Main {
public static void main(String[] args) {
Joc joc = new Joc("Echipa 1", "Echipa 2");
joc.simuleaza();
}
}

class Out extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;}
class Gol extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;}
class Corner extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;}
