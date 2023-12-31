package net.timeworndevs.culinarian;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.timeworndevs.culinarian.common.CommonBlockRegistry;
import net.timeworndevs.culinarian.common.CommonItemRegistry;
import net.timeworndevs.culinarian.common.CommonRecipeRegistry;
import net.timeworndevs.culinarian.common.CommonScreenHandlerRegistry;
import net.timeworndevs.culinarian.groups.CulinarianGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {

	public static final String MODID = "culinarian";

	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		CommonBlockRegistry.register();
		CommonItemRegistry.register();
		CulinarianGroups.register();
		CommonRecipeRegistry.register();
		CommonScreenHandlerRegistry.register();
	}
	public static Identifier id(String path) {
		return new Identifier(stringId(path));
	}
	public static String stringId(String path) {
		return MODID+":"+path;
	}
}
