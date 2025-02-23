package renthelynx.moreweapons.item;

import net.minecraft.item.*;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import renthelynx.moreweapons.MoreWeapons;

public class MoreWeaponsItem {

    // Items registration
    // Essential for crafting
    public static final Item ENFORCED_STICK = registerItem("enforced_stick", new Item(new Item.Settings()));
    public static final Item DIAMOND_SHARD = registerItem("diamond_shard", new Item(new Item.Settings()));


    // Stone Set
    public static final Item STONE_CHAKRAM = registerItem("stone_chakram", new SwordItem(ToolMaterials.STONE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.STONE, 3, -2.0F))));
    public static final Item STONE_CLAYMORE = registerItem("stone_claymore", new SwordItem(ToolMaterials.STONE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.STONE, 6, -3.0F))));
    public static final Item STONE_CUTLASS = registerItem("stone_cutlass", new SwordItem(ToolMaterials.STONE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.STONE, 4, -2.2F))));
    public static final Item STONE_GLAVIE = registerItem("stone_glavie", new SwordItem(ToolMaterials.STONE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.STONE, 5, -2.5F))));
    public static final Item STONE_GREATAXE = registerItem("stone_greataxe", new SwordItem(ToolMaterials.STONE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.STONE, 8, -3.2F))));
    public static final Item STONE_HALBERD = registerItem("stone_halberd", new SwordItem(ToolMaterials.STONE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.STONE, 7, -3.0F))));
    public static final Item STONE_KATANA = registerItem("stone_katana", new SwordItem(ToolMaterials.STONE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.STONE, 5, -2.1F))));
    public static final Item STONE_LONGSWORD = registerItem("stone_rapier", new SwordItem(ToolMaterials.STONE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.STONE, 5, -2.2F))));
    public static final Item STONE_RAPIER = registerItem("stone_rapier", new SwordItem(ToolMaterials.STONE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.STONE, 3, -1.8F))));
    public static final Item STONE_SAI = registerItem("stone_sai", new SwordItem(ToolMaterials.STONE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.STONE, 2, -1.6F))));
    public static final Item STONE_SCYTHE = registerItem("stone_scythe", new SwordItem(ToolMaterials.STONE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.STONE, 6, -2.9F))));
    public static final Item STONE_SPEAR = registerItem("stone_spear", new SwordItem(ToolMaterials.STONE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.STONE, 5, -2.5F))));
    public static final Item STONE_TWINBLADE = registerItem("stone_twinblade", new SwordItem(ToolMaterials.STONE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.STONE, 4, -2.0F))));
    public static final Item STONE_WARGLAIVE = registerItem("stone_warglaive", new SwordItem(ToolMaterials.STONE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.STONE, 7, -3.1F))));

    // Iron set
    public static final Item IRON_CHAKRAM = registerItem("iron_chakram", new SwordItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, 3, -2.0F))));
    public static final Item IRON_CLAYMORE = registerItem("iron_claymore", new SwordItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, 6, -3.0F))));
    public static final Item IRON_CUTLASS = registerItem("iron_cutlass", new SwordItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, 4, -2.2F))));
    public static final Item IRON_GLAVIE = registerItem("iron_glavie", new SwordItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, 5, -2.5F))));
    public static final Item IRON_GREATAXE = registerItem("iron_greataxe", new SwordItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, 8, -3.2F))));
    public static final Item IRON_HALBERD = registerItem("iron_halberd", new SwordItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, 7, -3.0F))));
    public static final Item IRON_KATANA = registerItem("iron_katana", new SwordItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, 5, -2.1F))));
    public static final Item IRON_LONGSWORD = registerItem("iron_rapier", new SwordItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, 5, -2.2F))));
    public static final Item IRON_RAPIER = registerItem("iron_rapier", new SwordItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, 3, -1.8F))));
    public static final Item IRON_SAI = registerItem("iron_sai", new SwordItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, 2, -1.6F))));
    public static final Item IRON_SCYTHE = registerItem("iron_scythe", new SwordItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, 6, -2.9F))));
    public static final Item IRON_SPEAR = registerItem("iron_spear", new SwordItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, 5, -2.5F))));
    public static final Item IRON_TWINBLADE = registerItem("iron_twinblade", new SwordItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, 4, -2.0F))));
    public static final Item IRON_WARGLAIVE = registerItem("iron_warglaive", new SwordItem(ToolMaterials.IRON, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, 7, -3.1F))));

    // Gold set
    public static final Item GOLD_CHAKRAM = registerItem("gold_chakram", new SwordItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD, 3, -2.0F))));
    public static final Item GOLD_CLAYMORE = registerItem("gold_claymore", new SwordItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD, 6, -3.0F))));
    public static final Item GOLD_CUTLASS = registerItem("gold_cutlass", new SwordItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD, 4, -2.2F))));
    public static final Item GOLD_GLAVIE = registerItem("gold_glavie", new SwordItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD, 5, -2.5F))));
    public static final Item GOLD_GREATAXE = registerItem("gold_greataxe", new SwordItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD, 8, -3.2F))));
    public static final Item GOLD_HALBERD = registerItem("gold_halberd", new SwordItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD, 7, -3.0F))));
    public static final Item GOLD_KATANA = registerItem("gold_katana", new SwordItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD, 5, -2.1F))));
    public static final Item GOLD_LONGSWORD = registerItem("gold_rapier", new SwordItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD, 5, -2.2F))));
    public static final Item GOLD_RAPIER = registerItem("gold_rapier", new SwordItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD, 3, -1.8F))));
    public static final Item GOLD_SAI = registerItem("gold_sai", new SwordItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD, 2, -1.6F))));
    public static final Item GOLD_SCYTHE = registerItem("gold_scythe", new SwordItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD, 6, -2.9F))));
    public static final Item GOLD_SPEAR = registerItem("gold_spear", new SwordItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD, 5, -2.5F))));
    public static final Item GOLD_TWINBLADE = registerItem("gold_twinblade", new SwordItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD, 4, -2.0F))));
    public static final Item GOLD_WARGLAIVE = registerItem("gold_warglaive", new SwordItem(ToolMaterials.GOLD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD, 7, -3.1F))));

    // Diamond set
    public static final Item DIAMOND_CHAKRAM = registerItem("diamond_chakram", new SwordItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 3, -2.0F))));
    public static final Item DIAMOND_CLAYMORE = registerItem("diamond_claymore", new SwordItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 6, -3.0F))));
    public static final Item DIAMOND_CUTLASS = registerItem("diamond_cutlass", new SwordItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 4, -2.2F))));
    public static final Item DIAMOND_GLAVIE = registerItem("diamond_glavie", new SwordItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 5, -2.5F))));
    public static final Item DIAMOND_GREATAXE = registerItem("diamond_greataxe", new SwordItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 8, -3.2F))));
    public static final Item DIAMOND_HALBERD = registerItem("diamond_halberd", new SwordItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 7, -3.0F))));
    public static final Item DIAMOND_KATANA = registerItem("diamond_katana", new SwordItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 5, -2.1F))));
    public static final Item DIAMOND_LONGSWORD = registerItem("diamond_rapier", new SwordItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 5, -2.2F))));
    public static final Item DIAMOND_RAPIER = registerItem("diamond_rapier", new SwordItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 3, -1.8F))));
    public static final Item DIAMOND_SAI = registerItem("diamond_sai", new SwordItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 2, -1.6F))));
    public static final Item DIAMOND_SCYTHE = registerItem("diamond_scythe", new SwordItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 6, -2.9F))));
    public static final Item DIAMOND_SPEAR = registerItem("diamond_spear", new SwordItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 5, -2.5F))));
    public static final Item DIAMOND_TWINBLADE = registerItem("diamond_twinblade", new SwordItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 4, -2.0F))));
    public static final Item DIAMOND_WARGLAIVE = registerItem("diamond_warglaive", new SwordItem(ToolMaterials.DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 7, -3.1F))));

    // Netherite set
    public static final Item NETHERITE_CHAKRAM = registerItem("netherite_chakram", new SwordItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.0F))));
    public static final Item NETHERITE_CLAYMORE = registerItem("netherite_claymore", new SwordItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 6, -3.0F))));
    public static final Item NETHERITE_CUTLASS = registerItem("netherite_cutlass", new SwordItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 4, -2.2F))));
    public static final Item NETHERITE_GLAVIE = registerItem("netherite_glavie", new SwordItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 5, -2.5F))));
    public static final Item NETHERITE_GREATAXE = registerItem("netherite_greataxe", new SwordItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 8, -3.2F))));
    public static final Item NETHERITE_HALBERD = registerItem("netherite_halberd", new SwordItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 7, -3.0F))));
    public static final Item NETHERITE_KATANA = registerItem("netherite_katana", new SwordItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 8, -2.1F))));

    public static final Item NETHERITE_LONGSWORD = registerItem("netherite_rapier", new SwordItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 8, -2.2F))));
    public static final Item NETHERITE_RAPIER = registerItem("netherite_rapier", new SwordItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 6, -1.8F))));
    public static final Item NETHERITE_SAI = registerItem("netherite_sai", new SwordItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 5, -1.6F))));
    public static final Item NETHERITE_SCYTHE = registerItem("netherite_scythe", new SwordItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 9, -2.9F))));
    public static final Item NETHERITE_SPEAR = registerItem("netherite_spear", new SwordItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 8, -2.5F))));
    public static final Item NETHERITE_TWINBLADE = registerItem("netherite_twinblade", new SwordItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 7, -2.0F))));
    public static final Item NETHERITE_WARGLAIVE = registerItem("netherite_warglaive", new SwordItem(ToolMaterials.NETHERITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 10, -3.1F))));



    // Core stuff
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoreWeapons.MOD_ID, name), item);
    }

    public static void registerModItem() {
        MoreWeapons.LOGGER.info("Registering Mod Items for " + MoreWeapons.MOD_ID);

    }
}
