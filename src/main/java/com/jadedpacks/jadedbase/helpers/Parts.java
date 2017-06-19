package com.jadedpacks.jadedbase.helpers;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.ItemStackHolder;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreDictionary;

import com.jadedpacks.jadedbase.helpers.Parts;

public class Parts {
	// vanilla materials
	@ItemStackHolder(value = "minecraft:log", meta = 0)
	public static final ItemStack oak = null;
	@ItemStackHolder(value = "minecraft:log", meta = 1)
	public static final ItemStack spruce = null;
	@ItemStackHolder(value = "minecraft:log", meta = 2)
	public static final ItemStack birch = null;
	@ItemStackHolder(value = "minecraft:log", meta = 3)
	public static final ItemStack jungle = null;
	@ItemStackHolder(value = "minecraft:log2", meta = 0)
	public static final ItemStack acacia = null;
	@ItemStackHolder(value = "minecraft:log2", meta = 1)
	public static final ItemStack darkoak = null;
	@ItemStackHolder(value = "minecraft:dirt", meta = 0)
	public static final ItemStack dirt = null;
	@ItemStackHolder(value = "minecraft:stone_slab", meta = 3)
	public static final ItemStack cobbleslab = null;
	@ItemStackHolder(value = "minecraft:dirt", meta = 2)
	public static final ItemStack podzolitem = null;
	@ItemStackHolder(value = "minecraft:piston")
	public static final ItemStack piston = null;
	@ItemStackHolder(value = "minecraft:coal", meta = 1)
	public static final ItemStack charcoal = null;
	@ItemStackHolder(value = "minecraft:blaze_powder")
	public static final ItemStack blazepowder = null;
	@ItemStackHolder(value = "minecraft:blaze_rod")
	public static final ItemStack blazerod = null;
	@ItemStackHolder(value = "minecraft:spawn_egg", meta = 90)
	public static final ItemStack spawnPig = null;
	@ItemStackHolder(value = "minecraft:spawn_egg", meta = 91)
	public static final ItemStack spawnSheep = null;
	@ItemStackHolder(value = "minecraft:spawn_egg", meta = 92)
	public static final ItemStack spawnCow = null;
	@ItemStackHolder(value = "minecraft:spawn_egg", meta = 93)
	public static final ItemStack spawnChicken = null;
	@ItemStackHolder(value = "minecraft:spawn_egg", meta = 96)
	public static final ItemStack spawnMCow = null;
	@ItemStackHolder(value = "minecrafT:wool", meta = 0)
	public static final ItemStack wool = null;
	@ItemStackHolder(value = "minecraft:wool", meta = 6)
	public static final ItemStack wool2 = null;
	@ItemStackHolder(value = "minecraft:mycelium")
	public static final ItemStack mycelium = null;
	@ItemStackHolder(value = "minecraft:rotten_flesh")
	public static final ItemStack flesh = null;
	@ItemStackHolder(value = "minecraft:diamond")
	public static final ItemStack diamond = null;
	@ItemStackHolder(value = "minecraft:feather")
	public static final ItemStack feather = null;
	@ItemStackHolder(value = "minecraft:bone")
	public static final ItemStack bone = null;
	@ItemStackHolder(value = "minecraft:leather")
	public static final ItemStack leather = null;
	@ItemStackHolder(value = "minecraft:flint")
	public static final ItemStack flint = null;
	@ItemStackHolder(value = "minecraft:furnace")
	public static final ItemStack furnace = null;
	@ItemStackHolder(value = "minecraft:soul_sand")
	public static final ItemStack soulsand = null;
	@ItemStackHolder(value = "minecraft:gravel")
	public static final ItemStack gravel = null;
	@ItemStackHolder(value = "minecraft:snow")
	public static final ItemStack snow = null;
	@ItemStackHolder(value = "minecraft:emerald")
	public static final ItemStack emerald = null;
	@ItemStackHolder(value = "minecraft:glowstone_dust")
	public static final ItemStack glowstone = null;
	@ItemStackHolder(value = "minecraft:dye")
	public static final ItemStack lapis = null;
	@ItemStackHolder(value = "minecraft:ghast_tear")
	public static final ItemStack ghast = null;
	@ItemStackHolder(value = "minecraft:gold_ingot")
	public static final ItemStack goldingot = null;
	@ItemStackHolder(value = "minecraft:tnt")
	public static final ItemStack tnt = null;
	@ItemStackHolder(value = "minecraft:stone", meta = 0)
	public static final ItemStack stone = null;
	@ItemStackHolder(value = "minecraft:ender_pearl")
	public static final ItemStack epearl = null;
	@ItemStackHolder(value = "minecraft:wheat")
	public static final ItemStack wheat = null;
	@ItemStackHolder(value = "minecraft:diamond_block")
	public static final ItemStack blockDiamond = null;
	@ItemStackHolder(value = "minecraft:bed")
	public static final ItemStack bed = null;
	@ItemStackHolder(value = "minecraft:slime_ball")
	public static final ItemStack slimeball = null;
	@ItemStackHolder(value = "minecraft:apple")
	public static final ItemStack apple = null;
	@ItemStackHolder(value = "minecraft:water_bucket")
	public static final ItemStack bucketwater = null;

