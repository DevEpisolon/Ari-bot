package me.discord.choa;





import me.discord.choa.util.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class emotes implements Command {
	private final String help = "Try !help";

	@Override
	public void action(String[] args,  MessageReceivedEvent event) {
	
		event.getTextChannel().sendMessage("```Emotes: " + event.getGuild().getEmotes().toString().replaceAll("[0-9]","").replaceAll("E:","").
				replace("()","") + " ```").queue();
		System.out.println(event.getGuild().getEmotes().toString());
	
		
		

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
