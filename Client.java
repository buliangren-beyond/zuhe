package zuhe;
//组合模式
public class Client {
	public static void main(String args[]) {
		Plate plate1,plate2,plate3;
		MyElement element1,element2,element3;
		element1 = new Apple();
		element2 = new Banana();
		element3 = new Pear();
		
		plate1 = new Plate();
		plate2 = new Plate();
		plate3 = new Plate();
		
		plate1.add(element1);
		plate2.add(element2);
		plate3.add(plate1);
		plate3.add(plate2);
		plate3.add(element3);
		plate3.eat();
	}
}