	// AE2 Items
	@ItemStackHolder(value = "appliedenergistics2:item.ItemBasicStorageCell.1k")
	public static final ItemStack k = null;
	@ItemStackHolder(value = "appliedenergistics2:item.ItemMultiMaterial", meta = 13)
	public static final ItemStack press1 = null;
	@ItemStackHolder(value = "appliedenergistics2:item.ItemMultiMaterial", meta = 14)
	public static final ItemStack press2 = null;
	@ItemStackHolder(value = "appliedenergistics2:item.ItemMultiMaterial", meta = 15)
	public static final ItemStack press3 = null;
	@ItemStackHolder(value = "appliedenergistics2:item.ItemMultiMaterial", meta = 19)
	public static final ItemStack press4 = null;

	// Thaumic Energistics Items
	@ItemStackHolder(value = "thaumicenergistics:storage.essentia")
	public static final ItemStack kessentia = null;
	@ItemStackHolder(value = "thaumicenergistics:thaumicenergistics.block.arcane.assembler")
	public static final ItemStack arcaneassemble = null;

	// TCon Items
	@ItemStackHolder(value = "TConstruct:ToolStationBlock", meta = 10)
	public static final ItemStack stencil1 = null;
	@ItemStackHolder(value = "TConstruct:ToolStationBlock", meta = 11)
	public static final ItemStack stencil2 = null;
	@ItemStackHolder(value = "TConstruct:ToolStationBlock", meta = 12)
	public static final ItemStack stencil3 = null;
	@ItemStackHolder(value = "TConstruct:ToolStationBlock", meta = 13)
	public static final ItemStack stencil4 = null;
	@ItemStackHolder(value = "TConstruct:ToolStationBlock", meta = 0)
	public static final ItemStack toolstation = null;
	@ItemStackHolder(value = "TConstruct:ToolStationBlock", meta = 1)
	public static final ItemStack partbuilder = null;
	@ItemStackHolder(value = "TConstruct:ToolStationBlock", meta = 2)
	public static final ItemStack partbuilder2 = null;
	@ItemStackHolder(value = "TConstruct:ToolStationBlock", meta = 3)
	public static final ItemStack partbuilder3 = null;
	@ItemStackHolder(value = "TConstruct:ToolStationBlock", meta = 4)
	public static final ItemStack partbuilder4 = null;
	@ItemStackHolder(value = "TConstruct:Smeltery", meta = 2)
	public static final ItemStack searedbrick = null;
	@ItemStackHolder(value = "TConstruct:heartCanister", meta = 0)
	public static final ItemStack heart = null;
	@ItemStackHolder(value = "TConstruct:heartCanister", meta = 1)
	public static final ItemStack heart1 = null;
	@ItemStackHolder(value = "TConstruct:heartCanister", meta = 2)
	public static final ItemStack heart2 = null;
	@ItemStackHolder(value = "TConstruct:heartCanister", meta = 3)
	public static final ItemStack heart3 = null;
	@ItemStackHolder(value = "TConstruct:heartCanister", meta = 4)
	public static final ItemStack heart4 = null;
	@ItemStackHolder(value = "TConstruct:heartCanister", meta = 5)
	public static final ItemStack heart5 = null;
	@ItemStackHolder(value = "TConstruct:heartCanister", meta = 6)
	public static final ItemStack heart6 = null;
	@ItemStackHolder(value = "TConstruct:materials", meta = 8)
	public static final ItemStack necrotic = null;
	@ItemStackHolder(value = "TConstruct:gearCast", meta = 0)
	public static final ItemStack gearCast = null;

