import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class MainClass 
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{		
		String[] elenco= {"1---> Aggiungi Presenza","2--->Salva File","3-->Lol"};
		RegistroElettronico r1=new RegistroElettronico();
		ConsoleInput tastiera=new ConsoleInput();
		
		
		
		
		
		/*
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
		}*/
		
		
		Menu m1=new Menu(elenco);
		Presenza alunno = null;
		int numeroMatricola;
		
		switch (m1.scelta()) 
		{
		case 1:
		
			
			System.out.println("Inserisci numero Matricola");
			numeroMatricola=tastiera.readInt();
			LocalDateTime.now();
			r1.inserisciPresenza(alunno);
			break;

		case 2: 			
			try 
			{
				r1.salvaPresenza(LocalDate.now().toString()+".bin");
			} 
			catch (IOException e) 
			{
				System.out.println("Impossibile scrivere sul file");				
				e.printStackTrace();
			}
			break;
		case 3:
			
			break;
		default:
			break;
		}
		
		
		
	}

}
