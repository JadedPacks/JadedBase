package com.jadedpacks.jadedbase.helpers;

import java.util.HashMap;

import net.minecraft.item.ItemStack;
import forestry.api.arboriculture.EnumWoodType;
import forestry.api.arboriculture.TreeManager;
import static forestry.api.arboriculture.EnumWoodType.*;

public class Wood {
	private static final HashMap<EnumWoodType, ItemStack> logs = new HashMap<EnumWoodType, ItemStack>();
	public static ItemStack pine, plum, maple, citrus, giant, ipe, padauk, coco, zebra, walnut, greenheart, cherry, mahoe, poplar, palm, papaya, chesnut, wenge, baobab, sequoia, kapok, ebony, mahogany, balsa, willow, larch, teak, acacia, lime;

	public static void init() {
		getLogs();
	}

	public static ItemStack getLog(EnumWoodType type) {
		if(logs.containsKey(type)) {
			return logs.get(type).copy();
		}
		ItemStack log = TreeManager.woodItemAccess.getLog(type, false);
		logs.put(type, log);
		return log.copy();
	}

	private static void getLogs() {
		larch = Wood.getLog(LARCH);
		teak = Wood.getLog(TEAK);
		acacia = Wood.getLog(ACACIA);
		lime = Wood.getLog(LIME);
		chesnut = Wood.getLog(CHESTNUT);
		wenge = Wood.getLog(WENGE);
		baobab = Wood.getLog(BAOBAB);
		sequoia = Wood.getLog(SEQUOIA);
		kapok = Wood.getLog(KAPOK);
		ebony = Wood.getLog(EBONY);
		mahogany = Wood.getLog(MAHOGANY);
		balsa = Wood.getLog(BALSA);
		willow = Wood.getLog(WILLOW);
		walnut = Wood.getLog(WALNUT);
		greenheart = Wood.getLog(GREENHEART);
		cherry = Wood.getLog(CHERRY);
		mahoe = Wood.getLog(MAHOE);
		poplar = Wood.getLog(POPLAR);
		palm = Wood.getLog(PALM);
		papaya = Wood.getLog(PAPAYA);
		pine = Wood.getLog(PINE);
		plum = Wood.getLog(PLUM);
		maple = Wood.getLog(MAPLE);
		citrus = Wood.getLog(CITRUS);
		giant = Wood.getLog(GIGANTEUM);
		ipe = Wood.getLog(IPE);
		padauk = Wood.getLog(PADAUK);
		coco = Wood.getLog(COCOBOLO);
		zebra = Wood.getLog(ZEBRAWOOD);
	}
}