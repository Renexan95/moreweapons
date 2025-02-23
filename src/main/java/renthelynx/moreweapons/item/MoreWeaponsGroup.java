package renthelynx.moreweapons.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import renthelynx.moreweapons.MoreWeapons;

public class MoreWeaponsGroup {

    public static final ItemGroup MOREWEAPONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreWeapons.MOD_ID, "moreweapons_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(MoreWeaponsItem.IRON_WARGLAIVE))
                    .displayName(Text.translatable("itemgroup.MoreWeapons.moreweapons_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(MoreWeaponsItem.ENFORCED_STICK);
                        entries.add(MoreWeaponsItem.DIAMOND_SHARD);
                        entries.add(MoreWeaponsItem.STONE_CHAKRAM);
                        entries.add(MoreWeaponsItem.STONE_CLAYMORE);
                        entries.add(MoreWeaponsItem.STONE_CUTLASS);
                        entries.add(MoreWeaponsItem.STONE_GLAVIE);
                        entries.add(MoreWeaponsItem.STONE_GREATAXE);
                        entries.add(MoreWeaponsItem.STONE_HALBERD);
                        entries.add(MoreWeaponsItem.STONE_KATANA);
                        entries.add(MoreWeaponsItem.STONE_LONGSWORD);
                        entries.add(MoreWeaponsItem.STONE_RAPIER);
                        entries.add(MoreWeaponsItem.STONE_SAI);
                        entries.add(MoreWeaponsItem.STONE_SCYTHE);
                        entries.add(MoreWeaponsItem.STONE_SPEAR);
                        entries.add(MoreWeaponsItem.STONE_TWINBLADE);
                        entries.add(MoreWeaponsItem.STONE_WARGLAIVE);
                        entries.add(MoreWeaponsItem.IRON_CHAKRAM);
                        entries.add(MoreWeaponsItem.IRON_CLAYMORE);
                        entries.add(MoreWeaponsItem.IRON_CUTLASS);
                        entries.add(MoreWeaponsItem.IRON_GLAVIE);
                        entries.add(MoreWeaponsItem.IRON_GREATAXE);
                        entries.add(MoreWeaponsItem.IRON_HALBERD);
                        entries.add(MoreWeaponsItem.IRON_KATANA);
                        entries.add(MoreWeaponsItem.IRON_LONGSWORD);
                        entries.add(MoreWeaponsItem.IRON_RAPIER);
                        entries.add(MoreWeaponsItem.IRON_SAI);
                        entries.add(MoreWeaponsItem.IRON_SCYTHE);
                        entries.add(MoreWeaponsItem.IRON_SPEAR);
                        entries.add(MoreWeaponsItem.IRON_TWINBLADE);
                        entries.add(MoreWeaponsItem.IRON_WARGLAIVE);
                        entries.add(MoreWeaponsItem.GOLD_CHAKRAM);
                        entries.add(MoreWeaponsItem.GOLD_CLAYMORE);
                        entries.add(MoreWeaponsItem.GOLD_CUTLASS);
                        entries.add(MoreWeaponsItem.GOLD_GLAVIE);
                        entries.add(MoreWeaponsItem.GOLD_GREATAXE);
                        entries.add(MoreWeaponsItem.GOLD_HALBERD);
                        entries.add(MoreWeaponsItem.GOLD_KATANA);
                        entries.add(MoreWeaponsItem.GOLD_LONGSWORD);
                        entries.add(MoreWeaponsItem.GOLD_RAPIER);
                        entries.add(MoreWeaponsItem.GOLD_SAI);
                        entries.add(MoreWeaponsItem.GOLD_SCYTHE);
                        entries.add(MoreWeaponsItem.GOLD_SPEAR);
                        entries.add(MoreWeaponsItem.GOLD_TWINBLADE);
                        entries.add(MoreWeaponsItem.GOLD_WARGLAIVE);
                        entries.add(MoreWeaponsItem.DIAMOND_CHAKRAM);
                        entries.add(MoreWeaponsItem.DIAMOND_CLAYMORE);
                        entries.add(MoreWeaponsItem.DIAMOND_CUTLASS);
                        entries.add(MoreWeaponsItem.DIAMOND_GLAVIE);
                        entries.add(MoreWeaponsItem.DIAMOND_GREATAXE);
                        entries.add(MoreWeaponsItem.DIAMOND_HALBERD);
                        entries.add(MoreWeaponsItem.DIAMOND_KATANA);
                        entries.add(MoreWeaponsItem.DIAMOND_LONGSWORD);
                        entries.add(MoreWeaponsItem.DIAMOND_RAPIER);
                        entries.add(MoreWeaponsItem.DIAMOND_SAI);
                        entries.add(MoreWeaponsItem.DIAMOND_SCYTHE);
                        entries.add(MoreWeaponsItem.DIAMOND_SPEAR);
                        entries.add(MoreWeaponsItem.DIAMOND_TWINBLADE);
                        entries.add(MoreWeaponsItem.DIAMOND_WARGLAIVE);
                        entries.add(MoreWeaponsItem.NETHERITE_CHAKRAM);
                        entries.add(MoreWeaponsItem.NETHERITE_CLAYMORE);
                        entries.add(MoreWeaponsItem.NETHERITE_CUTLASS);
                        entries.add(MoreWeaponsItem.NETHERITE_GLAVIE);
                        entries.add(MoreWeaponsItem.NETHERITE_GREATAXE);
                        entries.add(MoreWeaponsItem.NETHERITE_HALBERD);
                        entries.add(MoreWeaponsItem.NETHERITE_KATANA);
                        entries.add(MoreWeaponsItem.NETHERITE_LONGSWORD);
                        entries.add(MoreWeaponsItem.NETHERITE_RAPIER);
                        entries.add(MoreWeaponsItem.NETHERITE_SAI);
                        entries.add(MoreWeaponsItem.NETHERITE_SCYTHE);
                        entries.add(MoreWeaponsItem.NETHERITE_SPEAR);
                        entries.add(MoreWeaponsItem.NETHERITE_TWINBLADE);
                        entries.add(MoreWeaponsItem.NETHERITE_WARGLAIVE);
                    }).build());

    public static void registerItemGroup() {
        MoreWeapons.LOGGER.info("Registering Item Groups for" + MoreWeapons.MOD_ID);
    }
    
}
