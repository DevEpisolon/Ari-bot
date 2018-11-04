package me.discord.choa;


import java.util.ArrayList;
import java.util.HashMap;

import me.discord.choa.util.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class queue implements Command {
	private final String help = "Try !help";
		public static ArrayList<String> queuemembers = new ArrayList<String>();
		public static HashMap<String, String> inqueue = new HashMap<String, String>();

		

	@Override
	public void action(String[] args,  MessageReceivedEvent event) {
		if (inqueue.get(event.getAuthor().getId()) == null){
		
		inqueue.put(event.getAuthor().getId(), "true");
		event.getTextChannel().sendMessage(event.getMember().getAsMention() + " is currently in queue.").queue();
		queuemembers.remove(event.getAuthor().getName());
		queuemembers.add(event.getAuthor().getName());
		
		}else if (inqueue.get(event.getAuthor().getId()) == "true"){
			inqueue.remove(event.getAuthor().getId());
			event.getTextChannel().sendMessage(event.getMember().getAsMention() + " is no longer in queue" ).queue();
			

			queuemembers.remove(event.getAuthor().getName());

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
