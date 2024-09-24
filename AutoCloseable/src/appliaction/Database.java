package appliaction;

public class Database implements AutoCloseable {

	private String connectionString;

	public Database(String connectionString) throws Exception {
		System.out.printf("Opening connection to %s\n", connectionString);
		
		if(connectionString == null) {
			throw new Exception("Cannot connect to db " + connectionString);
		}
		
		this.connectionString = connectionString;
		System.out.println("Connected to " + connectionString);
	}
	
	public void getData() throws Exception {
		System.out.printf("Getting data from %s\n", connectionString);
		
		if(connectionString.length() < 3) {
			throw new Exception("Cannot get data from db " + connectionString);
		}
	}
	
	public void close() throws Exception {
		System.out.println("Closing connection...");
		
		if(connectionString == null) {
			throw new Exception("Cannot close to db " + connectionString);
		}
		
		System.out.println("Connection closed.");
	}
}
