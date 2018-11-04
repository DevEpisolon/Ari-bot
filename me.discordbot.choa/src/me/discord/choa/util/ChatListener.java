package me.discord.choa.util;

import java.util.ArrayList;

import net.dv8tion.jda.core.entities.ChannelType;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ChatListener extends ListenerAdapter {
	
	public static ArrayList <String> general = new ArrayList<String>();
	public static ArrayList <String> media = new ArrayList<String>();
	public static ArrayList <String> music = new ArrayList<String>();

	
	@Override
	 public void onMessageReceived(MessageReceivedEvent e) {
		
		if (e.getMessage().isFromType(ChannelType.PRIVATE)){
			
			
		}else{
		if (e.getMessage().getTextChannel().getName().contains("general")){
			general.add(e.getMessage().getId());
		}else if (e.getMessage().getTextChannel().getName().contains("media-links")){

			media.add(e.getMessage().getId());
		}else if (e.getMessage().getTextChannel().getName().contains("bot-commands")){

			music.add(e.getMessage().getId());
			}
		}	
	}
}
