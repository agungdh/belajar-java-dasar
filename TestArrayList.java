import java.util.ArrayList;

class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();

		a.add("AgungDH");
		a.add("Sanji Chandra");
		a.add("Berlay");
		a.add("Bimo Bimi");
		a.add("Raka Riki");
		a.add("Silver Haru");

		printAL(a);
	}

	public static void printAL(ArrayList<String> al) {
		for (String nama : al) {
			System.out.println(nama);
		}
	}
}