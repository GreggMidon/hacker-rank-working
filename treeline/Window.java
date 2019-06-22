package treeline;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Window {

	private final static String windowStringPattern = "X=(\\d+)\\sY=(\\d+)\\sW=(\\d+)\\sH=(\\d+)";
	int x;
	int y;
	int w;
	int h;
	
	public Window(String windowString) {
		this.parseWindowString(windowString);
	}

	private void parseWindowString(String windowString) {

		Pattern pattern = Pattern.compile(windowStringPattern);
		
		Matcher m = pattern.matcher(windowString);
		if(m.find()) {
			this.x = Integer.parseInt(m.group(1));
			this.y = Integer.parseInt(m.group(2));
			this.w = Integer.parseInt(m.group(3));
			this.h = Integer.parseInt(m.group(4));
		}
	}
	
	@Override
	public String toString() {
		return "X=" + x + " Y=" + y + " W=" + w + " H=" + h;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
		
	
}
