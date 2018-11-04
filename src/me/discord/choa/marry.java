package me.discord.choa;

import java.util.HashMap;

import me.discord.choa.util.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class marry implements Command {
	private final String help = "Try !help";

    public static HashMap<String, String> marry = new HashMap<String, String>();

	@Override
	public void action(String[] args,  MessageReceivedEvent event) {
	
		  if (!(args.length >= 2)){
			   event.getTextChannel().sendMessage("```Usage: !Marry <name>").queue();
		}else{
		if (event.getMessage().getMentionedUsers().size() < 2){
			if (event.getMessage().getMentionedUsers().size() > 0){
			if (!(event.getMessage().getMentionedUsers().get(0).isBot())){
				if (event.getMessage().getMentionedUsers().get(0).getAsMention().toString().equals(event.getAuthor().getAsMention().toString())){
					event.getTextChannel().sendMessage("```You cannot marry yourself.```").queue();
				}else{
				if (!(marry.containsKey(event.getAuthor().getAsMention()))){
					
				marry.put(event.getAuthor().getAsMention(), event.getMessage().getMentionedUsers().get(0).getAsMention());
			event.getTextChannel().sendMessage("You are now married to " + event.getMessage().getMentionedUsers().get(0).getAsMention()).queue();
				}else{
					event.getTextChannel().sendMessage("You are already married to " + marry.get(event.getAuthor().getAsMention())).queue();
						}
				}
						}
					}
		}
		}
	
		}
		
	
	

	@Override
	public String help() {
		return help;
	}

	@Override
	public boolean called(String[] args, MessageReceivedEvent event) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void executed(boolean success, MessageReceivedEvent event) {
		// TODO Auto-generated method stub
		
	}

}

