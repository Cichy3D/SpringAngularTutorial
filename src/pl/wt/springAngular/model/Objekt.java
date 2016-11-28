package pl.wt.springAngular.model;

public class Objekt {
	
	long id;
	String txt;
	public Objekt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Objekt(long id, String txt) {
		super();
		this.id = id;
		this.txt = txt;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTxt() {
		return txt;
	}
	public void setTxt(String txt) {
		this.txt = txt;
	}
	@Override
	public String toString() {
		return "Objekt [id=" + id + ", txt=" + txt + "]";
	}
	
	

}
