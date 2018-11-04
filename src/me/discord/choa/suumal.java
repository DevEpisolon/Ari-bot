package me.discord.choa;

import me.discord.choa.util.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class suumal implements Command{
	private final String help = "Try !help";

	public void action(String[] args,  MessageReceivedEvent event) {

		event.getTextChannel().sendMessage("https://kitsu.io/users/Sollux/library").queue();
	

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
