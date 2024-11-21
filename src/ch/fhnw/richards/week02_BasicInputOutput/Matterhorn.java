package ch.fhnw.richards.week02_BasicInputOutput;

public class Matterhorn {

	public static void main(String[] args) {
		String matterhorn = "Matterhorn";
		String matter = matterhorn.substring(0, 6);
		String horn = matterhorn.substring(6);
		System.out.println(matter + ", " + horn);
		
		String hornMatter = horn + matter;
		System.out.println(hornMatter);
		
		String matterhorn2 = matter + horn;
		System.out.println(matterhorn2);
		
		boolean areTheSame = (matterhorn == matterhorn2);
		System.out.println(areTheSame);
	}

}
