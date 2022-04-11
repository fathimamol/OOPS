import java.util.*;

class Complex
{
	int real, img;
	Complex(int real, int img){
		this.real = real;
		this.img = img;
	}
	void show(){
		System.out.println("Complex number = " + this.real + " + " + this.img + " i ");
	}
	public static Complex add(Complex n1, Complex n2){
		Complex res = new Complex(0,0);
		res.real = n1.real + n2.real;
		res.img = n1.img + n2.img;
		return res;
	}

	public static void main(String args[]){
		Complex[] c = new Complex[2];
		Scanner sc = new Scanner(System.in);
		int l_real, l_img;
		
		for(int i = 0; i<2; i++){
			System.out.print("Complex no " + (i+1) + " Real: ");
			l_real = sc.nextInt();
			System.out.print("Complex no " + (i+1) + " Img: ");
			l_img = sc.nextInt();

			c[i] = new Complex(l_real, l_img);
		}
		
		Complex res = add(c[0], c[1]);
		System.out.println("Addition is :");
        	res.show();
	}
}