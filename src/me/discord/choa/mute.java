package me.discord.choa;

import java.util.ArrayList;
import java.util.HashMap;

import me.discord.choa.util.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class mute implements Command {
	private final String help = "Try !help";

	public static ArrayList<String> mute = new ArrayList<String>();

	@Override
	public void action(String[] args,  MessageReceivedEvent event) {
		if (event.getMember().getRoles().toString().contains("Admin") || event.getMember().getRoles().toString().contains("Mod")  || event.getMember().getRoles().toString().contains("Helper")){
		if (args.length < 3){
		if (event.getMessage().getMentionedUsers().size() < 2){
		if (event.getMessage().getMentionedUsers().size() > 0){
		if (!(event.getMessage().getMentionedUsers().get(0).isBot())){
		if (event.getMessage().getMentionedUsers().get(0).getAsMention().toString().equals(event.getAuthor().getAsMention().toString())){
					event.getTextChannel().sendMessage("```You cannot mute yourself!```").queue();
		}else{
		if (!(event.getGuild().getMember(event.getMessage().getMentionedUsers().get(0)).getRoles().toString().contains("Admin") || 
		event.getGuild().getMember(event.getMessage().getMentionedUsers().get(0)).getRoles().toString().contains("Mod") 
		 || 		event.getGuild().getMember(event.getMessage().getMentionedUsers().get(0)).getRoles().toString().contains("Helper"))){

				if (!(mute.contains(event.getMessage().getMentionedUsers().get(0).getAsMention()))){
					mute.add(event.getMessage().getMentionedUsers().get(0).getAsMention());
					event.getTextChannel().sendMessage(event.getMessage().getMentionedUsers().get(0).getName() + " has been muted.").queue();

				}else{
					mute.remove(event.getMessage().getMentionedUsers().get(0).getAsMention());
					event.getTextChannel().sendMessage(event.getMessage().getMentionedUsers().get(0).getName() + " has been unmuted.").queue();


				}
						}
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