	// CoFH Items
	@ItemStackHolder(value = "ThermalFoundation:tool.swordSilver", meta = 0)
	public static final ItemStack silversword2 = null;
	@ItemStackHolder(value = "ThermalFoundation:bucket", meta = 5)
	public static final ItemStack manabucket = null;
	@ItemStackHolder(value = "ThermalFoundation:Ore", meta = 1)
	public static final ItemStack tinOre = null;
	@ItemStackHolder(value = "ThermalFoundation:Ore", meta = 2)
	public static final ItemStack silverOre = null;
	@ItemStackHolder(value = "ThermalFoundation:Ore", meta = 5)
	public static final ItemStack platinumOre = null;
	@ItemStackHolder(value = "ThermalFoundation:Ore", meta = 6)
	public static final ItemStack mithrilOre = null;
	@ItemStackHolder(value = "ThermalFoundation:material", meta = 69)
	public static final ItemStack platinumIngot = null;
	@ItemStackHolder(value = "ThermalFoundation:material", meta = 128)
	public static final ItemStack gearCopper = null;
	@ItemStackHolder(value = "ThermalFoundation:material", meta = 12)
	public static final ItemStack gearIron = null;
	@ItemStackHolder(value = "ThermalFoundation:material", meta = 129)
	public static final ItemStack gearTin = null;
	@ItemStackHolder(value = "ThermalFoundation:material", meta = 13)
	public static final ItemStack gearGold = null;
	@ItemStackHolder(value = "ThermalFoundation:material", meta = 130)
	public static final ItemStack gearSilver = null;
	@ItemStackHolder(value = "ThermalFoundation:material", meta = 137)
	public static final ItemStack gearBronze = null;
	@ItemStackHolder(value = "ThermalFoundation:material", meta = 132)
	public static final ItemStack gearNickel = null;
	@ItemStackHolder(value = "ThermalFoundation:material", meta = 133)
	public static final ItemStack gearPlatinum = null;
	@ItemStackHolder(value = "ThermalFoundation:material", meta = 134)
	public static final ItemStack gearMithril = null;
	@ItemStackHolder(value = "ThermalFoundation:material", meta = 135)
	public static final ItemStack gearElectrum = null;
	@ItemStackHolder(value = "ThermalFoundation:material", meta = 136)
	public static final ItemStack gearInvar = null;
	@ItemStackHolder(value = "ThermalFoundation:material", meta = 138)
	public static final ItemStack gearSignalum = null;
	@ItemStackHolder(value = "ThermalFoundation:material", meta = 139)
	public static final ItemStack gearLumium = null;
	@ItemStackHolder(value = "ThermalFoundation:material", meta = 140)
	public static final ItemStack gearEnderium = null;
	@ItemStackHolder(value = "ThermalFoundation:material", meta = 16)
	public static final ItemStack sulfur = null;
	@ItemStackHolder(value = "ThermalFoundation:material", meta = 1025)
	public static final ItemStack blizz = null;
	@ItemStackHolder(value = "ThermalExpansion:Dynamo", meta = 0)
	public static final ItemStack dynamo = null;
	@ItemStackHolder(value = "ThermalExpansion:Machine", meta = 8)
	public static final ItemStack watergen = null;
	@ItemStackHolder(value = "ThermalExpansion:material", meta = 515)
	public static final ItemStack richslag = null;

