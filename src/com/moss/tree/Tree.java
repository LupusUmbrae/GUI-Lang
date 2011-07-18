package com.moss.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.moss.main.Type;

public class Tree {
	private Type type;
	private String id = "";
	private String name = "";
	private String bodyText = "";
	private List<Tree> children;

	// Any unmatched attributes can be put in here and looked at later
	private HashMap<String, String> attributes = new HashMap<String, String>();

	public Tree() {

	}

	public void addChild(Tree child) {
		if (this.children == null) {
			children = new ArrayList<Tree>();
		}
		if (child != null) {
			children.add(child);
		}
	}

	public void create(Type type, String id, String name) {
		this.type = type;
		this.id = id;
		this.name = name;
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

	public String getBodyText() {
		return bodyText;
	}

	public Tree getChildById(String id) {
		Tree child;
		child = findChild(1, id);
		return child;
	}
	
	// Getters

	public Tree getChildByName(String name) {
		Tree child;
		child = findChild(2, name);
		return child;
	}

	public List<Tree> getChildren() {
		return children;
	}

	public String getId() {
		return id;
	}
	

	public String getName() {
		return name;
	}

	public Type getType() {
		return type;
	}

	public Boolean hasChildren() {
		return (this.children == null) ? false : true;
	}

	public void setBodyText(String bodyText) {
		this.bodyText = bodyText;
	}

	public void setByString(String key, String value) {
		key.toLowerCase();
		if (key.matches("id") || key.matches("ID") || key.matches("Id")) {
			this.id = value;
		} else if (key.matches("name")) {
			this.name = value;
		} else if (key.matches("type")) {
			//this.type = value;
			this.type = stringToType(key);
		} else if (key.matches("text")) {
			this.bodyText = value;
		} else {
			this.attributes.put(key, value);
		}
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = stringToType(type);
	}

	public void setType(Type type) {
		this.type = type;
	}

	private Type stringToType(String str){
		str.toLowerCase();
		Type type = null;
		if(str.matches("label")){
			type = Type.LABEL;
		}else if(str.matches("button")){
			type = Type.BUTTON;
		}
		return type;
	}
}
