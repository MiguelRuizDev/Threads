public class TestTuberia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tuberia t = new Tuberia();
		Productor p = new Productor(t);
		Consumidor c = new Consumidor(t);

		p.start();
		c.start();

	}

}