	// MoCreatures Items
	@ItemStackHolder(value = "MoCreatures:silversword", meta = 0)
	public static final ItemStack silversword1 = null;

	// Forestry Items
	@ItemStackHolder(value = "Forestry:chipsets", meta = 0)
	public static final ItemStack basicchip = null;
	@ItemStackHolder(value = "Forestry:resourceStorage", meta = 1)
	public static final ItemStack copperBlock = null;
	@ItemStackHolder(value = "Forestry:resourceStorage", meta = 2)
	public static final ItemStack tinBlock = null;

	// exnihilo items
	@ItemStackHolder(value = "exnihilo:barrel", meta = 0)
	public static final ItemStack barrel0 = null;
	@ItemStackHolder(value = "exnihilo:barrel", meta = 1)
	public static final ItemStack barrel1 = null;
	@ItemStackHolder(value = "exnihilo:barrel", meta = 2)
	public static final ItemStack barrel2 = null;
	@ItemStackHolder(value = "exnihilo:barrel", meta = 3)
	public static final ItemStack barrel3 = null;
	@ItemStackHolder(value = "exnihilo:barrel", meta = 4)
	public static final ItemStack barrel4 = null;
	@ItemStackHolder(value = "exnihilo:barrel", meta = 5)
	public static final ItemStack barrel5 = null;
	@ItemStackHolder(value = "exnihilo:sifting_table", meta = 0)
	public static final ItemStack sieve0 = null;
	@ItemStackHolder(value = "exnihilo:sifting_table", meta = 1)
	public static final ItemStack sieve1 = null;
	@ItemStackHolder(value = "exnihilo:sifting_table", meta = 2)
	public static final ItemStack sieve2 = null;
	@ItemStackHolder(value = "exnihilo:sifting_table", meta = 3)
	public static final ItemStack sieve3 = null;
	@ItemStackHolder(value = "exnihilo:sifting_table", meta = 4)
	public static final ItemStack sieve4 = null;
	@ItemStackHolder(value = "exnihilo:sifting_table", meta = 5)
	public static final ItemStack sieve5 = null;
	@ItemStackHolder(value = "exnihilo:platinum_dust")
	public static final ItemStack platDust = null;
	@ItemStackHolder(value = "exnihilo:seed_cactus")
	public static final ItemStack cactus = null;
	@ItemStackHolder(value = "exnihilo:seed_sugar_cane")
	public static final ItemStack sugarcane = null;
	@ItemStackHolder(value = "exnihilo:seed_carrot")
	public static final ItemStack carrot = null;
	@ItemStackHolder(value = "exnihilo:seed_potato")
	public static final ItemStack potato = null;

