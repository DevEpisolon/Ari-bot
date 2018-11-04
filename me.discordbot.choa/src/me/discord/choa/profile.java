package me.discord.choa;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import me.discord.choa.util.Command;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class profile implements Command {
	private final String help = "Try !help";
    public static HashMap<String, List<String>> badges  = new HashMap<String, List<String>>();


	@Override
	public void action(String[] args,  MessageReceivedEvent event) {
		
	
		
	   if (!(args.length >= 1)){
			badges(event,event.getAuthor());

		 //insert self profile
			EmbedBuilder embedBuilder = new EmbedBuilder();
			embedBuilder.setColor(Color.BLUE);
		    embedBuilder.setDescription(event.getMember().getEffectiveName() + "'s Profile " 
		 + "\n\n ***User: *** " + event.getMember().getAsMention()
		  +   "\n\n ***Date joined: *** " + event.getMember().getJoinDate()
		    + "\n\n ***Level: *** " + " not yet implemented."
		    + "\n\n ***Badges: *** " + badges.get(event.getMember().getAsMention()));
		    

		    embedBuilder.setThumbnail(event.getMember().getUser().getAvatarUrl());
		    

		   event.getTextChannel().sendMessage(embedBuilder.build()).queue();
	   }else{
			if (event.getMessage().getMentionedUsers().size() < 2){
			if (event.getMessage().getMentionedUsers().size() > 0){
			if (!(event.getMessage().getMentionedUsers().get(0).isBot())){
				badges(event,event.getMessage().getMentionedUsers().get(0));
					EmbedBuilder embedBuilder1 = new EmbedBuilder();
					embedBuilder1.setColor(Color.BLUE);
				    embedBuilder1.setDescription(event.getMessage().getMentionedUsers().get(0).getName() + "'s Profile " 
				   		 + "\n\n ***User: *** " + event.getMessage().getMentionedUsers().get(0).getAsMention()
				    + "\n\n ***Level: *** " + " not yet implemented."  
				    + "\n\n ***Waifu: *** " + waifu.waifu.get(event.getMessage().getMentionedUsers().get(0).getAsMention())
				    + "\n\n ***Badges: *** " + badges.get(event.getMessage().getMentionedUsers().get(0).getAsMention()));
				    embedBuilder1.setThumbnail(event.getMessage().getMentionedUsers().get(0).getAvatarUrl());

					   event.getTextChannel().sendMessage(embedBuilder1.build()).queue();

				    
						}
				}
						}
			}
			}
public void badges( MessageReceivedEvent event, User user ) {
if (!(badges.containsKey(user.getAsMention()))) {
	List<String> badge = new ArrayList<String>();
	badge.clear();
	if(event.getGuild().getMember(user).getRoles().toString().contains("Gamer")){
	badge.add(new String(":video_game: "));

	}if(event.getGuild().getMember(user).getRoles().toString().contains("Events")){
		badge.add(new String(":movie_camera: "));
	}if(event.getGuild().getMember(user).getRoles().toString().contains("Male")){
		badge.add(new String(":eggplant: "));


		}
	badges.put(event.getGuild().getMember(user).getAsMention(), badge);

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

