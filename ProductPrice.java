import java.util.*;

class ProductPrice
{
	int p_code;
	String p_name;
	double p_price;
	public void show()
	{
		System.out.print("Code = " + this.p_code + "\nName = " + this.p_name + "\nPrice = " + this.p_price);
	}

	ProductPrice(){}
	
	ProductPrice(int code,String name,double price)
	{
		this.p_code = code;
		this.p_name = name;
		this.p_price = price;
	}
	
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);	
	
		int code;
		String name;
		double price;
		ProductPrice[] prd = new ProductPrice[3];
		
		System.out.println("Enter the product details:");
		
		for(int i = 0; i<3; i++){
			System.out.print("\nCode product " + (i+1) + ": ");
			code = Integer.parseInt(sc.nextLine());
			System.out.print("Name product " + (i+1) + ": ");
			name = sc.nextLine();
			System.out.print("Price product " + (i+1) + ": ");
			price = Double.parseDouble(sc.nextLine());
			prd[i] = new ProductPrice(code, name, price);
		}

		Double[] prices = new Double[]{prd[0].p_price, prd[1].p_price, prd[2].p_price};

		double min = Math.min(Math.min(prices[0], prices[1]), prices[2]);
		int index= Arrays.asList(prices).indexOf(min);
		System.out.println("\nLowest Price Product: ");
		prd[index].show();
	}
}