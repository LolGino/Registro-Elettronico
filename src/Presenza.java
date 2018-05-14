import java.io.Serializable;
import java.time.LocalDateTime;

public class Presenza implements Serializable
{
	/**
	 *  La classe rappresenta un processo per inserire la presenza di un alunno all'interno
	 *  del registro elettronico. Gli attrinuti sono : il numero di matricola dello studente 
	 *  che timbrerà il badge e la data e l'ora in cui l'alunno timbra.
	 *  @author Visinoni Giorgio
	 *  @version 2.0 
	 */
	
	//Attributi
	private int numeroMatricola;
	private LocalDateTime oraDataIngresso;
	
<<<<<<< HEAD
	/**
	 * Metodo Costruttore
	 * Per calcolare la data si una il metodo now(ora locale) della classe LocalDateTime.
	 * 
	 * @param numeroMatricola rappresenta il numero di matricola dell'alunno
	 * @param anno rappresenta l'anno attuale(in cui l'alunno a timbrato)
	 * @param mese rappresenta il mese atuale(in cui l'alunno a timbrato)
	 * @param giorno rappresenta il giorno attuale(in cui l'alunno a timbrato)
	 * @param ora rappresenta l'ora attuale(in cui l'alunno a timbrato)
	 * @param minuti rappresenta i minuti attuali(in cui l'alunno a timbrato)
	 * @param secondi rappresenta i secondi attuali(in cui l'alunno a timbrato)
	 */
	public Presenza(int numeroMatricola, int anno,int mese, int giorno, int ora, int minuti, int secondi)
=======
	
	public Presenza(int numeroMatricola, LocalDateTime oraDataIngresso)
>>>>>>> 22d4f8f3da859b1528af8df5f4f4f8f3d4678c99
	{
		this.setNumeroMatricola(numeroMatricola);
		setOraDataIngresso(oraDataIngresso);
	}

	/**
	 * Costruttore Vuoto.
	 */
	public Presenza() 
	{
		setNumeroMatricola(numeroMatricola);
		oraDataIngresso=LocalDateTime.now();
	}

	/**
	 * Metodo di tipo getter che restituisce il numero di matricola dell'alunno
	 * @return numero di Matricola
	 */
	public int getNumeroMatricola() 
	{
		return numeroMatricola;
	}
	
	/**
	 * Metodo di tipo setter che permette di settare il numero di matricola dell'alunno
	 * @param numeroMatricola numero che identifica l'alunno
	 */
	public void setNumeroMatricola(int numeroMatricola) 
	{
		this.numeroMatricola = numeroMatricola;
	}

	/**
	 * Metodo di tipo getter che restituisce ora e data in cui l'alunno ha timbrato
	 * @return oraDataIngresso data e ora di timbratura
	 */
	public LocalDateTime getOraDataIngresso() 
	{
		return oraDataIngresso;
	}
<<<<<<< HEAD
	
	/**
	 * Metodo di tipo setter che consente di settare l'ora e la data in cui l'alunno ha timbrato
	 * @param anno rappresenta l'anno attuale(in cui l'alunno a timbrato)
	 * @param mese rappresenta il mese atuale(in cui l'alunno a timbrato)
	 * @param giorno rappresenta il giorno attuale(in cui l'alunno a timbrato)
	 * @param ora rappresenta l'ora attuale(in cui l'alunno a timbrato)
	 * @param minuti rappresenta i minuti attuali(in cui l'alunno a timbrato)
	 * @param secondi rappresenta i secondi attuali(in cui l'alunno a timbrato)
	 */
	public void setOraDataIngresso( int anno,int mese, int giorno, int ora, int minuti, int secondi) 
=======


	public void setOraDataIngresso( LocalDateTime oraDataIngresso) 
>>>>>>> 22d4f8f3da859b1528af8df5f4f4f8f3d4678c99
	{
		oraDataIngresso=LocalDateTime.from(oraDataIngresso);
		
	}
	public String toString()
	{
		return (getNumeroMatricola()+" "+getOraDataIngresso()+" ");
	}
	
	/**
	 * Restituisce una stringa contenente le informazioni sul processo
	 */
	public String toString()
	{
		return (getNumeroMatricola()+" "+getOraDataIngresso()+" ");
	}
	
	/**
	 * Metodo equals che verifica se 2 processi sono identici
	 * @param p rappresenta il prcesso da confrontare
	 * @return true se sono identici
	 * @return false se sono diversi
	 */
	public boolean equals(Presenza p)
	{
		if(getNumeroMatricola()==p.getNumeroMatricola())
			return true;
		else
			return false;
	}
	
	/*public int compareTo(Presenza p)
	{
		if (p.getNumeroMatricola()<getNumeroMatricola())
		{
			return 1; 		//il numero piu piccolo è p
		}
		if (p.getNumeroMatricola()>getNumeroMatricola()) 
		{
			return 0; //il numero piu grande non è p
		}
		
		return -1; 	//sono uguali
	}*/
}
