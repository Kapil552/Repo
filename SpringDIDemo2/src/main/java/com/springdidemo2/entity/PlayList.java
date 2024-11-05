package com.springdidemo2.entity;

import java.util.Set;

public class PlayList {

	private Set<String> songs;

	public PlayList() {
	}

	public Set<String> getSongs() {
		return songs;
	}

	public void setSongs(Set<String> songs) {
		this.songs = songs;
	}
}