	// AgriCraft
	@ItemStackHolder(value = "agricraft:seedCactus")
	public static final ItemStack cactus1 = null;
	@ItemStackHolder(value = "agricraft:seedSugarcane")
	public static final ItemStack sugarcane1 = null;
	@ItemStackHolder(value = "agricraft:seedCarrot")
	public static final ItemStack carrot1 = null;
	@ItemStackHolder(value = "agricraft:seedPotato")
	public static final ItemStack potato1 = null;
	@ItemStackHolder(value = "agricraft:seedBotaniaWhite")
	public static final ItemStack bwhite = null;
	@ItemStackHolder(value = "agricraft:seedBotaniaMagenta")
	public static final ItemStack bmagenta = null;
	@ItemStackHolder(value = "agricraft:seedBotaniaLightBlue")
	public static final ItemStack blightblue = null;
	@ItemStackHolder(value = "agricraft:seedBotaniaYellow")
	public static final ItemStack byellow = null;
	@ItemStackHolder(value = "agricraft:seedBotaniaLime")
	public static final ItemStack blime = null;
	@ItemStackHolder(value = "agricraft:seedBotaniaPink")
	public static final ItemStack bpink = null;
	@ItemStackHolder(value = "agricraft:seedBotaniaGray")
	public static final ItemStack bgray = null;
	@ItemStackHolder(value = "agricraft:seedBotaniaLightGray")
	public static final ItemStack blightgray = null;
	@ItemStackHolder(value = "agricraft:seedBotaniaCyan")
	public static final ItemStack bcyan = null;
	@ItemStackHolder(value = "agricraft:seedBotaniaPurple")
	public static final ItemStack bpurple = null;
	@ItemStackHolder(value = "agricraft:seedBotaniaBlue")
	public static final ItemStack bblue = null;
	@ItemStackHolder(value = "agricraft:seedBotaniaBrown")
	public static final ItemStack bbrown = null;
	@ItemStackHolder(value = "agricraft:seedBotaniaGreen")
	public static final ItemStack bgreen = null;
	@ItemStackHolder(value = "agricraft:seedBotaniaRed")
	public static final ItemStack bred = null;
	@ItemStackHolder(value = "agricraft:seedBotaniaBlack")
	public static final ItemStack bblack = null;
	@ItemStackHolder(value = "agricraft:seedBotaniaOrange")
	public static final ItemStack borange = null;

	// Natura Items
	@ItemStackHolder(value = "Natura:GrassBlock", meta = 0)
	public static final ItemStack topiary = null;

	// CustomNPCs Items
	@ItemStackHolder(value = "customnpcs:npcDemonicIngot", meta = 0)
	public static final ItemStack demoningot = null;
	@ItemStackHolder(value = "customnpcs:npcSaphire", meta = 0)
	public static final ItemStack saphire = null;
	@ItemStackHolder(value = "customnpcs:npcAmethyst", meta = 0)
	public static final ItemStack amethyst = null;
	@ItemStackHolder(value = "customnpcs:npcRuby", meta = 0)
	public static final ItemStack ruby = null;
	@ItemStackHolder(value = "customnpcs:npcCoinGold", meta = 0)
	public static final ItemStack goldcoin = null;
	@ItemStackHolder(value = "customnpcs:npcArtifact", meta = 0)
	public static final ItemStack artifact = null;
	@ItemStackHolder(value = "customnpcs:npcFireElement", meta = 0)
	public static final ItemStack fireelement = null;
	@ItemStackHolder(value = "customnpcs:npcWaterElement", meta = 0)
	public static final ItemStack waterelement = null;
	@ItemStackHolder(value = "customnpcs:npcBloodBlock", meta = 0)
	public static final ItemStack bloodblock = null;
	@ItemStackHolder(value = "customnpcs:npcEarthElement", meta = 0)
	public static final ItemStack earthelement = null;
	@ItemStackHolder(value = "customnpcs:npcMana", meta = 0)
	public static final ItemStack npcmana = null;
	@ItemStackHolder(value = "customnpcs:npcAirElement", meta = 0)
	public static final ItemStack airelement = null;
	@ItemStackHolder(value = "customnpcs:npcOcarina", meta = 0)
	public static final ItemStack ocarina = null;

