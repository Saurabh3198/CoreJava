package interfacepackage;
// variables are always static in interface
// variables are constant here. we cant change its value.
// write constants in capital
// interface not faces the body. it contain only method
// we cant create constructor in interface
// Mwhile making two interface, one as parent and one as child use extends keyword
public interface RBI {

	public final static int V = 56;
	int ABC = 45;// we dont to need to write public final static before variable because java
					// already did it
	int PQR =90;
	
	public abstract void homeloaninterestrate();// abstract method
	
	public void carloaninterestrate();// dont need to write abstract always. java does it automatically in interface
	
	
	
}
