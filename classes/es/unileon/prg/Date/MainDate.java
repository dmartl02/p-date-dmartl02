package es.unileon.prg.Date;
public class MainDate {

		public static void main(String[] args) {
			
			Date today = new Date(2,4,2017)

			try {
				today = new Date(99, 12, 2017);
				System.out.println(today);
			} catch (DateException e) {
				System.out.println(e.getMessage());
			}
		}
}