	// Blood Magic
	@ItemStackHolder(value = "AWWayofTime:sigilOfTheFastMiner", meta = 0)
	public static final ItemStack fastmine = null;
	@ItemStackHolder(value = "AWWayofTime:divinationSigil", meta = 0)
	public static final ItemStack divination = null;
	@ItemStackHolder(value = "AWWayofTime:itemBloodLightSigil", meta = 0)
	public static final ItemStack bloodLamp = null;
	@ItemStackHolder(value = "AWWayofTime:growthSigil", meta = 0)
	public static final ItemStack growth = null;
	@ItemStackHolder(value = "AWWayofTime:sigilOfMagnetism", meta = 0)
	public static final ItemStack magnetsigil = null;
	@ItemStackHolder(value = "AWWayofTime:sigilOfHolding", meta = 0)
	public static final ItemStack holding = null;
	@ItemStackHolder(value = "AWWayofTime:itemHarvestSigil", meta = 0)
	public static final ItemStack harvestSigil = null;
	@ItemStackHolder(value = "AWWayofTime:waterSigil", meta = 0)
	public static final ItemStack waterSigil = null;
	@ItemStackHolder(value = "AWWayofTime:imbuedSlate", meta = 0)
	public static final ItemStack imbued = null;
	@ItemStackHolder(value = "AWWayofTime:reinforcedSlate", meta = 0)
	public static final ItemStack reinforced = null;
	@ItemStackHolder(value = "AWWayofTime:blankSlate", meta = 0)
	public static final ItemStack blank = null;
	@ItemStackHolder(value = "AWWayofTime:bloodMagicBaseItems", meta = 28)
	public static final ItemStack lifeshard = null;
	@ItemStackHolder(value = "AWWayofTime:weakBloodShard", meta = 0)
	public static final ItemStack bloodshard = null;
	@ItemStackHolder(value = "AWWayofTime:bucketLife", meta = 0)
	public static final ItemStack lifebucket = null;
	@ItemStackHolder(value = "AWWayofTime:bloodMagicBaseItems", meta = 29)
	public static final ItemStack soulshard = null;
	@ItemStackHolder(value = "AWWayofTime:sacrificialKnife", meta = 0)
	public static final ItemStack knife = null;
	@ItemStackHolder(value = "AWWayofTime:Altar", meta = 0)
	public static final ItemStack altar = null;
	@ItemStackHolder(value = "AWWayofTime:weakBloodshard")
	public static final ItemStack weakblood = null;

	// Sanguinmancy
	@ItemStackHolder(value = "Sanguinmancy:transpositionSigil", meta = 0)
	public static final ItemStack transposition = null;
	@ItemStackHolder(value = "Sanguinmancy:telepositionSigil", meta = 0)
	public static final ItemStack teleposition = null;

	// Thaumcraft
	@ItemStackHolder(value = "Thaumcraft:ItemSpawnerEgg", meta = 6)
	public static final ItemStack spawnGuardian = null;
	@ItemStackHolder(value = "Thaumcraft:ItemResource", meta = 17)
	public static final ItemStack voidSeed = null;
	@ItemStackHolder(value = "Thaumcraft:blockCustomOre", meta = 1)
	public static final ItemStack airOre = null;
	@ItemStackHolder(value = "Thaumcraft:blockCustomOre", meta = 2)
	public static final ItemStack fireOre = null;
	@ItemStackHolder(value = "Thaumcraft:blockCustomOre", meta = 3)
	public static final ItemStack waterOre = null;
	@ItemStackHolder(value = "Thaumcraft:blockCustomOre", meta = 4)
	public static final ItemStack earthOre = null;
	@ItemStackHolder(value = "Thaumcraft:blockCustomOre", meta = 5)
	public static final ItemStack orderOre = null;
	@ItemStackHolder(value = "Thaumcraft:blockCustomOre", meta = 6)
	public static final ItemStack chaosOre = null;

	// Forbidden Magic
	@ItemStackHolder(value = "ForbiddenMagic:NetherShard", meta = 0)
	public static final ItemStack wrathShard = null;
	@ItemStackHolder(value = "ForbiddenMagic:NetherShard", meta = 1)
	public static final ItemStack envyShard = null;
	@ItemStackHolder(value = "ForbiddenMagic:NetherShard", meta = 2)
	public static final ItemStack taintShard = null;
	@ItemStackHolder(value = "ForbiddenMagic:NetherShard", meta = 3)
	public static final ItemStack prideShard = null;
	@ItemStackHolder(value = "ForbiddenMagic:NetherShard", meta = 4)
	public static final ItemStack lustShard = null;
	@ItemStackHolder(value = "ForbiddenMagic:NetherShard", meta = 5)
	public static final ItemStack slothShard = null;
	@ItemStackHolder(value = "ForbiddenMagic:NetherShard", meta = 6)
	public static final ItemStack greedShard = null;
	@ItemStackHolder(value = "ForbiddenMagic:GluttonyShard", meta = 0)
	public static final ItemStack gluttonShard = null;

