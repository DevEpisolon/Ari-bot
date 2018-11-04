package me.discord.choa.util;

import java.awt.Color;
import java.util.ArrayList;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class WelcomeListener extends ListenerAdapter{
	public static ArrayList <String> welcome = new ArrayList<String>();

	@Override
	public void onGuildMemberJoin(GuildMemberJoinEvent e){
		if (e.getMember().getRoles().toString().contains("♠𝒎𝒆𝒎𝒃𝒆𝒓𝒔♠")){
	}	
	if (!welcome.contains(e.getMember().getAsMention())) {
		EmbedBuilder embedBuilder = new EmbedBuilder();
		embedBuilder.setColor(Color.ORANGE);
	    embedBuilder.setDescription(":christmas_tree:  ***Welcome to the Anime Army!*** " + e.getMember().getAsMention() + 
	    "\n\n ***Enjoy your stay, read the rules and make a introduction to let everyone know a little bit about you. Happy Holidays :)*** ");

	    embedBuilder.setThumbnail(e.getMember().getUser().getAvatarUrl());
	    

	   e.getGuild().getPublicChannel().sendMessage(embedBuilder.build()).queue();

		}
	welcome.add(e.getMember().getAsMention());
	
		e.getGuild().getController().addRolesToMember(e.getMember(), e.getGuild().getRolesByName("♠𝒎𝒆𝒎𝒃𝒆𝒓𝒔♠", true)).queue();
	
		}	
	}