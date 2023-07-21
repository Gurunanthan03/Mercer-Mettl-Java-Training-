import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int mostFrequentlyOccurringDigit(int[] input1,int input2){
		// Read only region end
		// Write code here...
		int [] arr = new int[10];
        for ( int i = 0; i < input2; i ++){
            while (input1[i] != 0) {
                  int rem = input1[i] % 10;
                  arr[rem]++;
                  input1[i] /= 10;
                
            }
        }
        int max = 0;
        int highest_occurence_number = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] >= max) {
                max = arr[i];
                highest_occurence_number = i;
            }
        }
    return highest_occurence_number;
    }
}