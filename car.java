package week1.day1;

public class car {
        public void startcar() {
        	System.out.println("start the car");
       
        }
        public void turnright() {
        	System.out.println("turn the right");
        }
        public void turnleft() {
        	System.out.println("turn the left");
        }
        public void takereverse() {
        	System.out.println("reverse the car");
        }
        public void openwindow () {
        	System.out.println("open the window");
        }
        public void putonac() {
        	System.out.println("on the ac");
        }
        
        public void applybreak() {
        	System.out.println("apply the break");
        }
        public static void main(String[] args) {
			car obj=new car();
			obj.startcar();
			obj.putonac();
			obj.applybreak();
			obj.takereverse();
			obj.turnleft();
			obj.turnright();
			obj.openwindow();
		}
}