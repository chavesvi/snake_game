package entities;

import java.util.List;

public class Snake {
	private List<String> corpo;
	private int size;
	
	public Snake(List<String> corpo) {
		this.corpo = corpo;
		corpo.add("C");
	}
	
	public List<String> getSnake(){
		return corpo;
	}
	
	public int getSize() {
		return size;
	}
	
	public void addCorpo() {
		corpo.add(0,"O");
		size += 1;
	}

	@Override
	public String toString() {
		String total = "";
		for(int i=0; i < corpo.size(); i++) {
			total += corpo.get(i);
		}
		return total;
	}
	
	

}
