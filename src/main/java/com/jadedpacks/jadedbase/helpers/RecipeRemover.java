package com.jadedpacks.jadedbase.helpers;

import java.util.List;
import java.util.Map;

import com.google.common.base.Preconditions;

import cpw.mods.fml.common.event.FMLInterModComms;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
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

	@Deprecated
	public static void removeShapedRecipes(List<ItemStack> removelist) {
		for(ItemStack stack : removelist) {
			removeShapedRecipe(stack);
		}
	}

	@Deprecated
	public static void removeShapelessRecipe(ItemStack resultItem) {
		Preconditions.checkNotNull(resultItem);
		@SuppressWarnings("unchecked")
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		for(int i = 0; i < recipes.size(); i++) {
			IRecipe tmpRecipe = recipes.get(i);
			if(tmpRecipe instanceof ShapelessRecipes) {
				ShapelessRecipes recipe = (ShapelessRecipes) tmpRecipe;
				ItemStack recipeResult = recipe.getRecipeOutput();
				if(ItemStack.areItemStacksEqual(resultItem, recipeResult)) {
					recipes.remove(i--);
				}
			}
		}
	}

	public static void removeFurnaceRecipe(ItemStack resultItem) {
		@SuppressWarnings("unchecked")
		Map<ItemStack, ItemStack> recipes = FurnaceRecipes.smelting().getSmeltingList();
		recipes.remove(resultItem);
	}

	@Deprecated
	public static void removeFurnaceRecipe(Item i, int metadata) {
		removeFurnaceRecipe(new ItemStack(i, 1, metadata));
	}

	@Deprecated
	public static void removeFurnaceRecipe(Item i) {
		removeFurnaceRecipe(new ItemStack(i, 1, 32767));
	}
}