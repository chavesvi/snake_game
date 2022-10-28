package entities;

import java.util.ArrayList;
import java.util.List;

public class Snake {
	private List<String> corpo;
	private int size;
	public static String boca = " C ";
	
	public Snake() {
		this.corpo = new ArrayList<>();
		corpo.add(" C ");
	}
	
	public List<String> getSnake(){
		return corpo;
	}
	
	public String getCorpoPosicao(int posicao){
		int contador = 0;
		for(String parte : corpo) {
			if(contador == posicao){
				return parte;
			}
			contador += 1;
		}
		return "Erro";
	}
	
	public int getSize() {
		return size;
	}
	
	public void addCorpo() {
		corpo.add(0," O ");
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
