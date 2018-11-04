package me.discord.choa.util;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import me.discord.choa.mute;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ChatFilter extends ListenerAdapter {

	
	@Override
	 public void onMessageReceived(MessageReceivedEvent e) {
		// regex = "\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";





		if (!mute.mute.contains(e.getAuthor().getAsMention())){
		}else{
			e.getMessage().delete().queue();
		}			

		if (!e.getMember().getRoles().toString().contains("Admin") || e.getMember().getRoles().toString().contains("Mod") || e.getMember().getRoles().toString().contains("Helper")){

			if (e.getMessage().getContent().contains("discord.gg")){
				e.getMessage().delete().queue();
			}else{
			}
			//}else if (IsMatch(e.getMessage().toString(),regex) == true) {
				//if (!e.getMember().getRoles().toString().contains("Admin") || e.getMember().getRoles().toString().contains("Mod") || e.getMember().getRoles().toString().contains("Helper")){
					//if (!e.getMessage().getTextChannel().getName().contains("media-links")){

				//e.getMessage().delete().queue();
				//		}
				//	}
			//	}
	//	}
	}
		
		//   public static boolean IsMatch(String s, String pattern) {
		        //try {
		          //  Pattern patt = Pattern.compile(pattern);
		          //  Matcher matcher = patt.matcher(s);
		           // return matcher.matches();
		     //   } catch (RuntimeException e) {
		       // return false;
		    }       
		  }	
