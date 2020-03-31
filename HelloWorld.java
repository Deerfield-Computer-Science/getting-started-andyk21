import acm.program.*;

public class HelloWorld extends ConsoleProgram{
	public void run() {
		println("Hello World");
		String name = readLine("What's your name? ");
		println("Hello there, " + name + "!");
	}
}
