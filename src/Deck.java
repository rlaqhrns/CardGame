
public class Deck {
	Card cardArr[] = new Card[52];

	Deck() {

		for (int k = 4, i = 0; k > 0; k--) {
			for (int n = 1; n <= 13; n++) {
				cardArr[i++] = new Card(k, n);
			}
		}
	}

	Card[] getCardArr() {
		return this.cardArr;
	}

	Card pick(int index) {
		return cardArr[index % 52];
	}

	Card pick() {
		int index = (int) (Math.random() * 52);
		return pick(index);
	}

	void shuffle() {
		for (int n = 0; n < 1000; n++) {
			int i = (int) (Math.random() * 52);
			Card temp = cardArr[0];
			cardArr[0] = cardArr[i];
			cardArr[i] = temp;
		}
	}

}
