/*

Pr1.4:
Write a program that displays the first 100 terms of the triangular sequence. This is the sequence that goes 1,3,6,10,15,21,... The rule is that you add on 2, then add on 3, then add on 4, etc.
  
*/

public class Pr1_4
{
	public static void main(String[] args)
	{
		int term = 0;
		for(int i = 1; i <= 100; i++)
		{
			term = term + i;
			IBIO.out(term + 
			" ");
		}
	}
}


/*

1 3 6 10 15 21 28 36 45 55 66 78 91 105 120 136 153 171 190 210 231 253 276 300 325 351 378 406 435 465 496 528 561 595 630 666 703 741 780 820 861 903 946 990 1035 1081 1128 1176 1225 1275 1326 1378 1431 1485 1540 1596 1653 1711 1770 1830 1891 1953 2016 2080 2145 2211 2278 2346 2415 2485 2556 2628 2701 2775 2850 2926 3003 3081 3160 3240 3321 3403 3486 3570 3655 3741 3828 3916 4005 4095 4186 4278 4371 4465 4560 4656 4753 4851 4950 5050 

*/
