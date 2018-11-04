package me.discord.choa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import javax.security.auth.login.LoginException;

import me.discord.choa.events.EventListener;
import me.discord.choa.events.nstate;
import me.discord.choa.events.state;
import me.discord.choa.util.AriListener;
import me.discord.choa.util.BotListener;
import me.discord.choa.util.ChatFilter;
import me.discord.choa.util.ChatListener;
import me.discord.choa.util.Command;
import me.discord.choa.util.ReactionListener;
import me.discord.choa.util.WelcomeListener;
import me.discord.choa.util.numbergame;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

public class Main {
	  public static JDA jda;
	  

	public static final CommandParser parser = new CommandParser();
	 public static File file = new File("money.txt");
	  public static BufferedReader br;
	 public static FileOutputStream fos;
	public static HashMap<String, Command> commands = new HashMap<String, Command>();
	  
	    public static final String BOT_TOKEN = "MjkyODk2MTk4Mjk2MzM4NDM0.DA0dHw.C-WmkIFeFny4zepQ7epJ-dlk-EI";
	 
	    
	    public static void main(String[] args) throws IOException, LoginException, IllegalArgumentException, InterruptedException, RateLimitedException {
	    
	        


	    		    if ( ! file.exists( ) ){
	    		        file.createNewFile( );
	    		    }else{
		    			int lines;
						 int i = 0;

		    			lines = 0;
		    			fos = new FileOutputStream(file, true);
		    			
	    		    br = new BufferedReader(new FileReader(file));

	    		    String inputLine = "";
	    			while((inputLine = br.readLine()) != null) //Read data from the file
					{
	    				
	    				br.ready();
		    			lines= lines +1;
		    			
		    			String Last[]= new String[lines];
						  int score[]= new int[lines];
						  
							Last[i] = inputLine;
							score[i] = Integer.parseInt(br.readLine());
							System.out.println(Last[i] + " : " + score[i]);
						i++;

	    		    }
	    		  
	    		    }
	               jda = new JDABuilder(AccountType.BOT).addEventListener(new BotListener()).setToken(BOT_TOKEN).setGame(Game.of("!help for cmds")).buildBlocking();
		           jda.addEventListener(new AriListener());
		           jda.addEventListener(new ChatListener());
		           jda.addEventListener(new WelcomeListener());
		           jda.addEventListener(new EventListener());
		           jda.addEventListener(new ReactionListener());
		           jda.addEventListener(new numbergame());
		           jda.addEventListener(new ChatFilter());

	               jda.setAutoReconnect(true);
	           
	            number.textchannel = "blank";
	   		

	    	   state.setstate(state.End);
	    	   nstate.setstate(state.End);
               commands.put("queue", new queue());
               commands.put("help", new help());
               commands.put("clear", new clear());              
               commands.put("qlist", new qlist());
               commands.put("profile", new profile());
               commands.put("qclear", new qclear());
               commands.put("emotes", new emotes());
               commands.put("waifu", new waifu());
               commands.put("number", new number());
               commands.put("marry", new marry());
               commands.put("remove", new remove());
               commands.put("loli", new loli());
               commands.put("give", new give());
               commands.put("battle", new battle());
               //commands.put("flip", new flip());
               commands.put("mute", new mute());
               commands.put("setteam", new setteam());
               commands.put("st", new setteam());
               commands.put("addplayer", new addplayer());
               commands.put("ap", new addplayer());
               commands.put("listtteam", new listteam());
               commands.put("lt", new listteam());

               commands.put("suumal", new suumal());

	        }

	    public void onDisable() {
	    	try {
				br.close();
				fos.close();
				flip.nm.clear();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	     
	    public static void handleCommand(CommandParser.CommandContainer cmd){
	    	
	    	//cmd.tostring
	    	if (commands.containsKey(cmd.invoke)){

	    	boolean safe = commands.get(cmd.invoke).called(cmd.args, cmd.event);
	    
	    		commands.get(cmd.invoke).action(cmd.args, cmd.event);
	    		commands.get(cmd.invoke).executed(safe, cmd.event);
	    
	    	}else{
	    		
	    		}
	    	}
	    }