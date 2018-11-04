package me.discord.choa;

import java.util.HashMap;

import me.discord.choa.util.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class waifu implements Command {
	private final String help = "Try !help";

    public static HashMap<String, String> waifu = new HashMap<String, String>();

	@Override
	public void action(String[] args,  MessageReceivedEvent event) {
	
	
		   if (!(args.length >= 2)){
			   event.getTextChannel().sendMessage("```Usage: !Waifu <name>").queue();
		}else{
			if (event.getMessage().getMentionedUsers().size() < 2){
			if (event.getMessage().getMentionedUsers().size() > 0){
			if (!(event.getMessage().getMentionedUsers().get(0).isBot())){
				if (event.getMessage().getMentionedUsers().get(0).getAsMention().toString().equals(event.getAuthor().getAsMention().toString())){
					event.getTextChannel().sendMessage("```One does not simply.```").queue();
				}else{
				if (!(waifu.containsKey(event.getAuthor().getAsMention()))){
					
				waifu.put(event.getAuthor().getAsMention(), event.getMessage().getMentionedUsers().get(0).getAsMention());
			event.getTextChannel().sendMessage("You waifu is now " + event.getMessage().getMentionedUsers().get(0).getAsMention()).queue();
				}else{
					event.getTextChannel().sendMessage("Your current waifu is:" + waifu.get(event.getAuthor().getAsMention())).queue();
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

