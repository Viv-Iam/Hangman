
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomExample {

	private Random random = new Random();

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Boy");
		list.add("Cat");
		list.add("Dog");
		list.add("Elephant");

		RandomExample obj = new RandomExample();
		for(int i = 0; i < 10; i++){
			System.out.println(obj.getRandomList(list));
		}

	}

	public String getRandomList(List<String> list) {

	    //0-4
	    int index = random.nextInt(list.size());
	    System.out.println("\nIndex :" + index );
	    return list.get(index);

	}

}
