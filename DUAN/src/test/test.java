package test;

import java.io.ObjectInputFilter.Status;
import java.util.Scanner;

import main.task;
import main.tasklist;

public class test {
public static void main(String[] args) {
	tasklist dstv=new tasklist();
	Scanner sc = new Scanner(System.in);
	int luachon=0 ; 
	do {System.out.println("MENU ---------- ");
	System.out.println("Vui lòng chọn chức năng: ");
	System.out.println(
	  "1.	Thêm tác vụ .\n"
	+ "2.	xóa tác vụ .\n"
	+ "3.	in ra danh sach tác vụ .\n"
	+ "4.	Liệt kê tất cả các tác vụ đã hoàn thành.\n"
	+ "5.	Liệt kê tất cả các tác vụ chưa hoàn thành.\n"
	+ "6.	Liệt kê tất cả các tác vụ đang tiến hành.\n"
	
	+ "0.   Thoát khỏi chương trình");
	luachon = sc.nextInt();
	sc.nextLine();
		if(luachon==1) {
			System.out.println("nhập id :");int id = sc.nextInt();
			sc.nextLine();
			System.out.println("nhập mô tả công việc :");String description=sc.nextLine();
			
			System.out.println("nhập kết quả công việc : ");String status = sc.nextLine();
			System.out.println("nhập giờ và ngày tạo ");String createdat= sc.nextLine();
			System.out.println("nhập giờ và ngày lần cuối : ");String updatedat= sc.nextLine();
			task tv=new task(id, description, status, createdat, updatedat);
			dstv.themtacvu(tv);
		}
		else if(luachon==2) {
			task tv=new task(); 
			dstv.xoatacvu(tv);
			
		}
else if(luachon==3) {
			dstv.intacvu();
		}
else if(luachon==4) {
	dstv.dahoanthanh();
}
else if(luachon==5) {
	dstv.chuahoanthanh();
}
else if(luachon==6) {
	dstv.dangtientrinh();
}
	} while (luachon!=0);
}}
