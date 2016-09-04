/*
 * CSC 221 - Assignment 4
 * Library Database
 * by Klaudio Vito
 * 10/21/2015
 */
import java.util.Date;
public abstract class MultiMediaItem extends Item {
protected int playingTime;
	
	public MultiMediaItem(String id, String title, Date addedOn, int playingTime){
		super(id,title,addedOn);
		this.id = id;
		this.title = title;
		this.addedOn = addedOn;
		this.playingTime = playingTime;	
	}
	public abstract void setPlayingTime(int playingTime);
	public abstract int getPlayingTime();

	
}
