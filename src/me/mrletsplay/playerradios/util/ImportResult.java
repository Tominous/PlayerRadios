package me.mrletsplay.playerradios.util;

import java.util.List;

public class ImportResult {

	public String format;
	public List<Song> songs;
	
	public ImportResult(String format, List<Song> songs) {
		this.format = format;
		this.songs = songs;
	}
	
}
