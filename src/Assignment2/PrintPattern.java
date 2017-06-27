package Assignment2;

/**
 *In this program I'll Write a program to print the following pattern:
 * 		  a  
 *		 aba 
 *	    abcba
 *		 aba 
 *        a 
 *
 */
public class PrintPattern {

	public static void main(String[] args) {


				int i;//'i' is row line
				int j;// 'j' is column line
				int d;// 
				char k;//
				for (i = 1; i <= 5; i++) {
					k = 'a';
					for (j = 1, d=0; j <= 5; j++) { 
						// increasing
						if (i < 4){
							if (j >= 4 - i && j <= 2 + i) {
								System.out.print(k);
								if (j < 3) {
									k++;
								} else {
									k--;
								}
							} else {
								System.out.print(" ");
							}
						} else {
							
							// decreasing					
							if (j>i-3 && j <= 5-d) {
								
								System.out.print(k);
								if (j<3) {
									k++;
								} else {
									k--;
								}
							} else {
								System.out.print(" ");
								d++;
							}
						}

					}

					System.out.println();
				}  
		}

	}


