

public class Card {
	int kind;
	int number;

	String[] kinds = { "","CLOVER", "HEART", "DYAMOND", "SPADE" };
	String[] numbers = {"0","1","2","3","4","5","6","7","8","9","10","J","Q","K"};

	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString() { //Object 객체를 무조건 상속받으면서 Object의 toString을 사용하지
		//않고 내가 정의한 toString()을 사용해라(오버라이딩)
		return "kind : " + kinds[this.kind] + ", number : " + numbers[this.number];

	}

}
