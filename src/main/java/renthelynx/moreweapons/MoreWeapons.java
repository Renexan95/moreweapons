package renthelynx.moreweapons;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import renthelynx.moreweapons.item.MoreWeaponsGroup;
import renthelynx.moreweapons.item.MoreWeaponsItem;

public class MoreWeapons implements ModInitializer {
	public static final String MOD_ID = "moreweapons";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		MoreWeaponsItem.registerModItem();
		MoreWeaponsGroup.registerItemGroup();

		System.out.println(MOD_ID + " mod is being initialized!");
	}
}