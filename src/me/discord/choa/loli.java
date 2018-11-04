package me.discord.choa;





import java.util.ArrayList;
import java.util.Random;

import me.discord.choa.util.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class loli implements Command {
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
		    	Random rand = new Random();
		    	type = 0;
		    	n = 0;
							
				
		    	int  type = rand.nextInt(2) + 1;

		    	int  n = rand.nextInt(100) + 1;
	    		cdr.add(event.getAuthor().getId());
	    		if (n >=0 && n <=45){
	    			//event.getTextChannel().sendMessage("<:wanwan:319589834962239488>").queue();
			    	event.getTextChannel().sendMessage(":blue_heart: *You have recieved a* **Common** *Type.*").queue();
			    	
		    	}else if (n <= 45) {
		    	//common
		    		if (type == 1) {	
		    		//event.getTextChannel().sendMessage("<:wanwan:319589834962239488>").queue();
		    	event.getTextChannel().sendMessage(":blue_heart: *You have recieved a* **Common** *Type.*").queue();
		    		}else{
		    			//event.getTextChannel().sendMessage("<:Wat:317890723645227008>").queue();
				    	event.getTextChannel().sendMessage(":blue_heart: *You have recieved a* **Common** *Type.*").queue();
		    		}
		    		}else if (n <= 75) {
		    			if (type ==1) {
		    				//event.getTextChannel().sendMessage("<:Kanna:317890792616099841>").queue();
					    	event.getTextChannel().sendMessage(":purple_heart: *You have recieved a* **Uncommon** *Type.*").queue();

		    			}else {
		    				//event.getTextChannel().sendMessage("<:BAKKKA:331258195588939776>").queue();
					    	event.getTextChannel().sendMessage(":purple_heart: *You have recieved a* **Uncommon** *Type.*").queue();

		    	//uncommon
	
		    	}
		    	}else if (n <= 95) {
		    		//rare
		    	if (type == 1) {
		    		
		    	event.getTextChannel().sendMessage("<:Upsetti:331258133030764544>").queue();
		    	event.getTextChannel().sendMessage(":green_heart: *You have recieved a* **Rare** *Type.*").queue();
		    
		    	}else{
		    		event.getTextChannel().sendMessage("<:Saddddd:331753240569970689>").queue();
			    	event.getTextChannel().sendMessage(":green_heart: *You have recieved a* **Rare** *Type.*").queue();
		    	}
		    	}else if (n <= 100) {
		    	//super rare

		    		if (type == 1) {
			    		
			    		
			    	event.getTextChannel().sendMessage("<:Hent:317902973881810974>").queue();
			    	event.getTextChannel().sendMessage(":black_heart: *You have recieved a* **Super Rare** *Type.*").queue();
			    
			    	}else{
			    		event.getTextChannel().sendMessage("<:Lewd:331258430767759360>").queue();
				    	event.getTextChannel().sendMessage(":black_heart: *You have recieved a* **Super Rare** *Type.*").queue();
		    	}
		    	}
		    		new java.util.Timer().schedule( 
		    		        new java.util.TimerTask() {
		    		            @Override
		    		            public void run() {
		    		            	cdr.remove(event.getAuthor().getId());
		    		            }
		    		        },
		    		         7000
		    		);
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
