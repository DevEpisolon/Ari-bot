package me.discord.choa;





import java.util.ArrayList;
import java.util.Random;

import me.discord.choa.util.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class rep implements Command {
	private final String help = "Try !help";
	public static ArrayList<String> cdr = new ArrayList<String>();
	int type;
	int n;
	public String Author;


	@Override
	public void action(String[] args,  MessageReceivedEvent event) {
		if (cdr.contains(event.getAuthor().getId())) {
			event.getTextChannel().sendMessage("```This command in on cooldown.```").queue();
		}else {
    		cdr.add(event.getAuthor().getId());

		    	}
		    		new java.util.Timer().schedule( 
		    		        new java.util.TimerTask() {
		    		            @Override
		    		            public void run() {
		    		            	cdr.remove(event.getAuthor().getId());
		    		            }
		    		        },
		    		         1000 * 60 * 60
		    		         //1 hour
		    		);
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
