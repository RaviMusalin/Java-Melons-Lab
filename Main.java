public class Main {

	public static void main(String[] args) {


		MelonType musk = new MelonType( "musk", "Muskmelon", 1998,
		    							"green", true, true);

		MelonType cas = new MelonType( "cas", "Casaba", 2003,
								       "orange", false, false);
		
		MelonType cren = new MelonType("cren", "Crenshaw", 1996,
									   "green", false, false);

		MelonType yw = new MelonType("yw", "Yellow Watermelon", 2013,
									 "yellow", false, true);

		MelonType[] types = {musk, cas, cren, yw};


		Melon melon1 = new Melon(yw, 8, 7, 2, "Sheila");

		Melon melon2 = new Melon(yw, 3, 4, 2, "Sheila");

		Melon melon3 = new Melon(cas, 10, 6, 35, "Sheila");

		Melon melon4 = new Melon(cren, 8, 9, 35, "Michael");

		Melon melon5 = new Melon(cren, 8, 2, 35, "Michael");

		Melon melon6 = new Melon(musk, 6, 7, 4, "Michael");

		Melon melon7 = new Melon(yw, 7, 10, 3, "Sheila");

		Melon[] melons = {melon1, melon2, melon3, melon4, melon5, melon6, melon7};

		getSellabilityReport(melons);
	}

	public static void getSellabilityReport(Melon[] melons){
		for (int i=0; i<melons.length; i++){
		
			Melon currentMelon = melons[i];

			String sellableString;
			if (currentMelon.isSellable()){
				sellableString = "CAN BE SOLD";
			} else {
				sellableString = "NOT SELLABLE";
			}

			System.out.println("Harvested by " + currentMelon.harvester +
								" from Field " + currentMelon.field +
								" (" + sellableString + ")" );
		}
	}
}
