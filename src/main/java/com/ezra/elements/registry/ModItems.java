package com.ezra.elements.registry;

import com.ezra.elements.Elements;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

	//Group

	public static final ItemGroup ELEMENTAL_GROUP = new ItemGroup(10, "Elemental") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(null, 1);
		}
	};

	//Final

	public static final Item DISC = new Item(new Item.Settings().group(ELEMENTAL_GROUP).rarity(Rarity.EPIC));
	public static final SwordItem BOL = new SwordItem(new ToolMaterial() {
		@Override
		public int getDurability() {
			return 0;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 0;
		}

		@Override
		public float getAttackDamage() {
			return 0;
		}

		@Override
		public int getMiningLevel() {
			return 0;
		}

		@Override
		public int getEnchantability() {
			return 0;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return null;
		}
	}, 24, 8, new Item.Settings().rarity(Rarity.EPIC).group(ELEMENTAL_GROUP).fireproof());

	//Fire Stuff

	public static final Item FIRE = new Item(new Item.Settings().rarity(Rarity.COMMON).group(ELEMENTAL_GROUP));
	public static final SwordItem SOF = new SwordItem(new ToolMaterial() {
		@Override
		public int getDurability() {
			return 0;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 0;
		}

		@Override
		public float getAttackDamage() {
			return 0;
		}

		@Override
		public int getMiningLevel() {
			return 0;
		}

		@Override
		public int getEnchantability() {
			return 0;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return null;
		}
	}, 11, 3, new Item.Settings().group(ELEMENTAL_GROUP).rarity(Rarity.RARE).fireproof());

	//Water Stuff

	public static final Item WATER = new Item(new Item.Settings().rarity(Rarity.COMMON).group(ELEMENTAL_GROUP));
	public static final SwordItem SOW = new SwordItem(new ToolMaterial() {
		@Override
		public int getDurability() {
			return 0;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 0;
		}

		@Override
		public float getAttackDamage() {
			return 0;
		}

		@Override
		public int getMiningLevel() {
			return 0;
		}

		@Override
		public int getEnchantability() {
			return 0;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return null;
		}
	}, 5, 5, new Item.Settings().group(ELEMENTAL_GROUP).rarity(Rarity.RARE));

	//Earth Stuff

	public static final Item EARTH = new Item(new Item.Settings().rarity(Rarity.COMMON).group(ELEMENTAL_GROUP));
	public static final SwordItem SOE = new SwordItem(new ToolMaterial() {
		@Override
		public int getDurability() {
			return 0;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 0;
		}

		@Override
		public float getAttackDamage() {
			return 0;
		}

		@Override
		public int getMiningLevel() {
			return 0;
		}

		@Override
		public int getEnchantability() {
			return 0;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return null;
		}
	}, 15, 1, new Item.Settings().group(ELEMENTAL_GROUP).rarity(Rarity.RARE));

	//Air Stuff

	public static final Item AIR = new Item(new Item.Settings().group(ELEMENTAL_GROUP).rarity(Rarity.COMMON));

	//Misc

	public static final Item EB = new Item(new Item.Settings().group(ELEMENTAL_GROUP).rarity(Rarity.UNCOMMON));

	public static void registerItems() {
		Registry.register(Registry.ITEM, new Identifier(Elements.MOD_ID, "disc_of_life"), DISC);
		Registry.register(Registry.ITEM, new Identifier(Elements.MOD_ID, "blade_of_life"), BOL);
		Registry.register(Registry.ITEM, new Identifier(Elements.MOD_ID, "fire"), FIRE);
		Registry.register(Registry.ITEM, new Identifier(Elements.MOD_ID, "sword_of_fire"), SOF);
		Registry.register(Registry.ITEM, new Identifier(Elements.MOD_ID, "water"), WATER);
		Registry.register(Registry.ITEM, new Identifier(Elements.MOD_ID, "sword_of_water"), SOW);
		Registry.register(Registry.ITEM, new Identifier(Elements.MOD_ID, "earth"), EARTH);
		Registry.register(Registry.ITEM, new Identifier(Elements.MOD_ID, "sword_of_earth"), SOE);
		Registry.register(Registry.ITEM, new Identifier(Elements.MOD_ID, "air"), AIR);
		Registry.register(Registry.ITEM, new Identifier(Elements.MOD_ID, "elemental_binding"), EB);
	}
}
