import java.io.Serializable;

public class Nodo implements Serializable
{
	private Presenza info;
	private Nodo link;
	
	public Nodo(Presenza persona)
	{
		setInfo(persona);
		link=null;
	}
	
	public Presenza getInfo() 
	{
		return info;
	}
	public void setInfo(Presenza info) 
	{
		this.info = info;
	}
	public Nodo getLink() 
	{
		return link;
	}
	public void setLink(Nodo link) 
	{
		this.link = link;
	}
	
}
