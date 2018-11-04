package me.discord.choa.events;

public enum tof {
	
	True(true), False(false);
	private static tof answer;
	

	private boolean canJoin;

	tof(boolean canJoin){ 
		this.canJoin = canJoin;
	}
	public boolean canJoin(){ 
		return canJoin;
	} 
	public static void setstate (tof state){
		answer = state; 
		
	} public static boolean isState(tof state){
		return answer == state;
		}
	public static tof getstate(){
		return answer;
	}
}
