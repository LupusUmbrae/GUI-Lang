package tree;

import java.util.ArrayList;
import java.util.List;

public class Tree {
	private String type = "";
	private String id = "";
	private String name = "";
	private String bodyText = "";
	private List<Tree> children;

	public Tree() {

	}

	public void create(String type, String id, String name) {
		this.type = type;
		this.id = id;
		this.name = name;
	}

	public void addChild(Tree child) {
		if (this.children == null) {
			children = new ArrayList<Tree>();
		}
		if (child != null) {
			children.add(child);
		}
	}
	
	public Boolean hasChildren(){
		return (this.children==null)?false:true;
	}

	private Tree findChild(int type, String match) {
		for (int i = 0; i < children.size(); i++) {
			Tree child = children.get(i);
			switch (type) {
			case 1:
				// ID
				if (child.getId().matches(match)) {
					return child;
				}
				break;
			case 2:
				// Name, not unique!
				if (child.getName().matches(match)) {
					return child;
				}
				break;
			}
		}
		return null;
	}

	// Getters

	public Tree getChildByName(String name) {
		Tree child;
		child = findChild(2, name);
		return child;
	}

	public Tree getChildById(String id) {
		Tree child;
		child = findChild(1, id);
		return child;
	}

	public String getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<Tree> getChildren() {
		return children;
	}

	public String getBodyText() {
		return bodyText;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBodyText(String bodyText) {
		this.bodyText = bodyText;
	}

	public void setByString(String key, String value) {
		if (key.matches("id") || key.matches("ID") || key.matches("Id")) {
			this.id = value;
		} else if (key.matches("name") || key.matches("NAME")
				|| key.matches("Name")) {
			this.name = value;
		} else if (key.matches("type") || key.matches("TYPE")
				|| key.matches("Type")) {

		}
	}
}
