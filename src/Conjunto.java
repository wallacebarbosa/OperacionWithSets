import java.util.ArrayList;

public class Conjunto {
	private String nome;
	private Conjunto conjuntoPai = null;
	private ArrayList<Object> elementos;
	
	public Conjunto (String nome,Conjunto conjuntoPai) {
		this.elementos = new ArrayList<Object>();
		this.conjuntoPai = conjuntoPai;
		this.nome = nome;
	}
	
	public Conjunto (String nome) {
		this.elementos = new ArrayList<Object>();
		this.nome = nome;
	}

	public boolean addElement(Object element) {
		if(element != null) {
			elementos.add(element);
			return true;
		}
		
		return false;
		

	}
	
	public boolean removeElement(Object element) {
		if(element != null) {
			elementos.remove(element);
			return true;
		}
		
		return false;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Conjunto getConjuntoPai() {
		return this.conjuntoPai;
	}
	
	public ArrayList<Object> getElements() {
		return elementos;
	}
	
	

}
