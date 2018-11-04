package me.discord.choa;

import java.util.ArrayList;
import java.util.HashMap;
import me.discord.choa.util.Command;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class battle implements Command {
	private final String help = "Try !help";
	
	public static HashMap<String, String> battleplayers = new HashMap<String, String>();
	public static HashMap<String, String> name = new HashMap<String, String>();

	public static ArrayList<String> battlelist = new ArrayList<String>();
	public static Message m;
	public static String id;

	@Override
	public void action(String[] args,  MessageReceivedEvent event) {
	if (args.length < 7){

	if (event.getMessage().getMentionedUsers().size() < 2){
		if (event.getMessage().getMentionedUsers().size() > 0){

	if (!(event.getMessage().getMentionedUsers().get(0).isBot())){
		if (event.getMessage().getMentionedUsers().get(0).getAsMention().toString().equals(event.getAuthor().getAsMention().toString())){
			event.getTextChannel().sendMessage("```You cannot challange yourself.```").queue();
		}else{
		id = "0";	
		m = event.getTextChannel().sendMessage(":crossed_swords: " + event.getMessage().getMentionedUsers().get(0).getAsMention() +
				" ***You have been challenged by*** " + event.getAuthor().getAsMention()).complete();
		m.addReaction("👍").queue();
		m.addReaction("👎").queue();
		id = m.getId();
		battleplayers.put(event.getMessage().getMentionedUsers().get(0).getAsMention(),event.getAuthor().getAsMention());
		
		//battleplayers.put(event.getAuthor().getAsMention(),event.getMessage().getMentionedUsers().get(0).getAsMention());
		
	name.put(event.getMessage().getMentionedUsers().get(0).getName(),event.getAuthor().getName());
		
		name.put(event.getAuthor().getName(),event.getMessage().getMentionedUsers().get(0).getName());

	//event.getTextChannel().sendMessage(":crossed_swords: " + event.getMessage().getMentionedUsers().get(0).getAsMention() +
	//" ***You have been challenged by*** " + event.getAuthor().getAsMention()).complete().addReaction(":thumbsup:").queue();
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

