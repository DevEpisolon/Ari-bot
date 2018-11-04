package me.discord.choa.util;

import java.util.ArrayList;
import java.util.List;

public class Team {
		   public String name;
		   public List<String> players;

		   public Team(String name) {
		      this.name = name;
		      this.players = new ArrayList<String>();
		   }

		   public String getName() {
		       return name;
		   }
		   public void addPlayers(String p) {
			   
		  this.players.add(p);
		    
		   }
		   public List<String> getPlayers() {
		       return players;
		   }
		}

