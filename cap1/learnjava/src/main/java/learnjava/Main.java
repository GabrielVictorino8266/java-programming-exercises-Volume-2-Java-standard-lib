package learnjava;

public class Main {

	public static void main(String[] args) {
//		ex001();
		ex002();
	}
	
	public void ex001() {
		int charStart = 32;
		int charFinal = 127;
		for(int i = charStart; i <= charFinal; i++) {
			char c = (char) i;
			if(i == 127) {
				System.out.print(" del");
			}else {
				System.out.print(c + " ");	
			}
		}
	}
	
	public static void ex002() {
		String[] names = {"Gabriel Victorino", "José", "Vitor"};
		boolean[] paids = {true, false, false};
		try {
			printList(names, paids);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private static void printList(String[] names, boolean[] paids) throws Exception {
		final String IS_PAID = "paid";
		final String IS_NOTPAID = "not paid";
		
		if(names == null || paids == null)
			throw new NullPointerException("Um dos arrays é nulo. Verifique.");
		
		if(names.length != paids.length)
			throw new Exception("Arrays de tamanhos diferentes. Verifique.");
		
		String[] header = {"NAMES", "IS_PAID"};
		String[] paidStr = new String[paids.length];
		if(paids != null) {
			for(int i = 0; i<paids.length;i++) {
					paidStr[i] = paids[i] ? IS_PAID : IS_NOTPAID;
			}
		}
		
		String headerPrint = String.format("%-20s     %-8s", header[0], header[1]);
		System.out.println(headerPrint);
		
		for(int i = 0; i < names.length; i++) {
			System.out.format("%-20s     %-8s\n", names[i], paids[i]);
		}
	}

}
