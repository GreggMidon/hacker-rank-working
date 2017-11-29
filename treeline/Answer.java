package treeline;

public class Answer {

	public static String getEnclosingRectangle(String[] windows) {
		
		int x1 = -1;
		int y1 = -1;
		int x2 = -1;
		int y2 = -1;
		
		for(String wnd: windows) {
			Window w = new Window(wnd);
			
			int wx = w.getX();
			int wy = w.getY();
			int wh = w.getH();
			int ww = w.getW();
			
			if(wx < x1 || x1 == -1) {
				x1 = wx;
			}
			
			if(wy < y1 || y1 == -1) {
				y1 = wy;
			}
			
			if(wx + ww > x2 || x2 == -1) {
				x2 = wx + ww;
			}
			
			if(wy + wh > y2 || y2 == -1) {
				y2 = wy + wh;
			}

		}
		int width = x2 - x1;
		int height = y2 - y1;
		
		
		
		
		return "X=" + x1 + " Y=" + y1 + " W=" + width + " H=" + height;
		
		
	}
	
	public static void main(String args[]) {
		
		String[] firstWindow = {"X=5 Y=9 W=10 H=40", "X=11 Y=79 W=10 H=40", "X=12 Y=17 W=10 H=40", "X=15 Y=9 W=10 H=40"};
		//String[] secondWindow = {"X=0 Y=0 W=1 H=5","X=0 Y=8 W=1 H=9","X=3 Y=1 W=10 H=12"};

		//String[][] windowStrings = {firstWindow, secondWindow};

		//for(String[] windows: windowStrings) {
			System.out.println(getEnclosingRectangle(firstWindow));	
		//}
	}
}
