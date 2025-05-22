package nl.delphinity.scrumcraft.init;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import nl.delphinity.scrumcraft.Scrumcraft;
import nl.delphinity.scrumcraft.common.entity.BrammekeEntity;

public class ModEntities {

    public static final RegistryKey<EntityType<?>> BRAMMEKE_KEY = RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(Scrumcraft.MOD_ID, "brammeke"));
    public static final EntityType<BrammekeEntity> BRAMMEKE = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(Scrumcraft.MOD_ID, "brammeke"),
            EntityType.Builder.<BrammekeEntity>create(BrammekeEntity::new, SpawnGroup.MISC).dimensions(0.75f, 0.75f).build(BRAMMEKE_KEY)
    );

    public static void init() {}
}
