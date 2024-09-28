package main;

import java.util.ArrayList;

public class tasklist {
private ArrayList<task> danhsach ;

public ArrayList<task> getDanhsach() {
	return danhsach;
}

public void setDanhsach(ArrayList<task> danhsach) {
	this.danhsach = danhsach;
}

public tasklist(ArrayList<task> danhsach) {
	
	this.danhsach = danhsach;
}

public tasklist() {
	this.danhsach=new ArrayList<task>();
}

public void themtacvu(task tv) {
	this.danhsach.add(tv);
}
public boolean xoatacvu (task tv) {
	return this.danhsach.remove(tv);
	
}
public void intacvu() {
	for (task tacvu : danhsach) {
		System.out.println(tacvu);
	}
}public void dahoanthanh () {
	 	for (task task : danhsach) {
			if(task.getStatus().equals("đã hoàn thành")) {
		System.out.println(task);}
}
	 	}
public void chuahoanthanh () {
 	for (task task : danhsach) {
		if(task.getStatus().equals("chưa hoàn thành")) {
	System.out.println(task);}
}
 	}
public void dangtientrinh () {
 	for (task task : danhsach) {
		if(task.getStatus().equals("đang tiến trình")) {
	System.out.println(task);}
}
 	}
}
