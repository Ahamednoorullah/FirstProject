class Armstrongnumber 
{
	public static void main(String[] args) 
	{
		int num = 153,temp1 = num,temp2 = num,sum = 0,count = 0;
		while (num > 0)
		{
			num = num / 10;
			count++;
		}
		while (temp1 > 0)
		{
			int last = temp1 % 10;
			int prod = 1;
			int n = count;
			while (n > 0)
			{
				prod = prod * last;
				n--;
			}
			sum = sum + prod;
			temp1 = temp1 / 10;
		}
		if (temp2 == sum)
		{
			System.out.println(temp2+ " is a Armstrong Number");
		}
		else {
            System.out.println(temp2+ " is Not a Armstrong Number");
		}
	}
}