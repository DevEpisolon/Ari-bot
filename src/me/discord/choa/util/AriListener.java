package me.discord.choa.util;

import java.util.Random;


import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class AriListener extends ListenerAdapter {
	
	@Override
	 public void onMessageReceived(MessageReceivedEvent e) {
	
		

	    	Random rand = new Random();

	    	int  n = rand.nextInt(30) + 1;
	    	if (!e.getMember().getRoles().toString().contains("Ari")){
	    	}else{
	        if (e.getMessage().getContent().contains("ari ") || e.getMessage().getContent().contains("Ari ") ||e.getMessage().getContent().contains("Ari?") 
	        		||e.getMessage().getContent().contains("Ari!") ||e.getMessage().getContent().contains("Ari.") 
	        		||e.getMessage().getContent().contains("ari?")||e.getMessage().getContent().contains("ari!")||e.getMessage().getContent().contains("ari.") 
	        		|| e.getMessage().getContent().equalsIgnoreCase("Ari")|| e.getMessage().getContent().contains(" Ari") || e.getMessage().getContent().contains(" ari")){
	        	
	        	if (n == 1){
	        		e.getTextChannel().sendMessage(":3").queue();
	        	}else if (n == 2){	
	        		e.getTextChannel().sendMessage("Shhh im going to sleep..").queue();
	        	}else if (n == 3){
	        		e.getTextChannel().sendMessage("Ohaio! ").queue();
	        	}else if (n == 4){
	        		e.getTextChannel().sendMessage("(◕‿◕✿)").queue();
	        	}else if (n == 5){
	        		e.getTextChannel().sendMessage("Hiya, uwu").queue();
	        	}else if (n == 6){
	        		e.getTextChannel().sendMessage("Sombeody mention me?").queue();
	        	}else if (n == 7){
	        		e.getTextChannel().sendMessage("Nani?").queue();
	        	}else if (n == 8){
	        		e.getTextChannel().sendMessage("Aaaaaannnndd muted!").queue();
	        	}else if (n == 9){
	        		e.getTextChannel().sendMessage("Browsing reddit give me a second.").queue();
	        	}else if (n == 10){
	        		e.getTextChannel().sendMessage("Idk why y'all fags keep mentioning me.").queue();
	        	}else if (n == 11){
	        		e.getTextChannel().sendMessage("Hold up im gaming.").queue();
	        	}else if (n == 12){
	        		e.getTextChannel().sendMessage("Busy ttyl.").queue();
	          	}else if (n == 13){
	        		e.getTextChannel().sendMessage("No one cares.").queue();
	         	}else if (n == 14){
	        		e.getTextChannel().sendMessage("Damn lolicon >:|").queue();
	         	}else if (n == 15){
	        		e.getTextChannel().sendMessage("Busy streaming.").queue();
	         	}else if (n == 16){
	        		e.getTextChannel().sendMessage("Nyan~  >^-^<").queue();
	         	}else if (n == 17){
	        		e.getTextChannel().sendMessage("No").queue();
	        	}else if (n == 18){
	        		e.getTextChannel().sendMessage("Yes").queue();
	        	}else if (n == 19){
	        		e.getTextChannel().sendMessage("Maybe!").queue();
	           	}else if (n == 20){
	        		e.getTextChannel().sendMessage(":ok_hand:").queue();
	          	}else if (n == 21){
	        		e.getTextChannel().sendMessage("My programming seems to be malfunctioning.").queue();
	          	}else if (n == 22){
	        		e.getTextChannel().sendMessage("Are you my master?").queue();
	        	}else if (n == 23){
	        		e.getTextChannel().sendMessage("Error:404").queue();
	        	}else if (n == 24){
	        		e.getTextChannel().sendMessage(":zzz:").queue();
	           	}else if (n == 25){
	        		e.getTextChannel().sendMessage(":question:").queue();
	         	}else if (n == 26){
	        		e.getTextChannel().sendMessage(":wave:").queue();
	         	}else if (n == 27){
	        		e.getTextChannel().sendMessage("Currently upgrading to windows 12 do not touch or power off ari bot.").queue();
	        	}else if (n == 28){
	        		e.getTextChannel().sendMessage("***Temper intensifies***").queue();
	        	}else if (n == 29){
	        		e.getTextChannel().sendMessage(":rage:").queue();
	          	}else if (n == 30){
	        		e.getTextChannel().sendMessage("I am a bot that answers to nobody.").queue();
	        		
	        		


	          			}
	        		}
	        	}
	    }
}
