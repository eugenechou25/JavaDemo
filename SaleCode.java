package com.zyj.demo;

public class SaleCode {

	public static void main(String[] args) {
		String num = "0123456789";
		String alpha_low = "abcdefghijklmnopqrstuvwxyz";
		String alpha_up = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for(int r=0;r<100;r++) {
			StringBuilder builder = new StringBuilder();
			for(int h=0;h<10;h++) {
				double i = Math.random()*26;
				double k = Math.random()*26;
				double n = Math.random()*10;
				double choice = Math.random()*3;
				int index_of_al = (int)i;
				int index_of_au = (int)k;
				int index_of_num = (int)n;
				int choice_of_three = (int)choice;
				if(choice_of_three==0) {
					builder.append(num.charAt(index_of_num));
				}
				else if(choice_of_three==1) {
					builder.append(alpha_low.charAt(index_of_al));
				}
				else {
					builder.append(alpha_up.charAt(index_of_au));
				}
			}
			String code = builder.toString();
			System.out.println(code);
		}
	}
}
