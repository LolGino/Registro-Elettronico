import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroElettronico implements Serializable
{
	private Nodo head;
	private int elementi;
	public static final String workingDir = System.getProperty("user.dir")+"\\presenze\\";
	
	public RegistroElettronico()
	{
		setHead(null);
		setElementi(0);
	}

	public Nodo getHead() 
	{
		return head;
	}

	public void setHead(Nodo head)
	{
		this.head = head;
	}

	public int getElementi()
	{
		return elementi;
	}

	public void setElementi(int elementi) 
	{
		this.elementi = elementi;
	}
	
	private Nodo creaNodo(Presenza alunno, Nodo link)
	{
		Nodo nodo= new Nodo(alunno);
		nodo.setLink(link);
		return nodo;
	}
	
	public void inserisciPresenza(Presenza alunno)
	{
		Nodo p=creaNodo(alunno, head);
		head=p;
		elementi++;
		
	}
	
	public String toString()
	{
		String risultato="Head"; 
		if (elementi==0)
			return risultato+="-->";
		Nodo p=head;
		while(p!=null)
		{
			risultato+="-->"+p.getInfo().toString();
			p=p.getLink();
		}
		return risultato;
	}
	
	

	public void salvaPresenza(String nomeFile) throws IOException
	{
		
		FileOutputStream file= new FileOutputStream(nomeFile);
		ObjectOutputStream writer=new ObjectOutputStream(file);
		writer.writeObject(this);
		writer.flush();
		file.close();
		nomeFile=
	}
	
	public RegistroElettronico caricaFesta(String nomeFile) throws IOException, ClassNotFoundException
	{
		FileInputStream file= new FileInputStream(nomeFile);
		ObjectInputStream reader=new ObjectInputStream(file);
		
		RegistroElettronico r1;
		r1=(RegistroElettronico)(reader.readObject()); //casting
		file.close();
		return r1;
	}
	
	public static String[] elencaGiorni()
	{
		File filesPresenti=new File(workingDir); //classe File, crea una rappresentazione astratta dei file in una directory
						
		int numeroFilesPresenti=filesPresenti.list().length;
		String[] elencoFile=new String[numeroFilesPresenti];
		elencoFile=filesPresenti.list();
		for (int i = 0; i < numeroFilesPresenti; i++)
			elencoFile[i]=elencoFile[i].substring(0, elencoFile[i].length()-4); //tolgo l'estensione.bin ai nomi dei file
		return elencoFile;		
	}
	
	public void verificaPresenza(Presenza alunno) throws IOException, ClassNotFoundException
	{
		FileInputStream file= new FileInputStream(LocalDate.now().toString()+".bin");
		ObjectInputStream reader=new ObjectInputStream(file);
		RegistroElettronico r1;
		r1=(RegistroElettronico)reader.readObject();
		
			
	}
	
	public RegistroElettronico studentiInRitardo(LocalDateTime oraDataIngresso) throws IOException, ClassNotFoundException
	{
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader tastiera= new BufferedReader(input);
		System.out.println("Inserisci giorno per verificare i ritardi");
		String s="";
		try 
		{
			s=tastiera.readLine();
		} 
		catch (IOException e) 
		{
			System.out.println("Errore nella lettura ");
		}
		FileInputStream file= new FileInputStream(s+".bin");
		ObjectInputStream reader=new ObjectInputStream(file);
		RegistroElettronico r1;
		r1=(RegistroElettronico)reader.readObject();
		return r1;
		
	}
	
	private Nodo getLinkPosizione(int posizione)
	{
		
		Nodo p;
		int n;
		p=head;
		n=1;
			
		while(p.getLink()!=null && n<posizione)
		{
			p=p.getLink();	//p va a puntare al nodo successivo
			n++;
		}
		
		return p;
	}
	
	public Presenza getPresenza (int posizione) 
	{
		Nodo p=getLinkPosizione(posizione);
		return p.getInfo();		
	}
	
	
	public void esportaCSV(String nomeFile) throws IOException,FileException
	{
		TextFile file=new TextFile (nomeFile,'W');
		String alunnoCSV;
		Presenza alunno;
		
		for (int i = 1; i < getElementi(); i++) 
		{
			alunno=getPresenza(i);
			alunnoCSV=alunno.getNumeroMatricola()+";"+alunno.getOraDataIngresso()+";";
			file.toFile(alunnoCSV);
		}
		file.closeFile();
	}
	
	


	
	
	
	
}
