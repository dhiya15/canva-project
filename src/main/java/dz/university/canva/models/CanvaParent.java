package dz.university.canva.models;

import java.util.List;

public class CanvaParent {
	private String key;
	private Canva data;
	private List<CanvaParent> children;
	
	public CanvaParent(String key, Canva data, List<CanvaParent> children) {
		super();
		this.key = key;
		this.data = data;
		this.children = children;
	}

	public CanvaParent() {
		super();
	}



	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Canva getData() {
		return data;
	}

	public void setData(Canva data) {
		this.data = data;
	}

	public List<CanvaParent> getChildren() {
		return children;
	}

	public void setChildren(List<CanvaParent> children) {
		this.children = children;
	}
	
	
}
