package pl.wt.springAngular.model;

import java.util.Arrays;
import java.util.List;

public class Encja {
	
	private String nazwa;
	private int val;
	private List<Objekt> obj;
	
	public Encja() {
		super();
	}
	
	public Encja(String nazwa, int val, Objekt... obj) {
		super();
		this.nazwa = nazwa;
		this.val = val;
		this.obj = Arrays.asList(obj);
	}

	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String name) {
		this.nazwa = name;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}



	public List<Objekt> getObj() {
		return obj;
	}



	public void setObj(List<Objekt> obj) {
		this.obj = obj;
	}



	@Override
	public String toString() {
		return "Encja [nazwa=" + nazwa + ", val=" + val + ", obj=" + obj + "]";
	}



	
	
}
