package me.discord.choa;

import me.discord.choa.util.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class help implements Command {
	private final String help = "Try !help";

	@Override
	public void action(String[] args,  MessageReceivedEvent event) {
		event.getAuthor().openPrivateChannel().complete();

		event.getAuthor().openPrivateChannel().submit();
		event.getAuthor().openPrivateChannel().queue();

		event.getTextChannel().sendMessage(event.getAuthor().getAsMention() + " a list of commands has been sent to you.").queue();
		event.getAuthor().openPrivateChannel().complete().sendMessage("```Commands:" 
				+ "\n!queue- Used to queue into wait list.<Toggable> " +
				"\n!qlist- Used to check queue list. " + 
				 "\n!qclear- Used to clear queue list.<Mods+> " +
				 "\n!emotes- For a list of emotes. " +
				 "\n!waifu- Used to get a random waifu from the server. " +
				 "\n!marry- Used marry a user of your choice. " +
				 "\n!battle - Used to battle a user." +
				 "\n!give - Used to give yourself a role." +
				 "\n!remove - Used to remove a role." +
				 "\n!loli - Used to recieve a loli(7s cd)." +



				"```" ).queue();

		event.getAuthor().openPrivateChannel().complete();

	

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