	// HQM
	@ItemStackHolder(value = "HardcoreQuesting:hearts", meta = 3)
	public static final ItemStack hearts = null;

	// Botania
	@ItemStackHolder(value = "Botania:rune", meta = 1)
	public static final ItemStack firerune = null;
	@ItemStackHolder(value = "Botania:rune", meta = 0)
	public static final ItemStack waterrune = null;
	@ItemStackHolder(value = "Botania:rune", meta = 2)
	public static final ItemStack earthrune = null;
	@ItemStackHolder(value = "Botania:petal", meta = 11)
	public static final ItemStack bluepetal = null;
	@ItemStackHolder(value = "Botania:rune", meta = 3)
	public static final ItemStack airrune = null;
	@ItemStackHolder(value = "Botania:pestleAndMortar", meta = 0)
	public static final ItemStack woodmortar = null;

	// MFR
	@ItemStackHolder(value = "MineFactoryReloaded:upgrade.radius", meta = 8)
	public static final ItemStack upgradeMany = null;
	@ItemStackHolder(value = "MineFactoryReloaded:upgrade.radius", meta = 6)
	public static final ItemStack upgradeEFlux = null;
	@ItemStackHolder(value = "MineFactoryReloaded:upgrade.radius", meta = 7)
	public static final ItemStack upgradeEnder = null;
	@ItemStackHolder(value = "MineFactoryReloaded:upgrade.radius", meta = 9)
	public static final ItemStack upgradeThaum = null;
	@ItemStackHolder(value = "MineFactoryReloaded:upgrade.radius", meta = 10)
	public static final ItemStack upgradeMSteel = null;

	// Recall stones
	@ItemStackHolder(value = "recallstones:recallStone")
	public static final ItemStack recallStone = null;
	@ItemStackHolder(value = "recallstones:dimensionStone")
	public static final ItemStack dimensionStone = null;

	// Harvestcraft
	@ItemStackHolder(value = "harvestcraft:beefwellingtonItem")
	public static final ItemStack beefwellington = null;
	@ItemStackHolder(value = "harvestcraft:freshwaterItem")
	public static final ItemStack fwater = null;
	@ItemStackHolder(value = "harvestcraft:flourItem")
	public static final ItemStack flour = null;
	@ItemStackHolder(value = "harvestcraft:potItem")
	public static final ItemStack pot = null;
	@ItemStackHolder(value = "harvestcraft:saucepanItem")
	public static final ItemStack saucepan = null;
	@ItemStackHolder(value = "harvestcraft:lemonItem")
	public static final ItemStack lemon = null;
	@ItemStackHolder(value = "harvestcraft:grapeItem")
	public static final ItemStack grape = null;
	@ItemStackHolder(value = "harvestcraft:strawberryItem")
	public static final ItemStack strawberry = null;
	@ItemStackHolder(value = "harvestcraft:raisinsItem")
	public static final ItemStack raisins = null;

	// ExU
	@ItemStackHolder(value = "ExtraUtilities:magnumTorch")
	public static final ItemStack magnumtorch = null;
	@ItemStackHolder(value = "ExtraUtilities:spike_base_wood")
	public static final ItemStack spikebase = null;
	@ItemStackHolder(value = "ExtraUtilities:spike_base_diamond")
	public static final ItemStack spikediamond1 = null;
	@ItemStackHolder(value = "ExtraUtilities:spike_base_gold")
	public static final ItemStack spikegold1 = null;
	@ItemStackHolder(value = "ExtraUtilities:spike_base")
	public static final ItemStack spikeiron1 = null;
	@ItemStackHolder(value = "ExtraUtilities:creativebuilderswand")
	public static final ItemStack superwand = null;
	@ItemStackHolder(value = "ExtraUtilities:builderswand")
	public static final ItemStack builderswand = null;

