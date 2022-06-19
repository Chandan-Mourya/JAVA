package com.question1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PlayList extends Song{
	
	// HashSet<Song> hs=new HashSet<>(songs);
	 
	 public void addSong(Song song) {
		
		 System.out.println(this.songs.equals(songs));
			 songs.add(song);
			 System.out.println(" \"Song added to the playlist successfully.\"");
		
	 }
	 
}
