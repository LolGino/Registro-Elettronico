import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class MainClass 
{

	public static void main(String[] args) 
	{		
		RegistroElettronico r1=new RegistroElettronico();
		Presenza p1= new Presenza(23,LocalDateTime.now());
		r1.inserisciPresenza(p1);
		
		System.out.println(r1.toString());
		
		try 
		{
			r1.salvaPresenza("C:\\Users\\UTENTE.G01-NB02\\Documents\\Warkspace Visinoni\\Registro Elettronico\\presenze"+LocalDate.now().toString()+".bin");
		} 
		catch (IOException e) 
		{
			System.out.println("Impossibile scrivere sul file");
			e.printStackTrace();
		}
		
		//esportazione
		System.out.println(r1.toString());
		try 
		{
			r1.esportaCSV(LocalDate.now().toString()+".txt");
		} 
		catch (IOException e) 
		{
			System.out.println("Impossibile scivere sul file");
		} 
		catch (FileException e) 
		{
			System.out.println(e.toString());
		}
		
		
		
		
		
	}

}
