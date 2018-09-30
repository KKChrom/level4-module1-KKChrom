package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.

		public  void hD()
		{
			Zodiac z = Zodiac.AQUARIUS;
			switch(z)
			{
			case ARIES:
			{
				JOptionPane.showMessageDialog(null, " ok so aries ");
				break;
			}
			case TAURUS:
			{
				JOptionPane.showMessageDialog(null, " ok so taurus");
				break;
			}
			case GEMINI:
			{
				JOptionPane.showMessageDialog(null, " ok so gemini");
				break;
			}
			case CANCER:
			{
				JOptionPane.showMessageDialog(null, " ok so cancer");
				break;
			}
			case LEO:   
			{                         
				JOptionPane.showMessageDialog(null, " ok so leo");
				break;
			}
			case VIRGO:
			{ 
				JOptionPane.showMessageDialog(null, " ok so virgo");
				break;
			}
			case LIBRA:
			{
				JOptionPane.showMessageDialog(null, " ok so libra");
				break;
			}
			case SCORPIO:
			{ 
				JOptionPane.showMessageDialog(null, " ok so scorpio");
				break;
			}
			case SAGITTARIUS:
			{ 
				JOptionPane.showMessageDialog(null, " ok so sagittarius");
				break;
			}
			case CAPRICORN:
			{
				JOptionPane.showMessageDialog(null, " ok so capricorn");
				break;
			}
			case AQUARIUS:
			{
				JOptionPane.showMessageDialog(null, " ok so bestwateryboi");
				break;
			}
			case PISCES:
			{
				JOptionPane.showMessageDialog(null, " ok so pisces");
				break;
			}
			}
		}
	// 3. Make a main method to test your method
		public static void main(String[] args)
		{
			_00_Horoscope h = new _00_Horoscope();
			h.hD();
		}
}
