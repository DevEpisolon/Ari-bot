package me.discord.choa;




import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import me.discord.choa.util.Command;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class flip implements Command {
	private final String help = "Try !help";
	  public static BufferedReader br;	
	  public static BufferedWriter bw;
	  public int lines;
	  public static HashMap<String, Integer> nm = new HashMap<String, Integer>();



	@Override
	public void action(String[] args,  MessageReceivedEvent event) {

		    	Random rand = new Random();

							try {
								br = new BufferedReader(new FileReader("money.txt"));
								bw = new BufferedWriter(new FileWriter("money.txt",true));
								
							} catch (FileNotFoundException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
					
						String inputLine="";

						
				

		    	int  n = rand.nextInt(2) + 1;
    		    	
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
						if (!nm.containsKey(Last[i-1])){
							nm.put(Last[i-1], score[i-1]);
							System.out.println("Id: " + nm.toString());

						}else{
				

						}
						
						
						
						if(!nm.containsKey(event.getAuthor().getAsMention().toString())){
							String name = event.getAuthor().getAsMention().toString();
						bw.newLine();
						bw.write(name);
						bw.newLine();
						bw.write(new Integer(100).toString());
						nm.put(event.getAuthor().getAsMention().toString(), 100);
						event.getTextChannel().sendMessage(":moneybag: ``Account created.``:moneybag: ").queue();
						event.getTextChannel().sendMessage("```Current Balance: 100```").queue();
						bw.flush();
						}else{
					

						if (nm.get(event.getAuthor().getAsMention().toString()) >= 20){
						if (n == 1){
							int newmoney = nm.get(event.getAuthor().getAsMention().toString()) + 20;
							nm.remove(event.getAuthor().getAsMention().toString());
							nm.put(event.getAuthor().getAsMention().toString(), newmoney);
							inputLine.replace(inputLine.toString(), "");
							br.readLine().replace(new Integer(score[i]).toString(), "");
						event.getTextChannel().sendMessage("You won the flip!").queue();
						inputLine.charAt(event.getMessage().toString().length());
						bw.newLine();
						bw.write(event.getAuthor().getAvatarId());
						bw.newLine();
						bw.write(new Integer(newmoney).toString());
						nm.put(event.getAuthor().getAsMention().toString(), newmoney);
						//inputLine.replace(new Integer(score[i]).toString(), new Integer(newmoney).toString());
						event.getTextChannel().sendMessage(":money_with_wings: Balance: " + newmoney).queue();
					
						}else{

						event.getTextChannel().sendMessage("You lost the flip!").queue();
						int newmoney = nm.get(event.getAuthor().getAsMention().toString()) - 20;
						nm.remove(event.getAuthor().getAsMention().toString());
						nm.put(event.getAuthor().getAsMention().toString(), newmoney);		
						
						inputLine.replace(inputLine.toString(), "");
						br.readLine().replace(new Integer(score[i]).toString(), "");
					event.getTextChannel().sendMessage("You won the flip!").queue();
					inputLine.charAt(event.getMessage().toString().length());
					bw.newLine();
					bw.write(event.getAuthor().getAvatarId());
					bw.newLine();
					bw.write(new Integer(newmoney).toString());
					nm.put(event.getAuthor().getAsMention().toString(), newmoney);
					
						event.getTextChannel().sendMessage(":money_with_wings: Balance: " +  newmoney).queue();
					

						}

									}
						
						}
							}
						
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					
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
