package me.discord.choa.util;


import me.discord.choa.number;
import me.discord.choa.events.nstate;
import me.discord.choa.events.state;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class numbergame extends ListenerAdapter {


 
    @Override
    public void onMessageReceived(MessageReceivedEvent e){  
    if (nstate.isState(state.Start)){
    
    	if(!(number.textchannel == null)){
    	
    	if (!(number.nlobby.contains(e.getAuthor().getAvatarId().toString()))){
    		if(!(number.textchannel == null)){
    	if (e.getTextChannel().toString().contains(number.textchannel)){
    
   	 if (e.getMessage().getContent().equals("1") || e.getMessage().getContent().equals("2")  || e.getMessage().getContent().equals("3") 
			 || e.getMessage().getContent().equals("4") || e.getMessage().getContent().equals("5")){
		 number.nlobby.add(e.getAuthor().getAvatarId());
	 }
if (e.getMessage().getContent().equals("" + number.hiddennumber)){
	number.winners.add(e.getAuthor().getAsMention());
		}
	}
}
    	}
    		}
    			}
    	}
}
    
    
    