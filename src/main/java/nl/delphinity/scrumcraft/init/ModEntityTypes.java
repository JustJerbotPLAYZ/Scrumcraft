package nl.delphinity.scrumcraft.init;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import nl.delphinity.scrumcraft.Scrumcraft;
import nl.delphinity.scrumcraft.common.entity.RubberDuckyEntity;

public class ModEntityTypes {
    public static final RegistryKey<EntityType<?>> RUBBER_DUCKY_ENTITY_KEY = RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(Scrumcraft.MOD_ID, "rubber_ducky_entity"));
    public static final EntityType<RubberDuckyEntity> RUBBER_DUCKY_ENTITY = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(Scrumcraft.MOD_ID),
            EntityType.Builder.create(RubberDuckyEntity::new, SpawnGroup.MISC)
                    .dropsNothing()
                    .dimensions(0.25f, 0.25f)
                    .maxTrackingRange(4)
                    .trackingTickInterval(20)
                    .build(RUBBER_DUCKY_ENTITY_KEY)
    );

    public static void init() {}
}
