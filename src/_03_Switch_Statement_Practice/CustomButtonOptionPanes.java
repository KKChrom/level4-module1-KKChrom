package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			System.out.println("Its monday... already??\n" + 
					"\n" + 
					": )\n" + 
					"\n" + 
					"u know what that means...\n" + 
					"\n" + 
					"Time To Shake Youre Tail Like This Funny Cat Doe\n" + 
					"\n" + 
					"s\n" + 
					"\n" + 
					": ) Happy a Good Monday :)\n" + 
					"\n" );
			break;
		case "Monday":
			System.out.println("Its monday... already??\n" + 
					"\n" + 
					": )\n" + 
					"\n" + 
					"u know what that means...\n" + 
					"\n" + 
					"Time To Shake Youre Tail Like This Funny Cat Doe\n" + 
					"\n" + 
					"s\n" + 
					"\n" + 
					": ) Happy a Good Monday :)\n" + 
					"\n" );
			break;
		case "Tuesday":
			System.out.println("Its monday-6... already??\n" + 
					"\n" + 
					": )\n" + 
					"\n" + 
					"u know what that means...\n" + 
					"\n" + 
					"Time To Shake Youre Tail Like This Funny Cat Doe\n" + 
					"\n" + 
					"s\n" + 
					"\n" + 
					": ) Happy a Good Monday-6 :)\n" + 
					"\n" );
			break;
		case "Wednesday":
			System.out.println("Its monday-5... already??\n" + 
					"\n" + 
					": )\n" + 
					"\n" + 
					"u know what that means...\n" + 
					"\n" + 
					"Time To Shake Youre Tail Like This Funny Cat Doe\n" + 
					"\n" + 
					"s\n" + 
					"\n" + 
					": ) Happy a Good Monday-5 :)\n" + 
					"\n" );
			break;
		case "Thursday":
			System.out.println("Its monday-4... already??\n" + 
					"\n" + 
					": )\n" + 
					"\n" + 
					"u know what that means...\n" + 
					"\n" + 
					"Time To Shake Youre Tail Like This Funny Cat Doe\n" + 
					"\n" + 
					"s\n" + 
					"\n" + 
					": ) Happy a Good Monday-4 :)\n" + 
					"\n" );
			break;
		case "Friday":
			System.out.println("Its monday-3... already??\n" + 
					"\n" + 
					": )\n" + 
					"\n" + 
					"u know what that means...\n" + 
					"\n" + 
					"Time To Shake Youre Tail Like This Funny Cat Doe\n" + 
					"\n" + 
					"s\n" + 
					"\n" + 
					": ) Happy a Good Monday-3 :)\n" + 
					"\n" );
			break;
		case "Saturday":
			System.out.println("Its monday-2... already??\n" + 
					"\n" + 
					": )\n" + 
					"\n" + 
					"u know what that means...\n" + 
					"\n" + 
					"Time To Shake Youre Tail Like This Funny Cat Doe\n" + 
					"\n" + 
					"s\n" + 
					"\n" + 
					": ) Happy a Good Monday-2 :)\n" + 
					"\n" );
			break;
			
	}
	}
}
