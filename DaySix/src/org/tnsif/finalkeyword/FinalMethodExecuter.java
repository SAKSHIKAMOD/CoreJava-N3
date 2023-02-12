package org.tnsif.finalkeyword;

public class FinalMethodExecuter {

	public static void main(String[] args) {
		FinalMethodChild f=new FinalMethodChild();
		f.flavour="Mixed";
		f.display();
		f.setPrice(350);
		f.display(f.getPrice());
	}

}
