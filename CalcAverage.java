

import java.util.Scanner;

public class CalcAverage {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int getNum, sum=0, avg, count=0;
		int min=0, max=0, posMin=0, posMax=0;
		do {
			System.out.println("Enter a number or Type 0 to Exit : ");
			getNum=scanner.nextInt();
			if (getNum == 0) break;
			sum += getNum;
			count++;
			if (count==1) {
				min = getNum;
				max = getNum;
				posMin = 1;
				posMax = 1;
				
			} else {
				if (getNum>max) {
					max = getNum;
					posMin = count;
				}	
				if (getNum<max) {
					min = getNum;
					posMax = count;
				}
			}
		}while(getNum != 0);
		System.out.println("Total : "+sum);
		System.out.println("Average : "+sum/count);
		System.out.println("Minimum Value : "+min+" & Its Position is "+posMin);
		System.out.println("Maximum Value : "+max+" & Its Position is "+posMax);
	}

}
