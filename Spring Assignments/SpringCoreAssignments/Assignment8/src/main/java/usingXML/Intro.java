package usingXML;

public class Intro {
	public void init() throws Exception {
		System.out.println("Using Xml for initializing bean");
	}
	
	public void destroy() throws Exception
    {
        System.out.println(
            "Using Xml for disposable bean");
    }
}
