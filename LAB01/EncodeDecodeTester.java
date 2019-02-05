package LAB01;

public class EncodeDecodeTester {

	public static void main(String[] args) {
		String[] originalList = {"4Pp13 S4UC3" , "abcdefghijklmnopqrstuvwxyz" , "0123456789", "H311!!@#0" , "jkiuu780"};
		
		EncodeDecode encoder = new EncodeDecode(originalList);
		System.out.println("The original list is: ");
		for (int i = 0; i < originalList.length; i++) {
			System.out.println(originalList[i]);
		}
		System.out.println();
		
		System.out.println("The encoded list is: ");
		for (int i = 0; i < encoder.getEncodedList().length; i++) {
			System.out.println(encoder.getEncodedList()[i]);
		}
		System.out.println();
		
		System.out.println("The decoded list is: ");
		for (int i = 0; i < encoder.getDecodedList().length; i++) {
			System.out.println(encoder.getDecodedList()[i]);
		}
	}
}

