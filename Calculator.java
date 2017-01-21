public class Calc{
	public static void main String [] args {

		if ( args[0].equals("add")){
			double firstNumber= Double.parseDouble(args[1]);
			double secondNumber= Double.parseDouble(args[2]);

			System.out.println(firstNumber+secondNumber);
		}




	else if ( args[1].equals("subtract")){
			double firstNumber= Double.parseDouble(args[1]);
			double secondNumber= Double.parseDouble(args[2]);

			System.out.println(firstNumber-secondNumber);
		}	
	
		else if ( args[1].equals("multiply")){
			double firstNumber= Double.parseDouble(args[1]);
			double secondNumber= Double.parseDouble(args[2]);

			System.out.println(firstNumber*secondNumber);
		}

		else if(args[1].equalsIgnoreCase("divide")){
		 System.out.println(Double.parseDouble(args[1])/Double.parseDouble(args[2]));

		}
	}
}

