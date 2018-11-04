package me.discord.choa.util;

import java.util.ArrayList;

import me.discord.choa.Main;
import net.dv8tion.jda.core.entities.ChannelType;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

 
public class BotListener extends ListenerAdapter {
    ArrayList<String> quee = new ArrayList<String>();


    
 
    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
		if (ChatListener.media.size()>=100){
			ChatListener.media.clear();
		}else if (ChatListener.general.size() >=100){
			ChatListener.general.clear();
		}else if (ChatListener.music.size() >=100){
			ChatListener.music.clear();
		}else{
        if (e.getMessage().getContent().startsWith("!")){
        	if (!e.getMessage().isFromType(ChannelType.PRIVATE)){
        	// && e.getMessage().getAuthor().getId() != e.getJDA().getSelfUser().getId()
        	Main.handleCommand(Main.parser.parsae(e.getMessage().getContent().toLowerCase(), e));
        	
        		}
        	}
        }
    }
}
    
  