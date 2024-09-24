package appliaction;

public class App {

	public static void main(String[] args) {
		Database db = null;
		
		try {
//			db = new Database("localhost:3306");
//			db = new Database("DB");
			db = new Database(null);
			db.getData();
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				db.close();
			} catch(NullPointerException e) {
				System.out.println(e.getMessage());
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
