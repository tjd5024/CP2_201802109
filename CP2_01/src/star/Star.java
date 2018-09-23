package star;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		int star_1; 
		int star_2;
		int star_3;  // 줄 개수를 입력받는 정수형 변수 생성 
		Scanner sc = new Scanner(System.in); // 별 개수를 입력받기 위한 스캐너 생성
		
		System.out.print("몇 개의 줄로 별을 출력할까요? "); // 질문 출력
		star_1 = sc.nextInt(); // 1번 질문에 대한 대답 입력
		System.out.println("---[1번]---"); 
		if(star_1>0) // 줄 수가 양의 정수인 경우
			for(int i=1; i<=star_1; i++) {  
				for(int j=1; j<=i; j++) {
					System.out.print("*");}
				System.out.println("");}  
		else // 기본값인 경우
			for(int i=1; i<6; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");}
				System.out.println("");}
		
		System.out.print("몇 개의 줄로 별을 출력할까요? ");
		star_2 = sc.nextInt(); // 2번 질문에 대한 대답 입력
		System.out.println("---[2번]---");
		if(star_2>0) // 줄 수가 양의 정수인 경우 
			for(int i=1; i<=star_2; i++) {
				for(int j=i; j<=star_2; j++) {
					System.out.print("*");}
				System.out.println("");}
		else // 줄기본값인 경우
			for(int i=1; i<6; i++) {
				for(int j=i; j<6; j++) {
					System.out.print("*");}
				System.out.println("");}
		
		while(true) { // 짝수인 경우에는 질문을 다시 받기 위해 while문을 씀
		System.out.print("몇 개의 줄로 별을 출력할까요? ");
		star_3 = sc.nextInt(); //3번 질문에 대한 대답 입력
		if(star_3%2==1) { // 줄 수가 홀수인 경우
			System.out.println("---[3번]---"); 
			for(int i=0; i<star_3/2+1; i++) { // 정삼각형과 역삼각형으로 나눈다. 이부분은 정삼각형
				for(int j=i; j<star_3/2; j++) {
					System.out.print(" ");}
				for(int j=1; j<2*i+2; j++) {
					System.out.print("*");}
				System.out.println("");}
			for(int i=0; i<star_3/2; i++) { // 역삼각형
				for(int j=1; j<i+2; j++) {
					System.out.print(" ");}
				for(int j=2*(i+1); j<star_3; j++) {
					System.out.print("*");}
				System.out.println("");}
			break;
		}
		else if(star_3<=0) { // 기본값인 경우
			System.out.println("---[3번]---"); 
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
		else // 짝수를 입력했을 경우
			continue; // 위의 while문으로 돌아가서 재질문을 받음
}
}
}