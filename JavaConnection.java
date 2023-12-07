package week3.day2;

public class JavaConnection extends MySqlConnection implements DatabaseCollection{
	
	

	public static void main(String[] args) {
		JavaConnection j1 = new JavaConnection();
		j1.connect();
		j1.disconnect();
		j1.executeQuery();
		j1.executeUpdate();
	
}

	public void connect() {
		System.out.println("Connection success");
	}

	public void disconnect() {
		
		System.out.println("Disconnection success");
	}

	public void executeUpdate() {
		System.out.println("execution update success");
		
	}

	@Override
	public void executeQuery() {
		System.out.println("execution success");
	}
}