package star;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		int star_1; 
		int star_2;
		int star_3;  // �� ������ �Է¹޴� ������ ���� ���� 
		Scanner sc = new Scanner(System.in); // �� ������ �Է¹ޱ� ���� ��ĳ�� ����
		
		System.out.print("�� ���� �ٷ� ���� ����ұ��? "); // ���� ���
		star_1 = sc.nextInt(); // 1�� ������ ���� ��� �Է�
		System.out.println("---[1��]---"); 
		if(star_1>0) // �� ���� ���� ������ ���
			for(int i=1; i<=star_1; i++) {  
				for(int j=1; j<=i; j++) {
					System.out.print("*");}
				System.out.println("");}  
		else // �⺻���� ���
			for(int i=1; i<6; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");}
				System.out.println("");}
		
		System.out.print("�� ���� �ٷ� ���� ����ұ��? ");
		star_2 = sc.nextInt(); // 2�� ������ ���� ��� �Է�
		System.out.println("---[2��]---");
		if(star_2>0) // �� ���� ���� ������ ��� 
			for(int i=1; i<=star_2; i++) {
				for(int j=i; j<=star_2; j++) {
					System.out.print("*");}
				System.out.println("");}
		else // �ٱ⺻���� ���
			for(int i=1; i<6; i++) {
				for(int j=i; j<6; j++) {
					System.out.print("*");}
				System.out.println("");}
		
		while(true) { // ¦���� ��쿡�� ������ �ٽ� �ޱ� ���� while���� ��
		System.out.print("�� ���� �ٷ� ���� ����ұ��? ");
		star_3 = sc.nextInt(); //3�� ������ ���� ��� �Է�
		if(star_3%2==1) { // �� ���� Ȧ���� ���
			System.out.println("---[3��]---"); 
			for(int i=0; i<star_3/2+1; i++) { // ���ﰢ���� ���ﰢ������ ������. �̺κ��� ���ﰢ��
				for(int j=i; j<star_3/2; j++) {
					System.out.print(" ");}
				for(int j=1; j<2*i+2; j++) {
					System.out.print("*");}
				System.out.println("");}
			for(int i=0; i<star_3/2; i++) { // ���ﰢ��
				for(int j=1; j<i+2; j++) {
					System.out.print(" ");}
				for(int j=2*(i+1); j<star_3; j++) {
					System.out.print("*");}
				System.out.println("");}
			break;
		}
		else if(star_3<=0) { // �⺻���� ���
			System.out.println("---[3��]---"); 
			for(int i=0;  i<5; i++) {
				for(int j=i; j<4; j++) {
					System.out.print(" ");}
				for(int j=1; j<2*i+2; j++) {
					System.out.print("*");}
				System.out.println("");}
			for(int i=0; i<4; i++) {
				for(int j=1; j<i+2; j++) {
					System.out.print(" ");}
				for(int j=2*i; j<7; j++) {
					System.out.print("*");}
				System.out.println("");}
			break;
		}
		else // ¦���� �Է����� ���
			continue; // ���� while������ ���ư��� �������� ����
}
}
}