import java.io.*;
import  java.util.*; 
class UserMainCode
{   
public int isMultiple(int input1,int input2)
{        
int val=0;     
if(input1==0 || input2==0) val=3;    
else if((input1%input2)!=0) 
val=1;     
else val=2;     
return val;   
}
} 