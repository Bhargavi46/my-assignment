package week1.day1;

public class mobile {
	public void takephotos() {
		System.out.println(" taking photos");
	}
	public void playvedio() {
		System.out.println("playing the vedio");
	}
	public void downloadfiles() {
		System.out.println("downloading the files");
	}
	public void takeselfie() {
		System.out.println("taking selfie");
	}
	public void sendmessage() {
		System.out.println("sending message to moni");
	}
	public void vediocalling() {
		System.out.println("doing vedio call to moni");
	}
	public void updateapps() {
		System.out.println("updating the apps");
	}
	public static void main(String[] args) {
		mobile obj=new mobile();
	    obj.sendmessage();
		obj.takephotos();
		obj.downloadfiles();
		obj.playvedio();
		obj.updateapps();
		obj.takeselfie();
	}
}
	
	
	
	

}
