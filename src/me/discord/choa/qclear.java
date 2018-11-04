package me.discord.choa;




import me.discord.choa.util.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class qclear implements Command {
	private final String help = "Try !help";

	
	
	@Override
	public void action(String[] args,  MessageReceivedEvent event) {
		
		

	if (event.getMember().getRoles().toString().contains("Admin") || event.getMember().getRoles().toString().contains("Mod") ){
		queue.queuemembers.clear();
		queue.inqueue.clear();
	
		event.getTextChannel().sendMessage("```Now clearing queue list.```").queue();
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
