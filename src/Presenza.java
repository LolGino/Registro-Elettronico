import java.time.LocalDateTime;

public class Presenza 
{
	private int numeroMatricola;
	private LocalDateTime oraDataIngresso;
	
	
	public Presenza(int numeroMatricola, LocalDateTime oraDataIngresso)
	{
		this.setNumeroMatricola(numeroMatricola);
		setOraDataIngresso(oraDataIngresso);
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


	public void setOraDataIngresso( LocalDateTime oraDataIngresso) 
	{
		oraDataIngresso=LocalDateTime.from(oraDataIngresso);
		
	}
	public String toString()
	{
		return (getNumeroMatricola()+" "+getOraDataIngresso()+" ");
	}
	
}
