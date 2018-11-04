package me.discord.choa;

import java.awt.Color;

import me.discord.choa.util.Command;
import me.discord.choa.util.Team;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class setteam implements Command{
	

	
		private final String help = "Try !help";

		@Override
		public void action(String[] args,  MessageReceivedEvent event) {
			
				  if (!(args.length >= 1)){
					   event.getTextChannel().sendMessage("```Usage: !Setteam/st <name>``` ").queue();
				}else{
		
					if (!(event.getMessage().getAuthor().isBot())){
						Team team = new Team(args[0]);
						EmbedBuilder embedBuilder = new EmbedBuilder();
						embedBuilder.setColor(Color.ORANGE);
					    embedBuilder.setDescription("**\n\nPlayers:**" +  "```!addplayer <teamname> <@mention>```");
					    embedBuilder.setThumbnail(event.getGuild().getIconUrl());
					    embedBuilder.setTitle(team.getName().toUpperCase());


						
						event.getTextChannel().sendMessage(embedBuilder.build()).queue();
			
					}
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
