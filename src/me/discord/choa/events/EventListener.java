package me.discord.choa.events;

import java.util.ArrayList;
import java.util.HashMap;

import net.dv8tion.jda.core.entities.ChannelType;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class EventListener extends ListenerAdapter{
	//groupuserjoinevent
	//:arrow_forward: test test command
	public static HashMap<String, String> trivia = new HashMap<String, String>();
	public static ArrayList<String> ingame = new ArrayList<String>();

//id, name
	 @Override
	    public void onMessageReceived(MessageReceivedEvent event) {
	if (event.getMessage().isFromType(ChannelType.PRIVATE)){
	if (ingame.contains(event.getAuthor().getId())){
		
	if (state.isState(state.Start)){
	if(tof.isState(tof.True)){
	 if(event.getMessage().getContent().toString().equalsIgnoreCase("true")){
		 
			event.getAuthor().openPrivateChannel().complete();	

			event.getAuthor().openPrivateChannel().submit();
			event.getAuthor().openPrivateChannel().queue();
			event.getAuthor().openPrivateChannel().complete().sendMessage(":point_right: Congrats you got the question right!").queue();
			ingame.remove(event.getAuthor().getId());
	 }else{
			event.getAuthor().openPrivateChannel().complete().sendMessage(":point_right: Sorry that is the wrong answer!").queue();
			ingame.remove(event.getAuthor().getId());

	 }
	 }else if (tof.isState(tof.False))
		 if(event.getMessage().getContent().toString().equalsIgnoreCase("false")){

	 EventListener.ingame.remove(event.getAuthor().getId());
		event.getAuthor().openPrivateChannel().complete().sendMessage(":point_right: Congrats you got the question right!.").queue();
		 }else{
				event.getAuthor().openPrivateChannel().complete().sendMessage(":point_right: Sorry that is the wrong answer!").queue();
				EventListener.ingame.remove(event.getAuthor().getId());

		 		}
	 		}
		}
	 }
}

}
