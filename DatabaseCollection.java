package week3.day2;

public interface DatabaseCollection {

	
	public abstract void connect ();
	public abstract void disconnect();
	public abstract void executeUpdate();
}
