package me.discord.choa.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import net.dv8tion.jda.core.entities.ChannelType;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

 
public class Levels extends ListenerAdapter {
	public static HashMap<String, Integer> lvl = new HashMap<String, Integer>();
	private final String help = "Try !help";
	  public static BufferedReader br;	
	  public static BufferedWriter bw;
	  public int lines;



    
 
    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
	
        	if (!e.getMessage().isFromType(ChannelType.PRIVATE)){
        		
        		
        		
        		
        		
    			try {
					br = new BufferedReader(new FileReader("levels.txt"));
					bw = new BufferedWriter(new FileWriter("levels.txt",true));
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
		
			String inputLine="";

			
	

    	
		try {

			int i;
			lines = 0;
			i = 0;

			while((inputLine = br.readLine()) != null) //Read data from the file
			{		
    			lines= lines +1;
				br.ready();

    			String Last[]= new String[lines];
				int score[]= new int[lines];
				  
				Last[i] = inputLine;
				score[i] = Integer.parseInt(br.readLine());
				i++;
			if (!lvl.containsKey(Last[i-1])){
				lvl.put(Last[i-1], score[i-1]);
				System.out.println("Id: " + lvl.toString());

			}else{
	

			}
			
			
			
			if(!lvl.containsKey(e.getAuthor().getAsMention().toString())){
				String name = e.getAuthor().getAsMention().toString();
			bw.newLine();
			bw.write(name);
			bw.newLine();
			bw.write(new Integer(100).toString());
			lvl.put(e.getAuthor().getAsMention().toString(), 0);
			System.out.print("Created new level");
			bw.flush();
			}else{
		

			if (lvl.get(e.getAuthor().getAsMention().toString()) >= 20){
				int newmoney = lvl.get(e.getAuthor().getAsMention().toString()) + 20;
				lvl.remove(e.getAuthor().getAsMention().toString());
				lvl.put(e.getAuthor().getAsMention().toString(), newmoney);
				inputLine.replace(inputLine.toString(), "");
				br.readLine().replace(new Integer(score[i]).toString(), "");
			e.getTextChannel().sendMessage("You won the flip!").queue();
			inputLine.charAt(e.getMessage().toString().length());
			bw.newLine();
			bw.write(e.getAuthor().getAvatarId());
			bw.newLine();
			bw.write(new Integer(newmoney).toString());
			lvl.put(e.getAuthor().getAsMention().toString(), newmoney);
			//inputLine.replace(new Integer(score[i]).toString(), new Integer(newmoney).toString());
			e.getTextChannel().sendMessage(":money_with_wings: Balance: " + newmoney).queue();
		
			}else{

			e.getTextChannel().sendMessage("You lost the flip!").queue();
			int newmoney = lvl.get(e.getAuthor().getAsMention().toString()) - 20;
			lvl.remove(e.getAuthor().getAsMention().toString());
			lvl.put(e.getAuthor().getAsMention().toString(), newmoney);		
			
			inputLine.replace(inputLine.toString(), "");
			br.readLine().replace(new Integer(score[i]).toString(), "");
		e.getTextChannel().sendMessage("You won the flip!").queue();
		inputLine.charAt(e.getMessage().toString().length());
		bw.newLine();
		bw.write(e.getAuthor().getAvatarId());
		bw.newLine();
		bw.write(new Integer(newmoney).toString());
		lvl.put(e.getAuthor().getAsMention().toString(), newmoney);
		
			e.getTextChannel().sendMessage(":money_with_wings: Balance: " +  newmoney).queue();
			}

			

						}
			
			
				}
			
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		
		}
		}
        	}
    }
        
    
  