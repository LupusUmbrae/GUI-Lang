import java.util.HashMap;

import tree.Tree;

public class test {
	public static void main(String args[]) {
		Tree parent = new Tree();
		parent.setType("parent");
		Tree child=  new Tree();
		child.setType("Child");
		parent.addChild(child);
	}
}
