package main;

import java.util.ArrayList;

public class danhsachtacvu {
private ArrayList<tacvu> danhsach ;

public ArrayList<tacvu> getDanhsach() {
	return danhsach;
}

public void setDanhsach(ArrayList<tacvu> danhsach) {
	this.danhsach = danhsach;
}

public danhsachtacvu(ArrayList<tacvu> danhsach) {
	
	this.danhsach = danhsach;
}

public danhsachtacvu() {
	this.danhsach=new ArrayList<tacvu>();
}

public void themtacvu(tacvu tv) {
	this.danhsach.add(tv);
}
public boolean xoatacvu (tacvu tv) {
	return this.danhsach.remove(tv);
	
}
public void intacvu() {
	for (tacvu tacvu : danhsach) {
		System.out.println(tacvu);
	}
}
}