	// SolarFlux
	@ItemStackHolder(value="SolarFlux:mirror", meta = 0)
	public static final ItemStack mirror2 = null;

	// IguanaTweaks
	@ItemStackHolder(value = "IguanaTweaksTConstruct:clayBucketFired", meta = 0)
	public static final ItemStack clayBucket = null;
	@ItemStackHolder(value = "IguanaTweaksTConstruct:clayBucketUnfired", meta = 0)
	public static final ItemStack rawclayBucket = null;
	@ItemStackHolder(value = "IguanaTweaksTConstruct:clayBucketWater")
	public static final ItemStack claywater = null;

	// Big Reactors
	@ItemStackHolder(value = "BigReactors:BRIngot")
	public static final ItemStack yellorium = null;

	public static FluidStack temana, tcemerald, tclead, tctin, tccopper, tcnickel, tciron, tcardite, tcgold, moltenaluminumbrass, moltenaluminum;
	public static ItemStack spikediamond, spikegold, spikeiron, freshwater, mirror;
	public static Block crnether, heatsand, podzol;

	public void init() {
		podzol = GameRegistry.findBlock("minecraft", "dirt");
		if(Loader.isModLoaded("ExtraUtilities")) {
			spikediamond = GameRegistry.findItemStack("ExtraUtilities", "spike_base_diamond", 4);
			spikegold = GameRegistry.findItemStack("ExtraUtilities", "spike_base_gold", 4);
			spikeiron = GameRegistry.findItemStack("ExtraUtilities", "spike_base", 4);
		}
		if(Loader.isModLoaded("harvestcraft")) {
			freshwater = GameRegistry.findItemStack("harvestcraft", "freshwaterItem", 4);
		}
		if(Loader.isModLoaded("SolarFlux")) {
			mirror = GameRegistry.findItemStack("SolarFlux", "mirror", 2);
		}
		if(Loader.isModLoaded("exnihilo")) {
			crnether = GameRegistry.findBlock("exnihilo", "exnihilo.gravel_nether");
		}
		if (Loader.isModLoaded("Natura")) {
			heatsand = GameRegistry.findBlock("Natura", "heatsand");
		}
		if(Loader.isModLoaded("TConstruct")) {
			tcemerald = FluidRegistry.getFluidStack("emerald.liquid", 288);
			tclead = FluidRegistry.getFluidStack("lead.molten", 144);
			tctin = FluidRegistry.getFluidStack("tin.molten", 144);
			tccopper = FluidRegistry.getFluidStack("copper.molten", 144);
			tcnickel = FluidRegistry.getFluidStack("nickel.molten", 144);
			tciron = FluidRegistry.getFluidStack("iron.molten", 288);
			tcgold = FluidRegistry.getFluidStack("gold.molten", 720);
			tcardite = FluidRegistry.getFluidStack("ardite.molten", 144);
			if(OreDictionary.getOres("oreAluminum").size() > 0) {
				moltenaluminumbrass = FluidRegistry.getFluidStack("aluminumbrass.molten", 288);
				moltenaluminum = FluidRegistry.getFluidStack("aluminum.molten", 288);
			} else if (OreDictionary.getOres("oreAluminium").size() > 0) {
				moltenaluminumbrass = FluidRegistry.getFluidStack("aluminiumbrass.molten", 288);
				moltenaluminum = FluidRegistry.getFluidStack("aluminium.molten", 288);
			}
		}
		if(Loader.isModLoaded("ThermalExpansion")) {
			temana = FluidRegistry.getFluidStack("mana", 100);
		}
	}
}