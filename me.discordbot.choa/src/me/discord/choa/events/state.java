package me.discord.choa.events;

public enum state {
	
	Start(false),End(true);
	private boolean canJoin;
	private static state currentstate;
	
	state(boolean canJoin){ 
		this.canJoin = canJoin;
	}
	public boolean canJoin(){ 
		return canJoin;
	} 
	public static void setstate (state state){
		currentstate = state; 
		
	} public static boolean isState(state state){
		return currentstate ==state;
		}
	public static state getstate(){
		return currentstate;
	}
}
