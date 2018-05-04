import java.time.LocalDateTime;

public class Presenza 
{
	private int numeroMatricola;
	private LocalDateTime oraDataIngresso;
	
	
	public Presenza(int numeroMatricola, int anno,int mese, int giorno, int ora, int minuti, int secondi)
	{
		this.setNumeroMatricola(numeroMatricola);
		setOraDataIngresso(anno,mese,giorno,ora,minuti,secondi);
	}


	public int getNumeroMatricola() 
	{
		return numeroMatricola;
	}


	public void setNumeroMatricola(int numeroMatricola) 
	{
		this.numeroMatricola = numeroMatricola;
	}


	public LocalDateTime getOraDataIngresso() 
	{
		return oraDataIngresso;
	}


	public void setOraDataIngresso( int anno,int mese, int giorno, int ora, int minuti, int secondi) 
	{
		oraDataIngresso=LocalDateTime.of(anno,mese,giorno,ora,minuti,secondi);
		
	}
	
}
