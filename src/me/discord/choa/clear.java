package me.discord.choa;




import me.discord.choa.util.ChatListener;
import me.discord.choa.util.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class clear implements Command {
	private final String help = "Try !help";

	
	@Override
	public void action(String[] args,  MessageReceivedEvent event) {


		//messages.add(event.getMessage().getId());
		

	if (event.getMember().getRoles().toString().contains("Admin") || event.getMember().getRoles().toString().contains("Mod") ){
		if (event.getMessage().getTextChannel().getName().contains("general")){
			ChatListener.general.trimToSize();

			event.getTextChannel().deleteMessagesByIds(ChatListener.general).queue();
			event.getTextChannel().deleteMessageById(event.getMessage().getId()).queue();;
	
			ChatListener.general.clear();
	}else if (event.getMessage().getTextChannel().getName().contains("bot-commands")){
				ChatListener.music.trimToSize();
				event.getTextChannel().deleteMessagesByIds(ChatListener.music).queue();
				event.getTextChannel().deleteMessageById(event.getMessage().getId()).queue();;
		
				ChatListener.music.clear();
			
	}else if (event.getMessage().getTextChannel().getName().contains("media-links")){
		ChatListener.media.trimToSize();

		event.getTextChannel().deleteMessagesByIds(ChatListener.media).queue();;
		ChatListener.media.clear();
		event.getTextChannel().deleteMessageById(event.getMessage().getId()).queue();;
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
