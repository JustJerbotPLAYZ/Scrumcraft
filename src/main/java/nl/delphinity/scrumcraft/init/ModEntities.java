package nl.delphinity.scrumcraft.init;

import com.nimbusds.oauth2.sdk.id.Identifier;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import nl.delphinity.scrumcraft.Scrumcraft;
import nl.delphinity.scrumcraft.common.entity.RensEntity;

public class ModEntities {
    public static final EntityType<RensEntity> RENS = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Scrumcraft.MOD_ID, "rens"),
            FabricEntityTypeBuilder.<RensEntity>create(SpawnGroup.CREATURE, RensEntity::new)
                    .dimensions(EntityDimensions.fixed(2f, 2f)).build());

}
