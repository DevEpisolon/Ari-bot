package me.discord.choa;




import java.util.ArrayList;
import java.util.Random;

import me.discord.choa.events.nstate;
import me.discord.choa.events.state;
import me.discord.choa.util.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class number implements Command {
	private final String help = "Try !help";
	public static int hiddennumber;
	public static ArrayList<String> nlobby = new ArrayList<String>();
	public static ArrayList<String> winners = new ArrayList<String>();
	public static String textchannel;


	@Override
	public void action(String[] args,  MessageReceivedEvent event) {
		if (event.getMember().getRoles().toString().contains("Admin") || event.getMember().getRoles().toString().contains("Mod") ){
			event.getMessage().delete().queue();
		Random rand = new Random();

    	int  n = rand.nextInt(5) + 1;
    	 
    	
		if (nstate.isState(state.Start)){
			nstate.setstate(state.End);
			System.out.println("end");
		
			event.getTextChannel().sendMessage(" :8ball: ***Congrats to these following individuals they were smarter then the rest of you " + winners + ". Better luck next time! Winning number was: " + hiddennumber + "***").queue();
			hiddennumber = 0;
		}else{
			nlobby.clear();
			winners.clear();
			textchannel= event.getTextChannel().toString();
			System.out.print("Textchannel"  + textchannel);
		event.getTextChannel().sendMessage(":8ball: ***Guess where the ball is hidden! Choose*** :one: :two: :three:  :four:  :five:").queue();
		 hiddennumber = n;
		System.out.println("The hidden number is " + hiddennumber);
 	   nstate.setstate(state.Start);
  
					}
				}
			}
		
	public void executed(boolean success,  MessageReceivedEvent event) {
	return;
	}
	public boolean called(String[] args, MessageReceivedEvent event) {
		
		return false;
	}
	
	@Override
	public String help() {
		return help;
	}




}
