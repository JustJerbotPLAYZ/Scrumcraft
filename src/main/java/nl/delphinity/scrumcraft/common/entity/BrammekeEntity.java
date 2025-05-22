package nl.delphinity.scrumcraft.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;

public class BrammekeEntity extends HostileEntity {
    public BrammekeEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }
}
