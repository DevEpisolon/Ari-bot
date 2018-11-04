package me.discord.choa;

import java.awt.Color;

import me.discord.choa.util.Command;
import me.discord.choa.util.Team;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class addplayer implements Command{
	

	
		private final String help = "Try !help";

		@Override
		public void action(String[] args,  MessageReceivedEvent event) {
	
			if (args.length < 2){


				
					  event.getTextChannel().sendMessage("```Usage: !addplayer/ap <teamname> <@mention> ``` ").queue();
				}else{
				 Team team = new Team(args[0]);
				 int n = 0;
				 int max = event.getMessage().getMentionedUsers().size();
				 System.out.print(max);
				 
			while (n < event.getMessage().getMentionedUsers().size()) {
				 

				team.addPlayers(event.getMessage().getMentionedUsers().get(n).getAsMention().toString());
			n++;
			}
			EmbedBuilder embedBuilder = new EmbedBuilder();
			embedBuilder.setColor(Color.ORANGE);
		    embedBuilder.setDescription("**\n\nPlayers:**" +  team.getPlayers());
		    embedBuilder.setThumbnail(event.getGuild().getIconUrl());
		    embedBuilder.setTitle(team.getName().toUpperCase());


			
			event.getTextChannel().sendMessage(embedBuilder.build()).queue();

		
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
