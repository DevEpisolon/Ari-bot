package me.discord.choa;

import me.discord.choa.util.Command;
import me.discord.choa.util.Team;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class listteam implements Command{
	

	
		private final String help = "Try !help";
		
		@Override
		public void action(String[] args,  MessageReceivedEvent event) {
			
				  if (!(args.length > 0)){
					   event.getTextChannel().sendMessage("```Usage: !listteam/lt <name>``` ").queue();
				}else{
		
					if (!(event.getMessage().getAuthor().isBot())){
						
			Team team = new Team(args[0]);
			event.getChannel().sendMessage("***Team name:*** " + team.getName() + "\nPlayers: \n```"  +team.getPlayers().toString() +"```").queue();
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
