

public class DeckTest {

	public static void main(String[] args) {

		Deck d = new Deck();// 카드 한벌(Deck)을 만든다.
//		for (int i = 0; i < 52; i++) {
//			System.out.println("before : " + d.getCardArr()[i]);
//		}
		Card c = d.pick(0); // 섞기 전에 제일 위의 카드를 뽑는다.
//		System.out.println(c);
		d.shuffle();// 카드 섞음
//		for (int i = 0; i < 52; i++) {
//			System.out.println("after : " + d.getCardArr()[i]);
//		}
		c = d.pick(4);
		System.out.println(c);
		c = d.pick(4);
		System.out.println(c);
		c = d.pick(4);
		System.out.println(c);

	}

}
