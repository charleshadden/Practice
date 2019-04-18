import java.util.ArrayList;

public class HelloWorld {

	public static void main(String[] args) {

		ArrayList<Soda> sodas = new ArrayList<>();

		Soda soda1 = new Soda();
		Soda soda2 = new Soda();
		Soda soda3 = new Soda();

		soda1.setName("BigRed");
		if(soda1.getName() != "BigRed") {
			System.out.println("fail");
		} 
		
		soda1.setPrice(1);
		soda1.setHealthRating(2);
		soda1.setType("soda");

		soda2.setName("Mountain Dew");
		soda2.setPrice(2);

		soda3.setName("Coke");
		soda3.setPrice(3);

		sodas.add(soda1);
		sodas.add(soda2);
		sodas.add(soda3);


		soda1.drink();
			
			
		}
		
	
	}

