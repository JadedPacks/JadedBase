package com.jadedpacks.jadedbase.helpers;

import java.util.List;
import java.util.Map;

import com.google.common.base.Preconditions;

import cpw.mods.fml.common.event.FMLInterModComms;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.nbt.NBTTagCompound;

public class RecipeRemover {
	public static void removeAnyRecipe(ItemStack resultItem) {
		Preconditions.checkNotNull(resultItem);
		@SuppressWarnings("unchecked")
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		for(int i = 0; i < recipes.size(); i++) {
			IRecipe tmpRecipe = recipes.get(i);
			ItemStack recipeResult = tmpRecipe.getRecipeOutput();
			if(ItemStack.areItemStacksEqual(resultItem, recipeResult)) {
				recipes.remove(i--);
			}
		}
	}

	public static void removeShapedRecipe(ItemStack resultItem) {
		Preconditions.checkNotNull(resultItem);
		@SuppressWarnings("unchecked")
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		for(int i = 0; i < recipes.size(); i++) {
			IRecipe tmpRecipe = recipes.get(i);
			if(tmpRecipe instanceof ShapedRecipes) {
				ShapedRecipes recipe = (ShapedRecipes) tmpRecipe;
				ItemStack recipeResult = recipe.getRecipeOutput();
				if(ItemStack.areItemStacksEqual(resultItem, recipeResult)) {
					recipes.remove(i--);
				}
			}
		}
	}

	public static void changeThermalExpansionFurnaceRecipe(ItemStack input, ItemStack output, int energy) {
		// Remove recipe
		NBTTagCompound toSend = new NBTTagCompound();
		toSend.setTag("input", new NBTTagCompound());
		input.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "RemoveFurnaceRecipe", toSend);
		// Add recipe
		toSend = new NBTTagCompound();
		toSend.setInteger("energy", energy);
		toSend.setTag("input", new NBTTagCompound());
		toSend.setTag("output", new NBTTagCompound());
		output.writeToNBT(toSend.getCompoundTag("output"));
		input.writeToNBT(toSend.getCompoundTag("input"));
		FMLInterModComms.sendMessage("ThermalExpansion", "FurnaceRecipe", toSend);
	}

	public static void removeFurnaceRecipe(ItemStack resultItem) {
		@SuppressWarnings("unchecked")
		Map<ItemStack, ItemStack> recipes = FurnaceRecipes.smelting().getSmeltingList();
		recipes.remove(resultItem);
	}
}