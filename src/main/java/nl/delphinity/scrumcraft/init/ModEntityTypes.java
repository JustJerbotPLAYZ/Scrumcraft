package nl.delphinity.scrumcraft.init;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import nl.delphinity.scrumcraft.Scrumcraft;
import nl.delphinity.scrumcraft.common.entity.BallEntity;
import nl.delphinity.scrumcraft.common.entity.RubberDuckyEntity;

public class ModEntityTypes {
    public static final RegistryKey<EntityType<?>> RUBBER_DUCKY_ENTITY_KEY = RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(Scrumcraft.MOD_ID, "rubber_ducky_entity"));
    public static final EntityType<RubberDuckyEntity> RUBBER_DUCKY_ENTITY = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(Scrumcraft.MOD_ID, "rubber_ducky_entity"),
            EntityType.Builder.<RubberDuckyEntity>create(RubberDuckyEntity::new, SpawnGroup.MISC)
                    .build(RUBBER_DUCKY_ENTITY_KEY)
    );

    public static final RegistryKey<EntityType<?>> BALL_ENTITY_KEY = RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(Scrumcraft.MOD_ID, "ball_entity"));
    public static final EntityType<BallEntity> BALL_ENTITY = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(Scrumcraft.MOD_ID, "ball_entity"),
            EntityType.Builder.<BallEntity>create(BallEntity::new, SpawnGroup.MISC)
                    .build(BALL_ENTITY_KEY)
    );


    public static void init() {}
}