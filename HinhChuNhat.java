package NguyenHuuDuc_23699411;

import java.util.Scanner;

public class HinhChuNhat {

	private double chieuDai;
	private double chieuRong;
	private double chuVi;
	private double dienTich;
	
	
	public double getChuVi() {
		return (getChieuDai() + getChieuRong()) * 2;
	}


	public void setChuVi(double cv) {
		this.chuVi = cv;
	}


	public double getDienTich() {
		return (getChieuDai() * getChieuRong()); 
	}


	public void setDienTich(double dt) {
		this.dienTich = dt;
	}


	public double getChieuDai() {
		return chieuDai;
	}


	public void setChieuDai(double d) {
		if(d > 0) {
			this.chieuDai = d;
		}
		else {
			System.out.println("erorr");
		}
	}


	public double getChieuRong() {
		return chieuRong;
	}


	public void setChieuRong(double r) {
		if(r > 0) {
			this.chieuRong = r; 
		}
		else {
			System.out.println("erorr");
		}
	}

	public HinhChuNhat() {}

	public HinhChuNhat(double d, double r) {
		
		if(d > 0) {
			this.chieuDai = d;
		}
		else {
			System.out.println("erorr");
		}
		
		if(r > 0) {
			this.chieuRong = r; 
		}
		else {
			System.out.println("erorr");
		}
	}

	public String toString() {
		String s = " ";
		s += String.format("|%10s|%10s|%10s|%10s|", getChieuDai(), getChieuRong(), getChuVi(), getDienTich() );
		return s;
	}
	
	public static void inTD() {
		
		for(int i = 1 ; i<= 45; i++) {
			System.out.print("-");
		}
		System.out.println();
		System.out.printf("|%10s|%10s|%10s|%10s|", "Chieu Dai", "Chieu Rong", "Chu Vi", "Dien Tich");
		System.out.println();
		for(int i = 1 ; i<= 45; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	public static HinhChuNhat nhapMem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Chieu Dai: ");
		double d = sc.nextDouble();
		System.out.println("Nhap Chieu Rong");
		double r = sc.nextDouble();
		HinhChuNhat h3 = new HinhChuNhat(d,r);
		return h3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// khoi tao doi tuong 
		HinhChuNhat h1 = new HinhChuNhat();
		h1.setChieuDai(4);
		h1.setChieuRong(5);
		inTD();
		System.out.println(h1.toString());
		for(int i = 1 ; i<= 45; i++) {
			System.out.print("-");
		}
		
		System.out.println("\n");
		//khoi tao co doi so
		HinhChuNhat h2 = new HinhChuNhat(40,80);
		inTD();
		System.out.println(h2);
		for(int i = 1 ; i<= 45; i++) {
			System.out.print("-");
		}
		
		System.out.println("\n");
		
		// khoi tao ham tao co doi so (nhap tu ban phim)
		HinhChuNhat h3 =  HinhChuNhat.nhapMem();
		inTD();
		System.out.println(h3);
		for(int i = 1 ; i<= 45; i++) {
			System.out.print("-");
		}
		
	}

}
