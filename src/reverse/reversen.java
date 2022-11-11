package reverse;

public class reversen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=23456, reverse=0;
		while(num!=0)
		{
			int r=num%10;
			reverse=reverse*10 + r;
			num=num/10;
		}
System.out.println("the reverse number is:" + reverse);
	}

}
