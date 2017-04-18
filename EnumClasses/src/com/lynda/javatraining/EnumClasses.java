package com.lynda.javatraining;

import com.lynda.olivepress.olives.OliveJar;
import com.lynda.olivepress.olives.OliveName;

public class EnumClasses {

	public static void main(String[] args) throws Exception {

		OliveJar jar = new OliveJar();
		for (OliveName p : OliveName.values())
		{
		jar.addOlive(p, 0x000000);

		}
		//jar.addOlive("Mani", 0x000000);
		jar.reportOlives();
	}
	
}
