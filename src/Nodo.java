import java.io.Serializable;
<<<<<<< HEAD
/**
 * La classe rappresenta i nodi che servono a costruire la struttura del registro.
 * Il registro contiene i relativi parametri e la componente link
 * che ha al suo interno il collegamento il nodo successivo.
 * @author Visinoni Giorgio
 * @version 2.0
 *
 */
public class Nodo implements Serializable
{
	//Attributi
	private Presenza info;
	private Nodo link;
	
	/**
	 * Metodo costruttore
	 * Quando si istanzia un nodo la componente link punta a null
	 * @param persona oggetto di tipo Presenza
	 */
=======

public class Nodo implements Serializable
{
	private Presenza info;
	private Nodo link;
	
>>>>>>> 22d4f8f3da859b1528af8df5f4f4f8f3d4678c99
	public Nodo(Presenza persona)
	{
		setInfo(persona);
		link=null;
	}
<<<<<<< HEAD
	/**
	 * Metodo di tipo getter che restituisce la componente informativa del nodo
	 * @return info oggetto di tipo presenza
	 */
=======
	
>>>>>>> 22d4f8f3da859b1528af8df5f4f4f8f3d4678c99
	public Presenza getInfo() 
	{
		return info;
	}
<<<<<<< HEAD
	
	/**
	 * Metodo di tipo setter che permette di settare la componente informativa del nodo
	 * 
	 * @param info oggetto di tipo Presenza
	 */
=======
>>>>>>> 22d4f8f3da859b1528af8df5f4f4f8f3d4678c99
	public void setInfo(Presenza info) 
	{
		this.info = info;
	}
<<<<<<< HEAD
	
	/**
	 * Metodo getter che restituisce la componente link del nodo
	 * @return link (reference del prossimo nodo)
	 */
=======
>>>>>>> 22d4f8f3da859b1528af8df5f4f4f8f3d4678c99
	public Nodo getLink() 
	{
		return link;
	}
<<<<<<< HEAD
	/**
	 * Metodo setter che consente di settare la componente link del nodo 
	 * @param link (reference del prossimo oggetto nodo)
	 */
=======
>>>>>>> 22d4f8f3da859b1528af8df5f4f4f8f3d4678c99
	public void setLink(Nodo link) 
	{
		this.link = link;
	}
	
}
