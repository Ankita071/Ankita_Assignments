package answer.app;

import org.springframework.stereotype.Component;

@Component
public class validate implements validationInteface{
	@Override
	public String check(String name,String card) {
		String result="null";
		if(name.equalsIgnoreCase("American Express"))
		{
			if(card.length()==16)	
			{	
				int n=Integer.parseInt(card.substring(0, 6));
				if((n>=601100 && n<=601109)|| 
					(n>=601120 && n<=601149)||
					(n==601174)||
					(n>=601177 && n<=601179)||
					(n>=601186 && n<=601199)|| 
					(n>=644000 && n<=659999) )
				{
					result="Congratulations!! You are a valid user";
				}
			}
			else result="Invalid Card Number";
			
		}
		else if(name.equalsIgnoreCase("enroute"))
		{
			if(card.length()==15)	
			{	
				int n=Integer.parseInt(card.substring(0, 4));
				if((n==2014)||(n==2149))
				{
					result="Congratulation..!valid User";
				}
			}
			else result="Invalid Card number";
		}
		else if(name.equalsIgnoreCase("JCB"))
		{
			if(card.length()>=16 && card.length()<=19)	
			{	
				int n=Integer.parseInt(card.substring(0, 4));
				if(n>=3528 && n<=3598)
				{
					result="Congratulation!!valid User";
				}
			}
			else result="Invalid Card Number";
		}
		else if(name.equalsIgnoreCase("Mastercard"))
		{
			if(card.length()==16)	
			{	int n=Integer.parseInt(card.substring(0, 5));
				int n1=(card.charAt(0)-'0');
				
				if(n1==5) {
					if(n>=510000 && n<=559999)result="Congratulation! You are a valid user";
				}
				if(n1==2) {
					if(n>=222100 && n<=272099)result="Congratulation! You are a valid user";
				}
			}
			else result="Invalid Card number";
		}
		else if(name.equalsIgnoreCase("visa"))
		{
			if(card.length()==19)
			{
				int n1=(card.charAt(0)-'0');
				if(n1==4)result="Congratulation! You are a valid user";
			}
			else result="Invalid Card number";
		}
		else
		return "Wrong credentials";
	return result;
	}
}
