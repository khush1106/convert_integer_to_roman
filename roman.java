import java.io.*;
import java.util.*;
class help
{
    String ch;
    String unit(int d1)
    {
      switch(d1)
      {
      case 1:
     ch="I";
      break;
      case 2:
      ch= "II";
      break;
      case 3:
     ch="III";
      break;
      case 4:
      ch="IV";
      break;
      case 5:
     ch="V";
      break;
      case 6:
      ch="VI";
      break;
      case 7:
       ch="VII";
      break;
      case 8:
      ch= "VIII";
      break;
      case 9:
       ch="IX";
      break;
    }
    return ch;
}
    String tens(int d2)
    {
        switch(d2)
        {
      case 10:
      ch= "X";
      break;
      case 20:
     ch="XX";
      break;
      case 30:
      ch="XX";
      break;
      case 40:
      ch="XL";
      break;
      case 50:
      ch="L";
      break;
      case 60:
      ch="LX";
      break;
      case 70:
    ch="LXX";
      break;
      case 80:
      ch="LXXX";
      break;
      case 90:
      ch="XC";
      break;
    }
    return ch;}
    String hund(int d3)
    {
        switch(d3)
        {
      case 100:
      ch="C";
      break;
      case 200:
      ch="CC";
      break;
      case 300:
      ch="CCC";
      break;
      case 400:
      ch="CD";
      break;
      case 500:
     ch="D";
      break;
      case 600:
       ch="DC";
      break;
      case 700:
       ch="DCC";
      break;
      case 800:
      ch="DCCC";
      break;
      case 900:
    ch="CM";
    }
    return ch;
}
    String tho(int d4)
    {
        switch(d4)
        {
        case 1000:
      ch="M";
      break;
      case 2000:
      ch="MM";
      break;
      case 3000:
      ch="MMM";
      break;
    }
    return ch;
    }
}
class Solution {
    public String intToRoman(int num)
    {
        String s="";
         int y,co,c=0,po=1;
         y=num;
help hp=new help();
while(num !=0)
{
    co=num%10;
    if(c==0)
    po=1;
    else
    po=po*10;
    y=co*po;
    System.out.println(y);
    c++;
    if(y==0)
    s=s+"";

else if(y>0 && y<10)
s=hp.unit(y)+s;
else if(y>9 && y<100)
s=hp.tens(y)+s;
else if(y>99 && y<1000)
s=hp.hund(y)+s;
else 
s=hp.tho(y)+s;
num=num/10;
}
    return s;            
    }
}
class roman
{
    public static void main(String ar[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
      Solution sol=new Solution();
      String rom;
      int nu=sc.nextInt();
      rom=sol.intToRoman(nu);
      System.out.println(rom);
    }
}