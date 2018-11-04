package me.discord.choa;

import java.util.ArrayList;
import java.util.HashMap;

import me.discord.choa.util.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class remove implements Command {
	private final String help = "Try !help";


	@Override
	public void action(String[] args,  MessageReceivedEvent event) {
if (args.length == 0) {
	event.getTextChannel().sendMessage("```Usage: !give <role>. A list of roles should be pinned```").queue();
}else {
			if (args[0].equalsIgnoreCase("Anime")){				
				event.getTextChannel().sendMessage("```css\n"
						+ args[0].toString() + " role removed.```").queue();
				event.getGuild().getController().removeRolesFromMember(event.getMember(), event.getGuild().getRolesByName("Anime", true)).queue();
			}else if (args[0].equalsIgnoreCase("League")){
				event.getTextChannel().sendMessage("```css\n"
						+ args[0].toString() + " role removed.```").queue();
				event.getGuild().getController().removeRolesFromMember(event.getMember(), event.getGuild().getRolesByName("League", true)).queue();
			}else if (args[0].equalsIgnoreCase("Pubg")){
				event.getTextChannel().sendMessage("```css\n"
						+ args[0].toString() + " role removed.```").queue();
				event.getGuild().getController().removeRolesFromMember(event.getMember(), event.getGuild().getRolesByName("Pubg", true)).queue();
			}else if (args[0].equalsIgnoreCase("Female")){
				event.getTextChannel().sendMessage("```css\n"
						+ args[0].toString() + " role removed.```").queue();
				event.getGuild().getController().removeRolesFromMember(event.getMember(), event.getGuild().getRolesByName("Female", true)).queue();
			}else if (args[0].equalsIgnoreCase("Male")){
				event.getTextChannel().sendMessage("```css\n"
						+ args[0].toString() + " role removed.```").queue();
				event.getGuild().getController().removeRolesFromMember(event.getMember(), event.getGuild().getRolesByName("Male", true)).queue();
			}else if (args[0].equalsIgnoreCase("Ari")){
				event.getTextChannel().sendMessage("```css\n"
						+ args[0].toString() + " role removed.```").queue();
				event.getGuild().getController().removeRolesFromMember(event.getMember(), event.getGuild().getRolesByName("Ari", true)).queue();
			}else if (args[0].equalsIgnoreCase("Lewd")){
				event.getTextChannel().sendMessage("```css\n"
						+ args[0].toString() + " role removed.```").queue();
				event.getGuild().getController().removeRolesFromMember(event.getMember(), event.getGuild().getRolesByName("Lewd", true)).queue();
			}else if (args[0].equalsIgnoreCase("Gamer")){
				event.getTextChannel().sendMessage("```css\n"
						+ args[0].toString() + " role removed.```").queue();
				event.getGuild().getController().removeRolesFromMember(event.getMember(), event.getGuild().getRolesByName("Gamer", true)).queue();


			}else if (args[0].equalsIgnoreCase("Red")){
				event.getTextChannel().sendMessage("```css\n"
						+ args[0].toString() + " role removed.```").queue();
				event.getGuild().getController().removeRolesFromMember(event.getMember(), event.getGuild().getRolesByName("Red", true)).queue();
			}else if (args[0].equalsIgnoreCase("Purple")){
				event.getTextChannel().sendMessage("```css\n"
						+ args[0].toString() + " role removed.```").queue();
				event.getGuild().getController().removeRolesFromMember(event.getMember(), event.getGuild().getRolesByName("Purple", true)).queue();
			}else if (args[0].equalsIgnoreCase("Blue")){
				event.getTextChannel().sendMessage("```css\n"
						+ args[0].toString() + " role removed.```").queue();
				event.getGuild().getController().removeRolesFromMember(event.getMember(), event.getGuild().getRolesByName("Blue", true)).queue();
			}else if (args[0].equalsIgnoreCase("Pink")){
				event.getTextChannel().sendMessage("```css\n"
						+ args[0].toString() + " role removed.```").queue();
				event.getGuild().getController().removeRolesFromMember(event.getMember(), event.getGuild().getRolesByName("Pink", true)).queue();
			}else if (args[0].equalsIgnoreCase("Yellow")){
				event.getTextChannel().sendMessage("```css\n"
						+ args[0].toString() + " role removed.```").queue();
				event.getGuild().getController().removeRolesFromMember(event.getMember(), event.getGuild().getRolesByName("Yellow", true)).queue();
			}else if (args[0].equalsIgnoreCase("Events")){
				event.getTextChannel().sendMessage("```css\n"
						+ args[0].toString() + " role removed.```").queue();
				event.getGuild().getController().removeRolesFromMember(event.getMember(), event.getGuild().getRolesByName("Events", true)).queue();






				
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
