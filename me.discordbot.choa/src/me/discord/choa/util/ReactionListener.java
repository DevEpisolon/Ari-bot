package me.discord.choa.util;

import java.util.Random;

import me.discord.choa.battle;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ReactionListener extends ListenerAdapter{
int health;
int attack;
int shield;
int magic;

int ehealth;
int eattack;
int eshield;
int emagic;

	@Override
		public void onMessageReactionAdd(MessageReactionAddEvent e) {

		if (battle.battleplayers.containsKey(e.getUser().getAsMention())){
		if (e.getReaction().toString().contains("👍")){
		if (e.getMessageId().contains(battle.m.getId())){
			Random rand = new Random();

	    	int  n = rand.nextInt(10) + 1;
	    	int  m = rand.nextInt(10) + 1;

		
			attack=0;
			shield=0;
			magic=0;
			
			ehealth=0;
			eattack =0;
			eshield =0;
			emagic =0;
			
			
			
			health = n * 10;
			attack = (n*3) + 13;
			shield = n+50;
			magic = (n*2) +5;
			

			ehealth = m * 10;
			eattack = (m*3) + 13;
			eshield = m+50;
			emagic = (m*2) +5;
			
			
			
			e.getChannel().sendMessage(e.getUser().getAsMention() + "*** Battle Stats: ***" + " :heart:" + " " 
		+ health  + " | "  + ":dagger:" + " " + attack + " | "  +  ":shield:"  + " " + shield + "| " + ":fire:"  + " " + magic).queue();
			
		e.getChannel().sendMessage(battle.battleplayers.get(e.getUser().getAsMention()) + "*** Battle Stats: ***" + " :heart:" + " " 
		+ ehealth + " | "  + ":dagger:" + " " + eattack + " | "  +  ":shield:"  + " " + eshield + "| " + ":fire:"  + " " + emagic ).queue();
	
		
		health = health - (eattack - shield ) + emagic;
		ehealth = ehealth - (attack - eshield) + magic;
		if (ehealth >= health){
		e.getChannel().sendMessage(battle.battleplayers.get(e.getUser().getAsMention()) + " ***wins the battle!***").queue();
		}else{
		e.getChannel().sendMessage(e.getUser().getAsMention() + " ***wins the battle!***").queue();
		}
		
			battle.battleplayers.remove(battle.battleplayers.get(e.getUser().getAsMention()));
			battle.battleplayers.remove(e.getUser().getAsMention());
			battle.name.remove(battle.name.get(e.getUser().getName()));
			battle.name.remove(e.getUser().getName());
		
						}
					}
				}
			}	
		}	